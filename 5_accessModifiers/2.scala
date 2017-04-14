class Outer{
	class Inner {
		def f() {println("f")}

		class InnerMost {
			f()
		}
	}
	(new Inner).f()
}

object Main {
	def main(args: Array[String]): Unit = {
		new Outer
	}
}