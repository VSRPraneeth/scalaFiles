object Tuples{
  def main(args: Array[String]): Unit = {

    val tupleMarge = (101, "Bob Marley", 15.26)
    printf("%s owes me $%.1f\n", tupleMarge._2, tupleMarge._3)
    tupleMarge.productIterator.foreach{ i => println(i)}
  }
}