object Demo {
	def main(args: Array[String]) {
		var inc = (x: Int) => x + 1

		var x = inc(7) - 1

		var mul = (x: Int, y: Int) => x * y

		println(mul(3, 4))

		var userDir = () => {System.getProperty("user.dir")}

		println(userDir)
	}
}