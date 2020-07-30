@file:Suppress("MaxLineLength")

package io.github.detekt.report.xml

import io.gitlab.arturbosch.detekt.api.CodeSmell
import io.gitlab.arturbosch.detekt.api.Debt
import io.gitlab.arturbosch.detekt.api.Entity
import io.gitlab.arturbosch.detekt.api.Issue
import io.gitlab.arturbosch.detekt.api.Location
import io.gitlab.arturbosch.detekt.api.Severity
import io.gitlab.arturbosch.detekt.api.SourceLocation
import io.gitlab.arturbosch.detekt.api.TextLocation
import io.gitlab.arturbosch.detekt.test.TestDetektion
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory

class XmlOutputFormatTest {

    val entity1 = Entity("Sample1", "com.sample.Sample1", "",
        Location(SourceLocation(11, 1), TextLocation(0, 10),
            "abcd", "src/main/com/sample/Sample1.kt"))
    val entity2 = Entity("Sample2", "com.sample.Sample2", "",
        Location(SourceLocation(22, 2), TextLocation(0, 20),
            "efgh", "src/main/com/sample/Sample2.kt"))

    val outputFormat = XmlOutputReport()

    @Test
    fun renderEmpty() {
        val result = outputFormat.render(TestDetektion())

        assertThat(result).isEqualTo("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<checkstyle version=\"4.3\">\n</checkstyle>")
    }

    @Test
    fun renderOneForSingleFile() {
        val smell = CodeSmell(Issue("id_a", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity1, message = "")

        val result = outputFormat.render(TestDetektion(smell))

        assertThat(result).isEqualTo("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<checkstyle version=\"4.3\">\n<file name=\"src/main/com/sample/Sample1.kt\">\n\t<error line=\"11\" column=\"1\" severity=\"warning\" message=\"\" source=\"detekt.id_a\" />\n</file>\n</checkstyle>")
    }

    @Test
    fun renderTwoForSingleFile() {
        val smell1 = CodeSmell(Issue("id_a", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity1, message = "")
        val smell2 = CodeSmell(Issue("id_b", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity1, message = "")

        val result = outputFormat.render(TestDetektion(smell1, smell2))

        assertThat(result).isEqualTo("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<checkstyle version=\"4.3\">\n<file name=\"src/main/com/sample/Sample1.kt\">\n\t<error line=\"11\" column=\"1\" severity=\"warning\" message=\"\" source=\"detekt.id_a\" />\n\t<error line=\"11\" column=\"1\" severity=\"warning\" message=\"\" source=\"detekt.id_b\" />\n</file>\n</checkstyle>")
    }

    @Test
    fun renderOneForMultipleFiles() {
        val smell1 = CodeSmell(Issue("id_a", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity1, message = "")
        val smell2 = CodeSmell(Issue("id_a", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity2, message = "")

        val result = outputFormat.render(TestDetektion(smell1, smell2))

        assertThat(result).isEqualTo("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<checkstyle version=\"4.3\">\n<file name=\"src/main/com/sample/Sample1.kt\">\n\t<error line=\"11\" column=\"1\" severity=\"warning\" message=\"\" source=\"detekt.id_a\" />\n</file>\n<file name=\"src/main/com/sample/Sample2.kt\">\n\t<error line=\"22\" column=\"2\" severity=\"warning\" message=\"\" source=\"detekt.id_a\" />\n</file>\n</checkstyle>")
    }

    @Test
    fun renderTwoForMultipleFiles() {
        val smell1 = CodeSmell(Issue("id_a", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity1, message = "")
        val smell2 = CodeSmell(Issue("id_b", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity1, message = "")
        val smell3 = CodeSmell(Issue("id_a", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity2, message = "")
        val smell4 = CodeSmell(Issue("id_b", Severity.CodeSmell, "", Debt.TWENTY_MINS), entity2, message = "")

        val result = outputFormat.render(
            TestDetektion(
                smell1,
                smell2,
                smell3,
                smell4
            )
        )

        assertThat(result).isEqualTo("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<checkstyle version=\"4.3\">\n<file name=\"src/main/com/sample/Sample1.kt\">\n\t<error line=\"11\" column=\"1\" severity=\"warning\" message=\"\" source=\"detekt.id_a\" />\n\t<error line=\"11\" column=\"1\" severity=\"warning\" message=\"\" source=\"detekt.id_b\" />\n</file>\n<file name=\"src/main/com/sample/Sample2.kt\">\n\t<error line=\"22\" column=\"2\" severity=\"warning\" message=\"\" source=\"detekt.id_a\" />\n\t<error line=\"22\" column=\"2\" severity=\"warning\" message=\"\" source=\"detekt.id_b\" />\n</file>\n</checkstyle>")
    }

    fun mapSeverityLabel(severity: Severity) = when (severity) {
        Severity.CodeSmell,
        Severity.Style,
        Severity.Warning,
        Severity.Maintainability,
        Severity.Performance -> "warning"
        Severity.Defect -> "error"
        Severity.Minor -> "info"
        Severity.Security -> "fatal"
    }

    @TestFactory
    fun `severities conversion`(): Collection<DynamicTest> {
        return Severity.values().map { severity ->
            val severityLabel = mapSeverityLabel(severity)
            DynamicTest.dynamicTest("renders detektion with severity [${severity.name}] as XML with severity [$severityLabel]") {
                val finding = CodeSmell(
                    issue = Issue("issue_id", severity, "issue description", Debt.FIVE_MINS),
                    message = "message",
                    entity = entity1
                )

                val expected = """
                    <?xml version="1.0" encoding="utf-8"?>
                    <checkstyle version="4.3">
                    <file name="${finding.location.file}">
                    ${"\t"}<error line="${finding.location.source.line}" column="${finding.location.source.column}" severity="$severityLabel" message="${finding.messageOrDescription()}" source="detekt.${finding.id}" />
                    </file>
                    </checkstyle>
                    """

                val actual = outputFormat.render(TestDetektion(finding))

                assertThat(actual).isEqualTo(expected.trimIndent())
            }
        }
    }
}
