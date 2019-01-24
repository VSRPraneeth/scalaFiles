object Lists{
  def main(args: Array[String]): Unit = {
    var i = 0

/*  var aList = List(1,2,3,4,5)
    for (i <- aList)
      println(i)
*/

    var evenList = for{i<-1 to 20 if (i%2 == 0)} yield i
//  var evenList = for(i<-1 to 20 if (i%2 != 0)) yield i

    for (i<- evenList)
      println(i)

  }
}
