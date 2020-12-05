package NicknameMacker

import scala.util.Random

class NicknameMaker(var wordPool: WordPool) {
  def generateNickName(usingWordNum: Int): Nickname = {

    val r = new Random()

    var words: Array[String] = Array()

    for (i <- Range(0, usingWordNum)) {
      words :+= wordPool.word(r.nextInt(wordPool.storedNum()))
    }

    new Nickname(words.mkString(""))
  }
}

