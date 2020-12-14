# NickNameMacker

[![tenslar](https://circleci.com/gh/tenslar/scala-nickname-macker.svg?style=svg)](https://app.circleci.com/pipelines/github/tenslar/scala-nickname-macker)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

Simple nick-name maker.

When a "WordPool" with multiple characters is passed to the nickname generator "NickNameMaker", it will generate a nickname using the characters set in the WordPool.

# Usage

```scala
import com.github.tenslar.nicknamemacker._

val word_pool = new WordPool(Array("hello", "world"))
val generator = new NicknameMaker(word_pool)

println(generator.generateNickName(2))
// worldworld or hellohello or helloworld ...
```