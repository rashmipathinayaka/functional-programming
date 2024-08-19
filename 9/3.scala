object NameFormatter extends App {

  
  def toUpper(name: String): String = name.toUpperCase


  def toLower(name: String): String = name.toLowerCase

  
  def formatNames(name: String, formatFunc: String => String): String = formatFunc(name)

  val names = List("Benny", "Niroshan", "Saman", "Kumara")
  
  val formattedNames = names.zip(List(toUpper, toLower, toLower, toUpper)).map {
    case (name, formatFunc) => formatNames(name, formatFunc)
  }

  
  formattedNames.foreach(println)
}
