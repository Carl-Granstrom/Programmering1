package tyreso.gymnasium._8_more_objects;

public class StaticKeywordMain {

    public static void main(String args[]){
        /**
         * Calling the static method of StaticKeyword without instantiating the class
         */
        System.out.println(StaticKeyword.insultMe());

        /**
         * Calling the Math-class in the Java Standard Library
         */
        int num1 = 9;
        int num2 = 21;
        int result = Math.max(num1, num2);
        System.out.println("The largest number between " + num1 + " and " + num2 + " is: " + result);
        System.out.println();

        double sqrtResult = Math.sqrt(9);
        System.out.println((int)sqrtResult);
    }
}
