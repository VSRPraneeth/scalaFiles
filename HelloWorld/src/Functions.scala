object Functions{
  def main(args: Array[String]): Unit = {

    // def funcName (para1:dataType, param2 : dataType) : returnType = {
    //  functionBody
    //  return valueToReturn
    // }

    def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
      println(num1, num2)
      return num1 + num2
      // num1 + num2
      // return is not necessary. return the value based on the last line of the function.
    }

    def sumOfMultipleArguments(args: Int*) : Int ={
      var sum = 0
      for(i <- args){
        sum +=i
      }
      sum
      // no need of return
    }

    def sayHi() : Unit = {
      println("Hello! How are you")
    }

    def factorial(num : BigInt) : BigInt = {
      if(num == 1)
        return 1
      else
        num*factorial(num - 1)
    }

    sayHi()
    println("Sum of 4 & 5 is : " + getSum(4,5))
    println("Sum of 4 & 5 is : " + getSum(num2 = 4, num1 = 5))
    println("Sum Of Multiple Arguments : " + sumOfMultipleArguments(1,2,3,4,5))
    println("Factorial of 4 is : " + factorial(4))

/*
    var i=1
    var fact = 1
    while (i <= 4){
      fact = fact* i
      i+=1
    }
    println(fact)
*/

  }
}