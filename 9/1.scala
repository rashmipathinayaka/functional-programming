object interest extends App {
  val calculateInterest: Double => Double = deposit => deposit match {
    case d if d <= 20000 => d * 0.02
    case d if d <= 200000 => d * 0.04
    case d if d <= 2000000 => d * 0.035
    case d if d > 2000000 => d * 0.065
  }


  println(calculateInterest(20000))
  println(calculateInterest(100000))
  println(calculateInterest(500000))
  println(calculateInterest(3000000))
}
