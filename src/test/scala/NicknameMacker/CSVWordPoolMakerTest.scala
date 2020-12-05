package NicknameMacker

import java.io.File

import org.scalatest.flatspec.AnyFlatSpec

class CSVWordPoolMakerTest extends AnyFlatSpec {
  val csv_wordpool_maker = new CSVWordPoolMaker

  "CSVWordPoolMaker" should "CSVからWordPoolを生成する" in {
    val wordpool = csv_wordpool_maker.make(new File("src/test/scala/NicknameMacker/testwords.csv").getAbsolutePath)
    assert(wordpool.storedNum() == 3)
    assert(wordpool.word(0) == "愛煙家")
    assert(wordpool.word(2) == "合図")
    assert(wordpool.word(3) == "")
  }
}
