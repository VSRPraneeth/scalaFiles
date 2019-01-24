object Strings{
  def main(args: Array[String]): Unit = {

    var randomString = "I saw a UFO at "
    val randomStringArray = randomString.toArray

    println("3rd Index : " + randomString(3))
    println("String Length : " + randomString.length)
    println(randomString.concat("Area 51"))
    println("Are Strings equal : " + "I saw a UFO at ".equals(randomString))
    println("UFO starts at Index : " + randomString.indexOf("UfO"))

    for(i <- randomStringArray)
    println(i)

  }
}