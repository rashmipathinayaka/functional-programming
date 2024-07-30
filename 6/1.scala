object shop extends App{

///case class product(name:String,quantity:Int,price:Double)
var inventory1: Map[Int , ( String , Int , Double)] = Map(

    1->("rice",20,50),
    2->("milk",20,10),
    3->("pen",20,10)
)
var inventory2: Map[Int , ( String , Int , Double)] = Map(

    1->("rice",20,50),
    2->("dhal",20,10),
    3->("pen",20,10)
)

 for((id , (product , quantity , price)) <- inventory1){
            println(s"$id\t$product\t\t$quantity\t\t$price")
 }

 println("total value: ");
 var sum:Double=0.0;
    for((id , (product , quantity , price)) <- inventory1){
            sum += quantity * price

  }
    println("rs."+sum)


println("check if inventory 1 is empty: ");
if(inventory1.isEmpty){
    println("empty")
}else{
    println("not empty")
}


//def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
    var mergedInventory = scala.collection.mutable.Map[Int , (String , Int , Double)]()
    mergedInventory ++= inventory1

    for ((id, (product, quantity, price)) <- inventory2) {
      if (mergedInventory.contains(id)) {
        val (existingProduct, existingQuantity, existingPrice) = mergedInventory(id)
        mergedInventory(id) = (product, quantity + existingQuantity, Math.max(price, existingPrice))
      } else {
        mergedInventory(id) = (product, quantity, price)
      }
    }

    mergedInventory.toMap
  println("after merging: ");

   for((id , (product , quantity , price)) <- mergedInventory){
            println(s"$id\t$product\t\t$quantity\t\t$price")
 }

  
println("Details of product with ID = 2 in inventory1:")
  inventory1.get(2) match {
    case Some((product, quantity, price)) => println(s"2\t$product\t\t$quantity\t\t$price")
    case None => println("Product with ID 2 not found in inventory1")
  }
}










