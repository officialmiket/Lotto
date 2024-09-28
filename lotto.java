import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class lotto {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows do you want: ");
        int rows = scanner.nextInt();

        System.out.println("Would you like to print to file your results. yes?");
        int writers = scanner.nextInt();
        Set<Integer> generatedNumbers = new HashSet<>();

        int length = 7;
        int[] numbers = new int[length];

        while (rows > 0) {
         
            Random rd = new Random();
            int min = 1;
            int max = 40;

            for (int x = 0; x < length; x++) {
                numbers[x] = rd.nextInt(max - min) + min;
            }
            //Special numbers
            int splength = 2;
            int spmin = 1;
            int spmax = 30;
            int[] spnumbers = new int[splength];

            for (int x = 0; x < splength; x++) {
                int randomNumber;
                // Keep generating a new number until we find one that is not already in the set
                do {
                    randomNumber = rd.nextInt(spmax - spmin) + spmin;
                } while (generatedNumbers.contains(randomNumber));
                
                spnumbers[x] = randomNumber;
                generatedNumbers.add(randomNumber);
            }

            if (writers == 1) {
                File file = new File("Lotto.txt");
                FileWriter fw = new FileWriter(file, true);
                fw.write("Numbers" +Arrays.toString(numbers) + "Special numbers: "+ Arrays.toString(spnumbers) +"\n");
                fw.close();
            } else {}

            System.out.println(Arrays.toString(numbers) + (Arrays.toString(spnumbers)));
            rows--;
        }
    }
}

/*        if (writers.equals("yes" + "y" + "Y" + "Yes")) {
} else {
    //fw.close();
    scanner.close();
} */