import scala.io.StdIn._


object question8_2{
    def main(args: Array[String]): Unit ={
        val multifyof3 : Int => Boolean = (x: Int)=>x % 3 == 0
        val multifyof5 : Int => Boolean = (x:Int) =>x % 5==0
        println("Enter your number :")
        val number = readInt()
        val result = (multifyof3(number),multifyof5(number))match{
            case(true,true) => "Multiple of both Three and five"
            case(true,false) => "Multiple of Three" 
            case(false,true)=>"Multiple of five"
            case(false,false)=>"Not a Multiple of three or five"
        }

        println(result)
    }
}

