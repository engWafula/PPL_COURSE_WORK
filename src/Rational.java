public class Rational {
    private int num;
    private int deno;


    //constructor

    public Rational(int n, int d){
        num=n;
        deno=d;
        reduce();
    }

    //default constructor

    public Rational(){
     num=1;
     deno=1;

    }


    //Accessors
    public int getNum() {

        return num;
    }

    public int getDeno() {
        return deno;
    }

    //mutators


    public void setNum(int n) {

        this.num = n;
        reduce();
    }

    public void setDeno(int d)
    {
        this.deno = d;
        reduce();
    }

    private void reduce(){
      int g =gcf(num,deno);
      num=num/g;
      deno=deno/g;
    }

    //helper method to give us the greatest common factor of two numbers
    private int gcf(int x,int y){
     int result;
     if(x<y){
         result =x;
     }
  else{
      result=y;
     }
    while(x%result!=0 || y%result!=0)
        result--;
     return result;
    }

    public  Rational multiply(Rational other){
        int newNum=this.num*other.num;
        int newDeno=this.deno* other.deno;

        Rational r =new Rational(newNum,newDeno);
        return r;

    }
    public  void  equal(Rational other){
      if(this.num==other.num&&this.deno==other.deno){
          System.out.println("the 2 rational numbers are equal");
      }

      else
          System.out.println("The 2 rational numbers are not equal");


    }


    public  Rational divide(Rational other){
        int newNum=this.num*other.deno;
        int newDeno=this.deno* other.num;

        Rational r =new Rational(newNum,newDeno);
        return r;

    }

    public Rational addition(Rational other){
        int newNum=(this.num*other.deno)+(this.deno*other.num);
        int newDeno=(this.deno)*(other.deno);

        Rational r =new Rational(newNum,newDeno);
        return r;
    }

    public Rational subtraction(Rational other){
        int newNum=(this.num*other.deno)-(this.deno*other.num);
        int newDeno=(this.deno)*(other.deno);

        Rational r =new Rational(newNum,newDeno);
        return r;
    }

    public Rational division(Rational other){
        int newNum=(this.num*other.deno)-(this.deno*other.num);
        int newDeno=(this.deno)*(other.deno);

        Rational r =new Rational(newNum,newDeno);
        return r;
    }
    public String toString() {
        return  num +"/" + deno;
    }
}
