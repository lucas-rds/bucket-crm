package main.kotlin.routes

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.routing

fun Routing.applyRootRoute() {
    get("/health_check") { call.respondText("OK") }
    get("/") {
        call.respond(FreeMarkerContent("index.ftl", mapOf("data" to listOf(1, 2, 3)), ""))
    }
}

fun Application.applyRoutes() {
    routing {
        applyRootRoute()
        static("/static") {
            resources("static")
        }
    }
}
