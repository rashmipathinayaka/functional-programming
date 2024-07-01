def func(num:List[Int]):Float={
 var sum:Float=0;
    for (no <- num) {
    if(no % 2 ==0){
    sum=sum+no;
     }
    }

    sum;
}
