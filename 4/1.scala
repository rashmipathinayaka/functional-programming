//object inventory extends App{
    var name=Array("milk","rice","noodles");
    var quantity=Array(23,45,2);


//first question
  def printinventory():Unit={
    
      val newValue = {
  for(i<- quantity.indices){
    print(name(i));
    print('-');
    println(quantity(i));
            }  
        }
      if(name.length!=quantity.length){
    print("there's a problem with arrays");
      }
    }



//second question

    def restockinventory(a:String,b:Int):Unit={
            var  flag=0;  
            for(i<-name.indices){
       
                 if(name(i)==a){
                quantity(i)=quantity(i)+b;
                println("wede hari");
                flag=1;
              }
            }
            if(flag==0){
            print("sorry,your item is not in the list");
            
        }
    }

      //third question
      def sellitem(a:String,b:Int):Unit={
       var flag1=0;
       for(i<-name.indices){
        if( name(i)==a){
            flag1=1;
            if(quantity(i)>=b){
                quantity(i)=quantity(i)-b;
                print(quantity(i));
            }else{
                print(("sorry, not enough quantity"));
            }

        }}
        if(flag1==0){
            print("sorry, item not found");
        }
       
      }






    


