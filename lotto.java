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

        System.out.println("What do you want to play");
        System.out.println("1. Lotto 2. Vikinglotto 3. Eurojackpot 4. Keno 5. Exit");
        int game = scanner.nextInt();
        
        switch (game) {
            //Lotto game
            case 1:

                System.out.println("How many rows do you want: ");
                int rows = scanner.nextInt();

                System.out.println("Would you like to print to file your results. yes = 1");
                int writers = scanner.nextInt();

                int length = 7;
                int[] numbers = new int[length];

                while (rows > 0) {
                

                    Set<Integer> generatedNumbers = new HashSet<>();
                    Set<Integer> sbgeneratedNumbers = new HashSet<>();

                    Random rd = new Random();
                    int min = 1;
                    int max = 40;

                    for (int x = 0; x < length; x++) {
                        int randomNumber;

                        do {
                            randomNumber = rd.nextInt(max - min) + min;
                        } while (generatedNumbers.contains(randomNumber));

                        numbers[x] = randomNumber;
                        generatedNumbers.add(randomNumber);
                    }
                    //Special numbers
                    int splength = 2;
                    int spmin = 1;
                    int spmax = 30;
                    int[] spnumbers = new int[splength];

                    for (int x = 0; x < splength; x++) {
                        int sbrandomNumber;
                        // Keep generating a new number until we find one that is not already in the set
                        do {
                            sbrandomNumber = rd.nextInt(spmax - spmin) + spmin;
                        } while (sbgeneratedNumbers.contains(sbrandomNumber));

                        spnumbers[x] = sbrandomNumber;
                        sbgeneratedNumbers.add(sbrandomNumber);
                    }
                    // Array sort
                    Arrays.sort(spnumbers);
                    Arrays.sort(numbers);


                    if (writers == 1) {
                        File file = new File("Lotto.txt");
                        FileWriter fw = new FileWriter(file, true);
                        fw.write("Numbers" +Arrays.toString(numbers) + "Special numbers: "+ Arrays.toString(spnumbers) +"\n");
                        fw.close();
                    }

                    System.out.println(Arrays.toString(numbers) + (Arrays.toString(spnumbers)));
                    rows--;
                }
            break;
        //Vikinglotto
        case 2:

            System.out.println("How many rows do you want: ");
            int vkrows = scanner.nextInt();
                
            System.out.println("Would you like to print to file your results. yes = 1");
            int vkwriters = scanner.nextInt();
                
            int vklength = 6;
            int[] vknumbers = new int[vklength];
                
            while (vkrows > 0) {
            
            
                Set<Integer> generatedNumbers = new HashSet<>();
                Set<Integer> sbgeneratedNumbers = new HashSet<>();
            
                Random rd = new Random();
                int min = 1;
                int max = 48;
            
                for (int x = 0; x < vklength; x++) {
                    int randomNumber;
                
                    do {
                        randomNumber = rd.nextInt(max - min) + min;
                    } while (generatedNumbers.contains(randomNumber));
                
                    vknumbers[x] = randomNumber;
                    generatedNumbers.add(randomNumber);
                }
                //Special numbers
                int splength = 1;
                int spmin = 1;
                int spmax = 5;
                int[] spnumbers = new int[splength];
            
                for (int x = 0; x < splength; x++) {
                    int sbrandomNumber;
                    // Keep generating a new number until we find one that is not already in the set
                    do {
                        sbrandomNumber = rd.nextInt(spmax - spmin) + spmin;
                    } while (sbgeneratedNumbers.contains(sbrandomNumber));
                
                    spnumbers[x] = sbrandomNumber;
                    sbgeneratedNumbers.add(sbrandomNumber);
                }
                // Array sort
                Arrays.sort(spnumbers);
                Arrays.sort(vknumbers);
            
            
                if (vkwriters == 1) {
                    File file = new File("Vikingjackpot.txt");
                    FileWriter fw = new FileWriter(file, true);
                    fw.write("Numbers" +Arrays.toString(vknumbers) + "Special numbers: "+ Arrays.toString(spnumbers) +"\n");
                    fw.close();
                }
            
                System.out.println(Arrays.toString(vknumbers) + (Arrays.toString(spnumbers)));
                vkrows--;
            }

        break;
        //Eurojackpot
        case 3:

            System.out.println("How many rows do you want: ");
            int ejrows = scanner.nextInt();
                
            System.out.println("Would you like to print to file your results. yes = 1");
            int ejwriters = scanner.nextInt();
                
            int ejlength = 5;
            int[] ejnumbers = new int[ejlength];
                
            while (ejrows > 0) {
            
            
                Set<Integer> generatedNumbers = new HashSet<>();
                Set<Integer> sbgeneratedNumbers = new HashSet<>();
            
                Random rd = new Random();
                int min = 1;
                int max = 50;
            
                for (int x = 0; x < ejlength; x++) {
                    int randomNumber;
                
                    do {
                        randomNumber = rd.nextInt(max - min) + min;
                    } while (generatedNumbers.contains(randomNumber));
                
                    ejnumbers[x] = randomNumber;
                    generatedNumbers.add(randomNumber);
                }
                //Special numbers
                int splength = 2;
                int spmin = 1;
                int spmax = 12;
                int[] spnumbers = new int[splength];
            
                for (int x = 0; x < splength; x++) {
                    int sbrandomNumber;
                    // Keep generating a new number until we find one that is not already in the set
                    do {
                        sbrandomNumber = rd.nextInt(spmax - spmin) + spmin;
                    } while (sbgeneratedNumbers.contains(sbrandomNumber));
                
                    spnumbers[x] = sbrandomNumber;
                    sbgeneratedNumbers.add(sbrandomNumber);
                }
                // Array sort
                Arrays.sort(spnumbers);
                Arrays.sort(ejnumbers);
            
            
                if (ejwriters == 1) {
                    File file = new File("Eurojackpot.txt");
                    FileWriter fw = new FileWriter(file, true);
                    fw.write("Numbers" +Arrays.toString(ejnumbers) + "Special numbers: "+ Arrays.toString(spnumbers) +"\n");
                    fw.close();
                }
            
                System.out.println(Arrays.toString(ejnumbers) + (Arrays.toString(spnumbers)));
                ejrows--;
            }

        break;
        //Keno
        case 4:

            System.out.println("How many rows do you want: ");
            int krows = scanner.nextInt();
                
            System.out.println("Would you like to print to file your results. yes = 1");
            int kwriters = scanner.nextInt();
            
            System.out.println("How many number space do you want 2-10");
            int klength = scanner.nextInt();

            if (klength <= 10 && klength > 1) {
            } else {
                System.out.println("Please enter a valid amount of space 2-10");
                break;
            }

            int[] knumbers = new int[klength];
                
            while (krows > 0) {
            
            
                Set<Integer> generatedNumbers = new HashSet<>();
                Set<Integer> sbgeneratedNumbers = new HashSet<>();
            
                Random rd = new Random();
                int min = 1;
                int max = 70;
            
                for (int x = 0; x < klength; x++) {
                    int randomNumber;
                
                    do {
                        randomNumber = rd.nextInt(max - min) + min;
                    } while (generatedNumbers.contains(randomNumber));
                
                    knumbers[x] = randomNumber;
                    generatedNumbers.add(randomNumber);
                }
                /*//Special numbers
                int splength = 1;
                int spmin = 1;
                int spmax = 5;
                int[] spnumbers = new int[splength];
            
                for (int x = 0; x < splength; x++) {
                    int sbrandomNumber;
                    // Keep generating a new number until we find one that is not already in the set
                    do {
                        sbrandomNumber = rd.nextInt(spmax - spmin) + spmin;
                    } while (sbgeneratedNumbers.contains(sbrandomNumber));
                
                    spnumbers[x] = sbrandomNumber;
                    sbgeneratedNumbers.add(sbrandomNumber);
                }
                // Array sort
                Arrays.sort(spnumbers);*/
                Arrays.sort(knumbers); 
            
            
                if (kwriters == 1) {
                    File file = new File("Keno.txt");
                    FileWriter fw = new FileWriter(file, true);
                    fw.write("Numbers" +Arrays.toString(knumbers) +"\n");
                    fw.close();
                }
            
                System.out.println(Arrays.toString(knumbers));
                krows--;
            }

        break;
        //Exit
        case 5:
        break;
        
        default:
            break;
    }
    }
}