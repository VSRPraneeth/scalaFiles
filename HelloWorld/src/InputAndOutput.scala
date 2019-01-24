import scala.io.StdIn._

object InputAndOutput{
  def main(args: Array[String]): Unit = {

    var numberGuess = 0
    var name = "Praneeth"
    var age = 22
    var weight = 169.789

/*    do{
      print("Guess a number : ")
      numberGuess = readLine.toInt

    } while(numberGuess!=15)

    printf("You guessed the secret number %d \n",15)

    println(s"Hello $name")
    println(f"I am ${age+1} and weigh $weight%.2f")
*/
    printf("'%5d'\n", 5)
    printf("'%-5d'\n", 5)
    printf("'%05d'\n", 5)
    printf("'%.5f'\n", 5.8)
    printf("'%5s'\n", "Hi")
//  \b, \\, \a, etc.
  }
}