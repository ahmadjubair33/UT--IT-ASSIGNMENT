package knoldus.Ques3.validator


import knoldus.Ques3.db.CompanyReadDto
import knoldus.Ques3.models.{Company, Employee}

class EmployeeValidator {

  def employeeIsValid(employee: Employee): Boolean =  {
    // company should exist in db


    val companyReadDto = new CompanyReadDto()
    val dbResult: Option[Company] = companyReadDto.getCompanyByName(employee.companyName)

    if (dbResult.isDefined)
      return true
    false
  }


  // email should be valid
  def isValidEmail(user: Employee): Boolean ={
    val emailValidator = new EmailValidator()
    val emailValidatorResult = emailValidator.emailIdIsValid(user.emailId)

    if(emailValidatorResult)
      return true
    false
  }
}
