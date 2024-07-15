import scala.io.StdIn.readLine



  // Function to get the list of product names from the user
  def getProductList(): List[String] = {
    def getProductListHelper(products: List[String]): List[String] = {
      println("Enter a product name (or type 'done' to finish):")
      val input = readLine()
      input match {
        case "done" => products
        case productName => getProductListHelper(products :+ productName)
      }
    }

    getProductListHelper(Nil)
  }

  // Function to print the list of product names with their positions
  def printProductList(products: List[String]): Unit = {
    println("\nProduct List:")
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  // Function to get the total number of products
  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

