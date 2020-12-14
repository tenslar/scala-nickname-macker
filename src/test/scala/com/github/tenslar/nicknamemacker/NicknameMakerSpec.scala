package NicknameMacker

import com.github.tenslar.nicknamemacker.{Nickname, NicknameMaker, WordPool}
import org.scalatest.flatspec.AnyFlatSpec

class NicknameMakerSpec extends AnyFlatSpec {

  val nickname_maker = new NicknameMaker(new WordPool(Array("foo")))

  "NicknameMaker" should "指定した単語数を組み合わせたニックネームを生成できる" in {
    assert(nickname_maker.generateNickName(2).toString() == new Nickname("foofoo").toString())
  }
}
