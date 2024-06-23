def attendents(tp:Double)={
    120+(15-tp)/5*20;
}

def income(tp:Double) ={
    tp*attendents(tp);
}

def cost(tp:Double)={
    3*attendents(tp)+500;
}

def profit(tp:Double)={
   income(tp)-cost(tp);
}





