public class RationalTest {

    public static void main(String[] args){

        Rational r1 = new Rational(1,9);
        Rational r2 =new Rational();
        Rational r3 =new Rational(1,5);
        Rational r4 =new Rational(10,15);

        Rational r5= r3.multiply(r1);
        Rational r6= r3.addition(r1);
        Rational r7= r3.subtraction(r1);
        Rational r8= r3.divide(r4);





        System.out.println(r8);
    }
}
