package knoldus.Ques3.validator

import knoldus.Ques3.models.Employee
import org.scalatest.flatspec.AnyFlatSpec

class EmployeeValidatorTest extends AnyFlatSpec {
  val userValidator:EmployeeValidator=new EmployeeValidator()


  it should "be valid as its company exist in database and the email id is also written in correct format" in{
    val employee:Employee= Employee("Jubair","Ahmad",24,15000.00,"Intern","Knoldus", "knoldus@gmail.com")
    assert(userValidator.employeeIsValid(employee))
  }

  it should "not be valid as its company does not exist in database and the email id is also invalid" in{
    val user:Employee= Employee("Jubai","Ahma",23,15030.00,"Intern","knoldus","jubair@gmail.com")
    assert(!userValidator.employeeIsValid(user))
  }

  it should "not be valid as its email id is invalid" in{
    val employee= Employee("Jubair","khan",24,15000.00,"Intern","knol","ahmadjubair@gmail.com")
    assert(!userValidator.employeeIsValid(employee))
  }

  it should "not be valid as its company does not exist in database" in{
    val employee:Employee= Employee("Jubair","Ahmad",24,15000.00,"Intern","knoldus","ahmad@gmail.com")
    assert(!userValidator.employeeIsValid(employee))
  }
}