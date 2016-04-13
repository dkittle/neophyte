package chapter1

class UserSpec extends FlatSpec with Matchers {

  "A user's name" should "be extracted" in {
    def extract(user: User): String = user match {
      case FreeUser(name) => s"Hello ${name}"
    }
    extract(new FreeUser("Alfred")) should be ("Alfred")
  }

}
