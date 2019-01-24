import scala.math._
object HigherOrderFunctions{
  def main(args: Array[String]): Unit = {
    val log10Func = log10 _
    println(log10Func(1000))
    List(10000.0,100.0).map(log10Func).foreach(println)
    List(1,2,3,4,5).map((x : Int) => x*100).foreach(println)
    List(1,2,3,4,5).filter(_ %2 ==0).foreach(println)

    def numberTimesThree(num:Int) = num*3
    def numberTimesFour(num:Int) = num*4
    def multiFunction(func: (Int) => Double, num : Int) ={
      func(num)
    }
    printf("3*100 = %.1f\n", multiFunction(numberTimesThree, 100))
    printf("4*100 = %.1f\n", multiFunction(numberTimesFour, 100))

    val divisorVal = 5
    val divisor5 = (num : Double) => num /divisorVal
    printf("500 / 5 = %.1f", divisor5(500))
  }
}