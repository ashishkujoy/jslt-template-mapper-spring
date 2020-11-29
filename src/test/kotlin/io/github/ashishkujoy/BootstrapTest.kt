package io.github.ashishkujoy

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.spring.SpringListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(classes = [Bootstrap::class])
class BootstrapTest : FunSpec() {
    override fun listeners() = listOf(SpringListener)

    @Autowired
    private lateinit var bootstrap: Bootstrap

    init {
        test("a bootstrap test to greet") {
            bootstrap.greet() shouldBe "Hello world"
        }
    }
}