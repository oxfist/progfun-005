package week2

object lecture2 {
	def cube(a: Int): Int =	a * a * a         //> cube: (a: Int)Int
	def sum(f: Int => Int)(a: Int, b: Int): Int =
		if (a > b) 0 else f(a) + sum(f) (a + 1, b)
                                                  //> sum: (f: Int => Int)(a: Int, b: Int)Int
  def product(f: Int => Int)(a: Int, b:Int): Int =
  	if (a > b) 1 else f(a) * product(f) (a + 1, b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  product(x => x * x * x) (1, 3)                  //> res0: Int = 216
  
  def fact(n: Int): Int = product(x => x) (1, n)  //> fact: (n: Int)Int
  
  fact(2)                                         //> res1: Int = 2
  fact(3)                                         //> res2: Int = 6
  fact(4)                                         //> res3: Int = 24
  fact(10)                                        //> res4: Int = 3628800
}