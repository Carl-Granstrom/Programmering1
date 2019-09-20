package tyreso.gymnasium._10_data_structures_2_arrays;

import java.security.SecureRandom;

public class OddEvenArray {

    public static void main(String args[]) {
        SecureRandom random = new SecureRandom();

        int[] numberArray = new int[20];

        for (int i = 0; i < 20; i++){
            numberArray[i] = random.nextInt(99);
        }

        for (int i : numberArray) {
            System.out.println(i);
        }
    }
}