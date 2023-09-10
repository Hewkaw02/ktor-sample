package com.hewdev.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {

    routing {
        route("/api") {
            route("/user"){

            }
            route("/menu"){

            }
            route("/bill"){

            }
            route("/restaurant"){

            }
            route("/order"){

            }
            route("/orderitem"){

            }
        }
    }
}
