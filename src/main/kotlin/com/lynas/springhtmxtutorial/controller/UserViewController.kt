package com.lynas.springhtmxtutorial.controller

import com.lynas.springhtmxtutorial.repo.User
import com.lynas.springhtmxtutorial.repo.userList
import io.github.wimdeblauwe.hsbt.mvc.HxRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
    @RequestMapping("/views/users")
class UserViewController {


    @GetMapping("/createUserForm")
    @HxRequest
    fun createUserForm(): String {
        return "components/users/createUserForm"
    }

    @GetMapping("/userList")
    @HxRequest
    fun userList(model: Model): String {
        model.addAttribute("users", userList)
        return "components/users/userList"
    }

    @GetMapping("/byId/{userId}")
    fun getUserById(@PathVariable userId: String, model: Model): String {
        println(userId)
        model.addAttribute(
            "user",
            userList.find { it.id == userId }
                ?: User(name = "Not Found"))
        return "components/users/userDetails"
    }
}