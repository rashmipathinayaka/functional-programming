import scala.io.StdIn.readInt;

object func2 {

  def func2(a: Int): Unit = a match {
    case a if (a <= 0)     => print("negative number");
    case a if (a % 2 == 0) => print("even number");
    case a if (a % 2 != 0) => print("odd number");
  }
  def main(args: Array[String]): Unit = {
    println("enter number:");
    var a = readInt();
    
    func2(a);

  }
}



