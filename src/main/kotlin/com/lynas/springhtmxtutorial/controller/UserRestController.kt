package com.lynas.springhtmxtutorial.controller

import com.lynas.springhtmxtutorial.repo.User
import com.lynas.springhtmxtutorial.repo.userList
import io.github.wimdeblauwe.hsbt.mvc.HxTrigger
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserRestController {

    @PostMapping("/validateName")
    fun validateUserName(@RequestParam name: String): String {
        println(name)
//        Thread.sleep(5000)
        return if (name.length < 3) "Invalid input" else ""
    }

    @PostMapping
    @HxTrigger("refreshUserList")
    fun createNewUser(
        @ModelAttribute user: User,
    ): String {
        userList.add(user)
        println(userList)
        return user.toString()
    }
}