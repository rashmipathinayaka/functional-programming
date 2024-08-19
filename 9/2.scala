object NumberPatternMatching extends App {

  
  val numberType: Int => String = number => number match {
    case n if n <= 0 => "Negative/Zero is given"
    case n if n % 2 == 0 => "Even number is given"
    case n if n % 2 != 0 => "Odd number is given"
  }
    
    println(numberType(6));
     println(numberType(-8));
  
}
