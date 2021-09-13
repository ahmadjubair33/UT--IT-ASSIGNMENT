package knoldus.Ques1

import org.scalatest.flatspec.AnyFlatSpec

class ValidatorTest extends AnyFlatSpec {
  val Email = new EmailValidator

    "Email" should "be valid" in {
      val result = Email.emailIdIsValid("jubair@ahmad.com")
      assert(result)
    }

    "Email Id" should "be Valid alphanumeric domain" in {
      val result = Email.emailIdIsValid( "jubair@example12.net")
      assert(result)
    }

    "Email Id with wrong Recipient name" should "be invalid" in {
      val result = Email.emailIdIsValid( "@@jubair@yahoo.net")
      assert(!result)
    }

    "Email Id missing @ symbol" should "be invalid" in {
      val result = Email.emailIdIsValid("jubair.com")
      assert(!result)
    }
    "Email Id with wrong domain name" should "be invalid" in {
      val result =Email.emailIdIsValid("jubair!yahoo.com")
      assert(!result)
    }
    "Email Id with wrong Top_Level Domain Name" should "be invalid" in {
      val result = Email.emailIdIsValid("jubair@yahoo.ccom")
      assert(!result)
    }
  }

