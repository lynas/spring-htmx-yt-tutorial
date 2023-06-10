package com.lynas.springhtmxtutorial.repo

import java.util.*

data class User(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val age: Int = 0,
    val location: String = ""
)

var userList = mutableListOf(
    User(name = "John Doe", age = 34, location = "Dhaka"),
    User(name = "Max Payne", age = 65, location = "New York"),
    User(name = "Uzumaki Naruto", age = 17, location = "Munich"),
    User(name = "John Constantine", age = 45, location = "London"),
)