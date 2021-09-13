package knoldus.Ques3.validator

import knoldus.Ques3.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends  AnyFlatSpec{

  val companyValidator = new CompanyValidator()


  "Company" should "be valid" in {
    val test: Company = Company("hayabusa","wwer@haya.com","Gurgaon")

    val testResult = companyValidator.companyIsValid(test)

    assert(testResult)

  }

  "Company" should "not be valid as it already exist in DB" in {
    val companyTesting: Company = Company("Knoldus","you@hhh.com","Gurgaon")

    val testResult = companyValidator.companyIsValid(companyTesting)

    assert(!testResult)

  }

}
