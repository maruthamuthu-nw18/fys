package com.nw18.moneycontrol

import io.ktor.server.application.*
import com.nw18.moneycontrol.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.jetty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureRouting()
}
