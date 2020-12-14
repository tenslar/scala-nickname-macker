package NicknameMacker

import com.github.tenslar.nicknamemacker.Nickname
import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpec

class NicknameSpec extends AnyFlatSpec with Diagrams {
  val test_nickname = "test-name"
  "Nickname" should "ニックネームを保持する" in {
    val nickname = new Nickname(test_nickname)
    assert(nickname.toString() === test_nickname)
  }

  "Nickname" should "無名は許可しない" in {
    intercept[Exception] {
      new Nickname("")
    }
  }
}
