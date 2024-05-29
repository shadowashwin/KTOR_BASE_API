package com.example.plugins

import com.example.Models.UserModel
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/user"){
            call.respond(UserModel(1,"Ashwin"))
        }
        post("/user/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            call.respond("$id")
        }
    }
}
