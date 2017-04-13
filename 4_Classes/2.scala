import java.io._

class Point(val xc: Int, val yc: Int){
	var x: Int = xc
	var y: Int = yc

	def move(dx: Int, dy: Int){
		x = x + dx
		y = y + dy
		println("Point x location : " + x);
		println("Point y location : " + y);
	}
}

class Location(override val xc: Int, override val yc: Int,
	val zc: Int) extends Point(xc, yc){
	var z: Int = zc
	/*Point의 생성자를 그대로 실행하고, 그 다음 이걸 실행한다.
	생성자를 자바처럼 따로 선언을 안해주고 필드 부분에 코드를 바로 적는 것 같다*/

	def move(dx: Int, dy: Int, dz: Int){
		x = x + dx
		y = y + dy
		z = z + dz
		println ("Point x location : " + x);
		println ("Point y location : " + y);
		println ("Point z location : " + z);
	}
	/*override를 사용하지 않았으므로
	이 move 메소드는 Point의 move 메소드와 전혀 다른 메소드다*/
}

object Demo {
	def main (args: Array[String]){
		val loc = new Location(10, 20, 15);

		loc.move(10, 10, 5);
	}
}