object ExceptionHandling{
  def main(args: Array[String]): Unit = {
    def divideByZero(num1 : Int, num2 : Int) = try {
      num1/num2
    }
    catch {
      case ex : java.lang.ArithmeticException => "Can't Divide By Zero"
    }
    finally {
      //clean up code
    }
    println("5/0 = " + divideByZero(5,0))
  }
}