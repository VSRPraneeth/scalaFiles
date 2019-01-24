object Maps{
  def main(args: Array[String]): Unit = {

    val employees = Map("Manager" -> "Jonah", "Secretary" -> "Bob")
    if (employees.contains("Manager"))
      printf("Manager : %s\n", employees("Manager"))

    val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Frank")
    printf("Customer 1 : %s\n", customers(100))
    customers(100) = "Kayley"
    customers(102) = "Mark"
    for ((k,v)<- customers){
      printf("%d : %s\n",k,v)
    }

  }
}