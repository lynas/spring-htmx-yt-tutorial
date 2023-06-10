package com.lynas.springhtmxtutorial.controller

import com.lynas.springhtmxtutorial.repo.userList
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HomeController {
    @GetMapping
    fun home(model: Model): String {
        model.addAttribute("users", userList)
        return "home"
    }
}