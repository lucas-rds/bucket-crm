package main.kotlin

import io.ktor.application.*
import io.ktor.server.jetty.EngineMain
import main.kotlin.config.applyWebConfig
import main.kotlin.routes.applyRoutes

fun main(args: Array<String>) {
    EngineMain.main(args)
}

fun Application.module() {
    applyWebConfig()
    applyRoutes()
}

