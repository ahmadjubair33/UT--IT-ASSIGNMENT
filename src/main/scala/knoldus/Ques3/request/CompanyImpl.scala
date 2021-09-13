package knoldus.Ques3.request


import knoldus.Ques3.models.Company
import knoldus.Ques3.validator.CompanyValidator

class CompanyImpl(companyValidator: CompanyValidator) {

  def createCompany(company: Company): Option[String] = {
    if (companyValidator.companyIsValid(company)) Option(company.name)
    else None
  }
}
