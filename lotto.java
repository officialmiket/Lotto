import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lotto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want: ");
        int rows = scanner.nextInt();

        while (rows > 0) {
         
            Random rd = new Random();
            int length = 7;
            int min = 1;
            int max = 40;
            int[] numbers = new int[length];
    
            for (int x = 0; x < length; x++) {
                numbers[x] = rd.nextInt(max - min) + min;
            }
            //Special numbers
            int splength = 2;
            int spmin = 1;
            int spmax = 30;
            int[] spnumbers = new int[splength];

            for (int x = 0; x < splength; x++) {
                spnumbers[x] = rd.nextInt(spmax - spmin) + spmin;
            }
    
            System.out.println(Arrays.toString(numbers) + (Arrays.toString(spnumbers)));
            rows--;
        }
    }
}
