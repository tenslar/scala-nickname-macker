package NicknameMacker

class Nickname(var nickname: String) {
  if (nickname.isEmpty) {
    throw new Exception("Nickname is Empty!")
  }

  override def toString: String = {
    s"$nickname"
  }
}
