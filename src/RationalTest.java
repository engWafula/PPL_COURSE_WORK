public class RationalTest {

    public static void main(String[] args){

        Rational r1 = new Rational(1,3);
        Rational r2 =new Rational();
        Rational r3 =new Rational(3,2);
        Rational r4 =new Rational(10,15);

        r3.setDeno(6);
        r4.reduce();
        System.out.println(r4);
    }
}
