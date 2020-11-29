package io.github.ashishkujoy

import org.springframework.boot.builder.SpringApplicationBuilder

class TestApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplicationBuilder(TestApplication::class.java).run(*args)
        }
    }
}