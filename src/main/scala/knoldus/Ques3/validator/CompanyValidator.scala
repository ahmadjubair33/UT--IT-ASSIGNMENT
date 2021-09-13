package knoldus.Ques3.validator


import knoldus.Ques3.db.CompanyReadDto
import knoldus.Ques3.models.Company

class CompanyValidator   {

  def companyIsValid(company: Company): Boolean = {
    val companyRead = new CompanyReadDto()
  val dbResult: Option[Company] = companyRead.getCompanyByName(company.name)
  if (dbResult.isEmpty) return true

  false
}

def isValidEmail(company: Company): Boolean ={
  // email should be valid
  val emailValidator = new EmailValidator()
  val emailValidatorResult = emailValidator.emailIdIsValid(company.emailId)

  if(emailValidatorResult) return true

  false
  }
}
