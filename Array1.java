import java.util.Scanner;
public class Array1{
    public static void main(String[]args){

        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;

         for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seach a number");
         int search = sc.nextInt();

         for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Number found at index: " + i);
                sc.close();
                return;
            }
        }


    }
}