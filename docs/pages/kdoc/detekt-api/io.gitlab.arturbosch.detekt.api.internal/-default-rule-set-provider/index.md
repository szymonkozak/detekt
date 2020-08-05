---
title: DefaultRuleSetProvider -
---
//[detekt-api](../../index.md)/[io.gitlab.arturbosch.detekt.api.internal](../index.md)/[DefaultRuleSetProvider](index.md)



# DefaultRuleSetProvider  
 [jvm] Interface which marks sub-classes as provided by detekt via the rules sub-module.Allows to implement "--disable-default-rulesets" effectively without the need to manage a list of rule set names.  
  
interface [DefaultRuleSetProvider](index.md) : [RuleSetProvider](../../io.gitlab.arturbosch.detekt.api/-rule-set-provider/index.md)   


## Functions  
  
|  Name|  Summary| 
|---|---|
| [buildRuleset](../../io.gitlab.arturbosch.detekt.api/-rule-set-provider/build-ruleset.md)| [jvm]  <br>Brief description  <br>Can return a rule set if this specific rule set is not considered as ignore.Api notice: As the rule set id is not known before creating the rule set instance, we must first create the rule set and then check if it is active.  <br>Content  <br>~~open~~ ~~override~~ ~~fun~~ [~~buildRuleset~~](../../io.gitlab.arturbosch.detekt.api/-rule-set-provider/build-ruleset.md)~~(~~~~config~~~~:~~ [Config](../../io.gitlab.arturbosch.detekt.api/-config/index.md)~~)~~~~:~~ [RuleSet](../../io.gitlab.arturbosch.detekt.api/-rule-set/index.md)?  <br><br><br>
| [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)| [jvm]  <br>Content  <br>open operator override fun [equals](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/equals.html)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>
| [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)| [jvm]  <br>Content  <br>open override fun [hashCode](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/hash-code.html)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>
| [instance](../../io.gitlab.arturbosch.detekt.api/-rule-set-provider/instance.md)| [jvm]  <br>Brief description  <br>This function must be implemented to provide custom rule sets. Make sure to pass the configuration to each rule to allow rules to be self configurable.  <br>Content  <br>abstract override fun [instance](../../io.gitlab.arturbosch.detekt.api/-rule-set-provider/instance.md)(config: [Config](../../io.gitlab.arturbosch.detekt.api/-config/index.md)): [RuleSet](../../io.gitlab.arturbosch.detekt.api/-rule-set/index.md)  <br><br><br>
| [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)| [jvm]  <br>Content  <br>open override fun [toString](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/to-string.html)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br><br><br>


## Properties  
  
|  Name|  Summary| 
|---|---|
| [ruleSetId](index.md#io.gitlab.arturbosch.detekt.api.internal/DefaultRuleSetProvider/ruleSetId/#/PointingToDeclaration/)|  [jvm] Every rule set must be pre-configured with an ID to validate if this rule set must be created for current analysis.abstract override val [ruleSetId](index.md#io.gitlab.arturbosch.detekt.api.internal/DefaultRuleSetProvider/ruleSetId/#/PointingToDeclaration/): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>

