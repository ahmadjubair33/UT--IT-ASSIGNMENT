package knoldus.Ques1

class EmailValidator {
  def emailIdIsValid(emailId: String): Boolean = {
    """^[a-zA-Z0-9]+@[a-zA-Z0-9]+(\.)+(com|net|org)""".r.unapplySeq(emailId).isDefined
  }
}
