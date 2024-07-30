object shop extends App{

case class product(name:String,quantity:Int,price:Int)
val inventory1:Map[Int,product]=Map(
    1->product("apple",20,50),
    2->product("milk",20,10),
    3->product("suger",20,10)
)
val inventory2:Map[Int,product]=Map(
    1->product("rice",20,50),
    2->product("dhal",20,10),
    3->product("pen",20,10)
)

for ((productId, product) <- inventory1) {
      println(s"Product ID: $productId, Name: ${product.name}")
}

 println("total value: ");
 var sum=0;
  for ((productId, product) <- inventory1) {
     sum=sum+product.quantity*product.price;
  }
    println("rs."+sum)

println("check if inventory 1 is empty: ");
if(inventory1.isEmpty){
    println("empty")
}else{
    println("not empty")
}


var mergedInventory: Map[Int, Product] = inventory1

    for ((productId, product) <- inventory2) {
    if (mergedInventory.contains(productId)) {
      val currentProduct = mergedInventory(productId)
      val updatedProduct = Product(
        currentProduct.name,
        currentProduct.quantity + product.quantity,
        Math.max(currentProduct.price, product.price)
      )
      mergedInventory += (productId -> updatedProduct)
    } else {
      mergedInventory += (productId -> product)
    }
  }

  // Print merged inventory
  println("Merged Inventory:")
  for ((productId, product) <- mergedInventory) {
    println(s"Product ID: $productId, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
  }
}





