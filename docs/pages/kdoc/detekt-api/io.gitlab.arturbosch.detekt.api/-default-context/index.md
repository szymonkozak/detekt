---
title: DefaultContext -
---
//[detekt-api](../../index.md)/[io.gitlab.arturbosch.detekt.api](../index.md)/[DefaultContext](index.md)



# DefaultContext  
 [jvm] Default [Context](../-context/index.md) implementation.  
  
open class [DefaultContext](index.md) : [Context](../-context/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [jvm] fun [<init>](-init-.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [clearFindings](clear-findings.md)| [jvm]  <br>Brief description  <br>Clears previous findings. Normally this is done on every new [KtFile]() analyzed and should be called by clients.  <br>Content  <br>override fun [clearFindings](clear-findings.md)()  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [report](report.md)| [jvm]  <br>Brief description  <br>Reports a single code smell finding.Before adding a finding, it is checked if it is not suppressed by @Suppress or @SuppressWarnings annotations.  <br>Content  <br>open override fun [report](report.md)(finding: [Finding](../-finding/index.md), aliases: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, ruleSetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>[jvm]  <br>Brief description  <br>Reports a list of code smell findings.Before adding a finding, it is checked if it is not suppressed by @Suppress or @SuppressWarnings annotations.  <br>Content  <br>open override fun [report](report.md)(findings: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Finding](../-finding/index.md)>, aliases: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>, ruleSetId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?)  <br><br><br>[jvm]  <br>Brief description  <br>Reports a single new violation.  <br>Content  <br>open override fun [report](report.md)(finding: [Finding](../-finding/index.md), aliases: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br><br><br>[jvm]  <br>Brief description  <br>Same as [report](report.md) but reports a list of findings.  <br>Content  <br>open override fun [report](report.md)(findings: [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Finding](../-finding/index.md)>, aliases: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)>)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [findings](index.md#io.gitlab.arturbosch.detekt.api/DefaultContext/findings/#/PointingToDeclaration/)|  [jvm] Returns a copy of violations for this rule.open override val [findings](index.md#io.gitlab.arturbosch.detekt.api/DefaultContext/findings/#/PointingToDeclaration/): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Finding](../-finding/index.md)>   <br>

