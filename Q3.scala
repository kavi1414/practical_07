object Q3 {
	def main(args : Array[String])={
		val input = List(1,2,3,4,5,6,7,8,9,10)
		val output = filterPrime(input)
		
		println("input : " + input)
		println("output : " + output)
		
	}
	
	def isPrime(n: Int) : Boolean = {
		if(n <= 1) false
		else if(n == 2) true
		else {
			val sqrtN = math.sqrt(n).toInt
			!(2 to sqrtN).exists(x => n % x == 0)
		}
	}
	
	def filterPrime(Primenumbers : List[Int]) : List[Int] = {
		Primenumbers.filter(num => isPrime(num))
	}
}