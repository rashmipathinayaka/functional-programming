import  scala.io.StdIn._
object question_8_01{
    def encrypt(text: String, shift: Int): String = {
        text.map(c => (c+shift).toChar)
    }
    def decrypt(text: String, shift: Int): String = {
        text.map(c => (c-shift).toChar)
    }
    
    def main(args: Array[String]): Unit = {
        println("Enter String :");
        val text = readLine();
        
        val encriptedtext = encrypt(text, 1);
        val DecriptedValue = decrypt(encriptedtext,1);

        println(s"Encripted Text : ${encriptedtext}")
        println(s"Decripted Text : ${DecriptedValue}")
         
    }
}