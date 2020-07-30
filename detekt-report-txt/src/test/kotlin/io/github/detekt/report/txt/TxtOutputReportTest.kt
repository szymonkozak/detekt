package io.github.detekt.report.txt

import io.gitlab.arturbosch.detekt.test.TestDetektion
import io.gitlab.arturbosch.detekt.test.createFinding
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class TxtOutputReportTest {

    @Test
    fun `render none`() {
        val report = TxtOutputReport()
        val detektion = TestDetektion()
        val renderedText = ""
        Assertions.assertThat(report.render(detektion)).isEqualTo(renderedText)
    }

    @Test
    fun `render one`() {
        val report = TxtOutputReport()
        val detektion = TestDetektion(createFinding())
        val renderedText = "TestSmell - [TestEntity] at TestFile.kt:1:1 - Signature=TestEntitySignature\n"
        Assertions.assertThat(report.render(detektion)).isEqualTo(renderedText)
    }

    @Test
    fun `render multiple`() {
        val report = TxtOutputReport()
        val detektion = TestDetektion(
            createFinding(ruleName = "TestSmellA"),
            createFinding(ruleName = "TestSmellB"),
            createFinding(ruleName = "TestSmellC"))
        val renderedText = """
                TestSmellA - [TestEntity] at TestFile.kt:1:1 - Signature=TestEntitySignature
                TestSmellB - [TestEntity] at TestFile.kt:1:1 - Signature=TestEntitySignature
                TestSmellC - [TestEntity] at TestFile.kt:1:1 - Signature=TestEntitySignature

            """.trimIndent()
        Assertions.assertThat(report.render(detektion)).isEqualTo(renderedText)
    }
}
