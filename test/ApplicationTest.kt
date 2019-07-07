package bucket

import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*
import main.kotlin.module

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ module() }) {
            with(handleRequest(HttpMethod.Get, "/")) {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }
}
