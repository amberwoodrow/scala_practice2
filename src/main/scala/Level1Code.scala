object Level1Code {

  // Returns "Hello World!"
  def helloWorld(): String = "Hello World!"

  // Return the sum of two numbers
  def sum(a:Int, b:Int): Int = a+b

  // Return the product of two numbers
  def product(a:Int, b:Int): Int = a*b

  // Return the square of a number
  def square(a:Int): Int = a*a

  // return the cube of a number
  def cube(a:Int):Int = a*a*a

  // return the Int quotient of a fraction
  def quotient(numerator:Int, denominator:Int):Int = numerator/denominator

  // return the Int remainder of a fraction
  def remainder(numerator:Int, denominator:Int):Int = numerator%denominator

  // return the square root of perfect squares only.
  def squareRootOfPerfectSquare(a:Int):Option[Int] = if (Math.sqrt(a)%1==0) Some(Math.sqrt(a).toInt) else None

  // return an array containing the square of each number
  // in the source array in the same order
  def squareAll(as:Array[Int]): Array[Int] = as.map(n => n*n)

  // return an array containing the cube of each number
  // in the source array in the same order
  def cubeAll(as:Array[Int]): Array[Int] = as.map(n => n*n*n)

  // return an array containing the product of an 'a' in array 'as' with
  // its respective 'b' in array 'bs'
  def productAll(as:Array[Int], bs:Array[Int]) : Array[Int] = (as, bs).zipped.map(_ * _)

  // sum all of the elements in the array and return the result
  def sumAll(as:Array[Int]): Int = as.sum

  // reverse the array
  def reverse(as:Array[Int]): Array[Int] = as.reverse

}
