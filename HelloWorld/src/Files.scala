import java.io.PrintWriter
import scala.io.Source
object Files{
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter("test.txt")
    writer.write("Just some random text\nAnd some more")
    writer.close()

    val textFromFile = Source.fromFile("test.txt", "UTF-8")
    val lineIterator = textFromFile.getLines
    for (line <-lineIterator)
      println(line)

    textFromFile.close()

  }
}