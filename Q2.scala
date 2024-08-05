object Q2 {
	def main(args : Array[String])={
		val input = List(1,2,3,4,5)
		val output = calculateSquare(input)
		
		println("input : " + input)
		println("output : " + output)
	}
	
	def calculateSquare(numbers : List[Int]) : List[Int] = {
		numbers.map(num => num * num)
	}
	
}