package tyreso.gymnasium._5_operators;

/**
 * Example code for the course Programmering 1. The purpose of the code is showing some of the operators in use.
 *
 * The code is also a good example of purely sequential code as it has no selection and no iteration.
 *
 * NEVER write your actual code like this.
 *
 * @author Carl Granström
 */
public class MoreOperators {

    public static void main(String[] args) {

        //Variabedeklaration och initialisation
        long numOne = 3;
        System.out.println("numOne = " + numOne);
        long numTwo = 4;
        System.out.println("numTwo = " + numTwo);
        long numThree = 4;
        System.out.println("numThree = " + numThree);
        long numFour = 9;
        System.out.println("numFour = " + numFour);
        System.out.println();


        // ++ operatören(increment)
        numOne++;   //increment postfix
        ++numOne;   //increment prefix
        System.out.println("Resultatet av två increment av numOne(3) är: " + numOne);
        System.out.println("Resultatet borde vara 5");
        System.out.println();

        // -- operatören(decrement)
        numOne--;   //decrement postfix
        --numOne;   //decrement prefix
        numOne--;
        numOne--;
        numOne--;
        numOne--;
        System.out.println("Resultatet av sex decrement av numOne är: " + numOne);
        System.out.println("Resultatet borde vara -1");
        System.out.println();


        // % operatören(modulo/modus/remainder)
        long moduloResult = numFour % 3;
        System.out.println("Resultatet av numFour(9) modulo 3 är: " + moduloResult);
        System.out.println("Resultatet borde vara 0");
        moduloResult = numFour % 5;
        System.out.println("Resultatet av numFour(9) modulo 5 är: " + moduloResult);
        System.out.println("Resultatet borde vara 4");
        System.out.println();


        // <= operatören(smaller or equals)
        //TODO CODE TOGETHER
        System.out.println("<= operatören(smaller or equals): ");
        System.out.println( 4 <= 3 );   //TODO: true/false?
        System.out.println( 4 <= 4 );   //TODO: true/false?
        System.out.println( 4 <= 5 );   //TODO: true/false?
        System.out.println("Resultatet borde vara: false, true, true");
        System.out.println();

        // >= operatören(greater or equals)
        //TODO CODE TOGETHER
        System.out.println(">= operatören(greater or equals): ");
        System.out.println( 4 >= 3 );   //TODO: true/false?
        System.out.println( 4 >= 4 );   //TODO: true/false?
        System.out.println( 4 >= 5 );   //TODO: true/false?
        System.out.println("Resultatet borde vara: true, true, false");
        System.out.println();

        // && operatören(logisk OCH /logical AND operatör)
        System.out.println("&& operatören: ");
        System.out.println( true && true );     //TODO: true/false?
        System.out.println( true && false );    //TODO: true/false?
        System.out.println( false && true );    //TODO: true/false?
        System.out.println( false && false );   //TODO: true/false?
        System.out.println("Resultatet borde vara: true, false, false, false");
        System.out.println();

        //  || operatören(logisk ELLER / OR operatör)
        System.out.println("|| operatören ");
        System.out.println( true || true );     //TODO: true/false?
        System.out.println( true || false );    //TODO: true/false?
        System.out.println( ((4 == 4) || (5 > 10) ) || true );    //TODO: true/false?
        System.out.println( false || false );   //TODO: true/false?
        System.out.println("Resultatet borde vara: true, true, true, false");
        System.out.println();

        //mer variabeldeklaration och initialisation
        int a = 2;

        //sammansatta operatörer
        a += 3; //a = 5
        //TODO Vad ska vi skriva för att kolla om a är 5?
        a -= 7; //a = -2
        //TODO ...och här?
        a *= 3; //a = -6
        //TODO ...och här?
        a /= -3; //a = 2
        //TODO ...och vad blev nu a till slut?
    }
}
