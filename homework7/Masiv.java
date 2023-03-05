package homework7;

public class Masiv {
    public static void main(String[] args) {
        int a = 6;
        int[] array = {1, 2, 3, 4, 6} ;
        boolean[] missingNumber = new boolean[a];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            missingNumber[number-1] = true;

        }
        for (int i = 0; i < a; i++) {
            if (!missingNumber[i]){

                System.out.println(i+1);
            }

        }


        }
    }

