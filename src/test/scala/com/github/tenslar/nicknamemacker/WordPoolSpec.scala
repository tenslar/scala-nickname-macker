package com.github.tenslar.nicknamemacker

import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

class WordPoolSpec extends AnyFlatSpec with Diagrams {
  val word_pool = new WordPool(Array("foo", "baa"))

  "WordPool" should "プールされている文字数がわかる" in {
    assert(word_pool.storedNum() == 2)
  }

  "WordPool" should "プールされた文字を取れる" in {
    assert(word_pool.word(1) == "baa")
  }

  "WordPool" should "存在しないindexの文字を取ると空文字が返る" in {
    assert(word_pool.word(2) == "")
  }
}
