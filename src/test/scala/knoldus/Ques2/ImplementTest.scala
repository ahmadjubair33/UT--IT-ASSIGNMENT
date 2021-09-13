package knoldus.Ques2

import org.scalatest.funsuite.AnyFunSuite

class ImplementTest extends AnyFunSuite {
  val Testing = new Fibonacci
  //UnitTest for Devision
  test("devided by zero should throw some math error") {
    assertThrows[ArithmeticException](Testing.devide(15, 0))
  }
  test("Should return correct value") {
    assert(Testing.devide(15, 3)==5)
  }


  //Unit test for fibonacci Series
  test("sould return fibo series") {
    val nums: List[Int] = List(0, 1, 1, 2, 3)
    assert(Testing.fibonacci(5) == nums)
  }
  test("sould  not return fibo series") {
    val nums: List[Int] = List(0, 1, 1, 2, 3)
    assert(Testing.fibonacci(6) != nums)
  }
}