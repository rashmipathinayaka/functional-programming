
def numbers(a:String):String ={
  if(a.isEmpty) ""

  else {
     numbers(a.tail) + a.head
  }

}



