object Demo {
	def main (args: Array[String]) {
		println("Returned Value : " + addInt(2))
	}

	def addInt (a: Int, b: Int = 7) : Int = {
		var sum: Int = 0
		sum = a + b

		return sum
	}
}