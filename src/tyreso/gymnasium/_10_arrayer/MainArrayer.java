package tyreso.gymnasium._10_arrayer;

public class MainArrayer {

    public static void main(String args[]){

        ArrayMethods am = new ArrayMethods();

        int[] statistics = new int[20];

        for (int i = 0; i < 10000; i++){
            for (int num : am.generate20()){
                statistics[num-1]++;
            }
        }

        int counter = 1;
        for (int num : statistics){
            System.out.println("There were " + num + " number " + counter + "'s generated.");
            counter++;
        }


    }
}
