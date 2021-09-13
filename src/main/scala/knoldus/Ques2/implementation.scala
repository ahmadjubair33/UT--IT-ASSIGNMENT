package knoldus.Ques2

class Fibonacci extends function{
   def devide(a:Int, b:Int):Int =a/b

    def fibonacci(n: Int): List[Int] = {
      var ret = scala.collection.mutable.ListBuffer[Int](0, 1)
      while (ret(ret.length - 1) < n) {
        val temp = ret(ret.length - 1) + ret(ret.length - 2)
        if (temp >= n) {
          return ret.toList
        }
        ret += temp
      }
      ret.toList
    }

  }

trait function{
  def divide(): Unit ={
  }
  def fibonacci(): Unit ={
  }

}