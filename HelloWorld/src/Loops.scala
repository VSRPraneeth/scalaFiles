object Loops{
  def main(args: Array[String]){
    var i = 0
    val randomLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
/*  while (i<=10) {
      println(i)
      i+=1
    }

    do {
      println(i)
      i+=1
    } while(i<=20)

    for(i<- 1 to 10)
      println(i)

    for(i <- 0 until randomLetters.length ){
      println(randomLetters(i))
    }
*/
    for(i<-0 to 5; j<-6 to 10){
      println(i,j)
    }
  }
}