import scala.util.matching.Regex

object Demo {
	def main(args: Array[String]): Unit = {
		val pattern = "Hello".r
		val str = "Hello, world. Hello, scala"

		println(pattern findAllIn str)
	}
}