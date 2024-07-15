object FibonacciSequence {
  
  // Function to compute Fibonacci number at a given position recursively
  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(n - 1) + fibonacci(n - 2)
  }

  // Function to print the first n Fibonacci numbers
  def printFibonacci(n: Int): Unit = {
    def helper(i: Int): Unit = {
      if (i < n) {
        print(fibonacci(i) + " ")
        helper(i + 1)
      }
    }
    helper(0)
    println()
  }

  // Main method to test the function
  def main(args: Array[String]): Unit = {
    println("Enter the number of Fibonacci numbers to print:")
    val n = scala.io.StdIn.readInt()
    println(s"First $n Fibonacci numbers:")
    printFibonacci(n)
  }
}
