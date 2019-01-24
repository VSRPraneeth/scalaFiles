import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object Arrays{
  def main(args: Array[String]): Unit = {
    var i : String = ""
    val favouriteNumbers = new Array[Int](20)
    val friends = Array("Tarun", "Gowtham", 20)
    val friends2 = ArrayBuffer[String]()


    friends(2) = 30
    friends2.insert(0, "Vivek")
    friends2 += "Akshay"
    friends2 ++= Array("Manikanta", "Srikar")
    friends2.insert(1, "Dora", "Pablo", "Vamsi", "Shravi", "Vaishu")
    friends2.remove(1,2)

    for(i<-friends)
      println("Values of friends Array : " + i)

    for(i<-friends2)
      println("Values of friends2 Array : " + i)

    for (j<- 0 to (favouriteNumbers.length-1)){
      favouriteNumbers(j) = j
      println(favouriteNumbers(j))
    }

    println("Sum : " + favouriteNumbers.sum)
    println("Min : " + favouriteNumbers.min)
    println("Max : " + favouriteNumbers.max)

    val sortedFavouriteNumbers = favouriteNumbers.sortWith(_>_)

    println(sortedFavouriteNumbers.deep.mkString(", "))

    val favouriteNumbersTimesTwo = for(num <- favouriteNumbers)yield num*2

    favouriteNumbersTimesTwo.foreach(println)

    val favouriteNumbersDivisibleByFour = for(num <- favouriteNumbers if num%4==0)yield num
    favouriteNumbersDivisibleByFour.foreach(println)

    var multiTable = Array.ofDim[Int](10,10)

    for(i<- 0 to 9){
      for(j<- 0 to 9){
        multiTable(i)(j) = i*j
      }
    }

    for(i<- 0 to 9){
      for(j<- 0 to 9){
        printf("(%d, %d) = %d\t", i, j, multiTable(i)(j))
      }
      printf("\n")
    }


  }
}