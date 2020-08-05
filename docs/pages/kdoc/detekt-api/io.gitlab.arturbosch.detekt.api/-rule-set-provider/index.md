---
title: RuleSetProvider -
---
//[detekt-api](../../index.md)/[io.gitlab.arturbosch.detekt.api](../index.md)/[RuleSetProvider](index.md)



# RuleSetProvider  
 [jvm] A rule set provider, as the name states, is responsible for creating rule sets.When writing own rule set providers make sure to register them according the ServiceLoader documentation. http://docs.oracle.com/javase/8/docs/api/java/util/ServiceLoader.html  
  
interface [RuleSetProvider](index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [buildRuleset](build-ruleset.md)| [jvm]  <br>Brief description  <br>Can return a rule set if this specific rule set is not considered as ignore.Api notice: As the rule set id is not known before creating the rule set instance, we must first create the rule set and then check if it is active.  <br>Content  <br>~~open~~ ~~fun~~ [~~buildRuleset~~](build-ruleset.md)~~(~~~~config~~~~:~~ [Config](../-config/index.md)~~)~~~~:~~ [RuleSet](../-rule-set/index.md)?  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [instance](instance.md)| [jvm]  <br>Brief description  <br>This function must be implemented to provide custom rule sets. Make sure to pass the configuration to each rule to allow rules to be self configurable.  <br>Content  <br>abstract fun [instance](instance.md)(config: [Config](../-config/index.md)): [RuleSet](../-rule-set/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [ruleSetId](index.md#io.gitlab.arturbosch.detekt.api/RuleSetProvider/ruleSetId/#/PointingToDeclaration/)|  [jvm] Every rule set must be pre-configured with an ID to validate if this rule set must be created for current analysis.abstract val [ruleSetId](index.md#io.gitlab.arturbosch.detekt.api/RuleSetProvider/ruleSetId/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>


## Inheritors  
  
|  Name| 
|---|
| [DefaultRuleSetProvider](../../io.gitlab.arturbosch.detekt.api.internal/-default-rule-set-provider/index.md)

