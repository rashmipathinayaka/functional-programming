//first question
def area(r:Double)=math.Pi*r*r;

//second question
def temp(c:Double)=c*1.8+32;

//third question
def vol(r1:Double)=(4*math.Pi*r1*r1*r1)/3;

//fourth question
def cost(a:Double)=(24.95-24.95*0.4)*a;
def total(a:Double):Double=if(a>50){
3+(a-50)*0.75+cost(a)
 }else{ 
3+cost(a)};

//fifth question
def runtimeeasypace(a:Double):Double=a*8;
def runtimetempo(b:Double):Double=b*7;

