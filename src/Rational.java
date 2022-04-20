public class Rational {
    private int num;
    private int deno;


    //constructor

    public Rational(int n, int d){
        num=n;
        deno=d;
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
    }

    public void setDeno(int d) {
        this.deno = d;
    }

    public void reduce(){
      int g =gcf(num,deno);
      num=num/g;
      deno=deno/g;
    }

    //helper method to give us the greatest common factor of two numbers
    public int gcf(int x,int y){
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
    public String toString() {
        return  num +"/" + deno;
    }
}
