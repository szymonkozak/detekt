---
title: OutputReport -
---
//[detekt-api](../../index.md)/[io.gitlab.arturbosch.detekt.api](../index.md)/[OutputReport](index.md)



# OutputReport  
 [jvm] Translates detekt's result container - [Detektion](../-detektion/index.md) - into an output report which is written inside a file.  
  
abstract class [OutputReport](index.md) : [Extension](../-extension/index.md)   


## Constructors  
  
|  Name|  Summary| 
|---|---|
| [<init>](-init-.md)|  [jvm] fun [<init>](-init-.md)()   <br>


## Functions  
  
|  Name|  Summary| 
|---|---|
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [init](../-extension/init.md)| [jvm]  <br>Brief description  <br>Allows to read any or even user defined properties from the detekt yaml config to setup this extension.  <br>Content  <br>open override fun [init](../-extension/init.md)(config: [Config](../-config/index.md))  <br><br><br>[jvm]  <br>Brief description  <br>Setup extension by querying common paths and config options.  <br>Content  <br>open override fun [init](../-extension/init.md)(context: [SetupContext](../-setup-context/index.md))  <br><br><br>
| [render](render.md)| [jvm]  <br>Brief description  <br>Defines the translation process of detekt's result into a string.  <br>Content  <br>abstract fun [render](render.md)(detektion: [Detektion](../-detektion/index.md)): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>
| [write](write.md)| [jvm]  <br>Brief description  <br>Renders result and writes it to the given [filePath]().  <br>Content  <br>fun [write](write.md)(filePath: [Path](https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html), detektion: [Detektion](../-detektion/index.md))  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [ending](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/ending/#/PointingToDeclaration/)|  [jvm] Supported ending of this report type.abstract val [ending](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/ending/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [id](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/id/#/PointingToDeclaration/)|  [jvm] Name of the extension.open override val [id](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/id/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>
| [name](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/name/#/PointingToDeclaration/)|  [jvm] Name of the report. Is used to exclude this report in the yaml config.open val [name](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/name/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?   <br>
| [priority](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/priority/#/PointingToDeclaration/)|  [jvm] Is used to run extensions in a specific order. The higher the priority the sooner the extension will run in detekt's lifecycle.open override val [priority](index.md#io.gitlab.arturbosch.detekt.api/OutputReport/priority/#/PointingToDeclaration/): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>

