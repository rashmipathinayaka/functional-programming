def isPrime(n: Int): Boolean = {
  if (n <= 1) false
  else if (n == 2) true
  else !(2 until n).exists(i => n % i == 0)
}

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(num => isPrime(num))
}
