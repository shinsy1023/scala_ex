package society {
	package professional {
		class Executive {
			private[professional] var workDetails = 30
			private[society] var friends = 20
			private[this] var secrets = 10

			def help(another: Executive) {
				println(another.workDetails)
				println(another.friends)
				println(this.secrets)
				/*another로 하면 안되고 this로 하면 됨*/
			}
		}
	}
}

import society.professional._

object main {
	def main(args: Array[String]): Unit = {
		var hello = new Executive()
		hello.help(hello)
	}
}