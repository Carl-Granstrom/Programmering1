package tyreso.gymnasium._10_arrayer;

import java.util.Random;

public class ArrayMethods {

    public static void main(String args[]){

        Random r = new Random();

        int[] numbers = new int[]{ r.nextInt(100) + 1, r.nextInt(100) + 1, r.nextInt(100) + 1,
                r.nextInt(100) + 1, r.nextInt(100) + 1, r.nextInt(100) + 1,
                r.nextInt(100) + 1, r.nextInt(100) + 1, r.nextInt(100) + 1,
                r.nextInt(100) + 1, r.nextInt(100) + 1, r.nextInt(100) + 1,
                r.nextInt(100) + 1, r.nextInt(100) + 1, r.nextInt(100) + 1};

        for (int i : numbers){
            System.out.println(i);
        }

    }

    Random r = new Random();
    public int[] generate20(){
        int[] numbers = new int[20];

        for (int i = 0; i < 20; i++){
            numbers[i] = r.nextInt(20) + 1;
        }

        return numbers;
    }
}
