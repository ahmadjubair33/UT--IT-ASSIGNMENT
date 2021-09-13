package knoldus.Ques3.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {
  val emailValidator = new EmailValidator();

  //  Email Validation
  "User email Id " should "be valid " in {
    val result = emailValidator.emailIdIsValid("ahmadjubair33@gmail.com")
    assert(result)
  }

  "User email Id " should "be valid as it contains alphanumeric recipient name" in {
    val result = emailValidator.emailIdIsValid("jubairahmad123@knoldus.com")
    assert(result)
  }

  "Email Id without @" should "be invalid " in {
    val result = emailValidator.emailIdIsValid("juabir.com")
    assert(!result)
  }

  "Email Id with alphanumeric domain name" should "be valid " in {
    val result = emailValidator.emailIdIsValid("ahmad@knodus22.com")
    assert(result)
  }

  "Email id" should "not be valid as it contains invalid top lavel domain" in {
    val result = emailValidator.emailIdIsValid("jubairahmad.knoldus")
    assert(!result)
  }
}
