package com.github.tenslar.nicknamemacker

import org.scalatest.flatspec.AnyFlatSpec

import java.io.File

class CSVWordPoolMakerTest extends AnyFlatSpec {
  val csv_wordpool_maker = new CSVWordPoolMaker

  "CSVWordPoolMaker" should "CSVからWordPoolを生成する" in {
    val wordpool = csv_wordpool_maker.make(new File("src/test/resouces/testwords.csv").getAbsolutePath)
    assert(wordpool.storedNum() == 3)
    assert(wordpool.word(0) == "愛煙家")
    assert(wordpool.word(2) == "合図")
    assert(wordpool.word(3) == "")
  }
}
