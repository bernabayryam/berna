import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class ex5<arraySize, isArraySimetric> {

    private static int chosenOption;
    private static int[] mainArray;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you enter ?");

        int arraySize = Integer.parseInt(scanner.nextLine());

        if (arraySize > 0) {

            int takenNumCounter = 1;

            System.out.println("Number is between 0 and 100");

            int[] mainArray = new int[arraySize];
            for (int i = 0; i < arraySize; ) {

                System.out.printf("Taken number:");

                mainArray[i] = Integer.parseInt(scanner.nextLine());

                if (mainArray[i] > 0 && mainArray[i] < 100) {
                    i++;
                    takenNumCounter++;
                } else {
                    System.out.println("Numbers isn't between ");
                }
            }

            for (int i = 0; i < arraySize; i++) {

                for (int j = 0; j < arraySize; j++) {
                    if (mainArray[i] < mainArray[j]) {

                        int temporary = mainArray[i];
                        mainArray[i] = mainArray[j];
                        mainArray[j] = temporary;
                    }
                }
            }
            for (int i = arraySize - 1; i >= 0; i--) {

                System.out.printf("Ascending %d\n: ", mainArray[i]);
            }

            for (int i = 0; i < arraySize; i++) {

                System.out.printf("Descending %d\n: ", mainArray[i]);
            }

            //Array coding

            Random randomNum = new Random();

            for (int i = 0; i < arraySize; i++) {

                int randomIndexToSwap = randomNum.nextInt(arraySize);
                int temp = mainArray[randomIndexToSwap];

                mainArray[randomIndexToSwap] = mainArray[i];
                mainArray[i] = temp;
            }
            for (int i = 0; i < arraySize; i++) {

                System.out.printf("Array coding: %d\n", mainArray[i]);
            }

            //Calculates the sum and the average.
            double sumOfTheNumsInArray = 0.00;
            double averageOfNumsInArray = 0.00;

            for (int i = 0; i < arraySize; i++) {

                sumOfTheNumsInArray += mainArray[i];
            }
            averageOfNumsInArray = sumOfTheNumsInArray / arraySize;

            System.out.printf("Sum of number %.0f\n", sumOfTheNumsInArray);
            System.out.printf("Average of number: %.2f\n", averageOfNumsInArray);


            //Array is simetric or not
            boolean isArraySimetric = false;
            int arraySize2 = arraySize;

            if (arraySize % 2 == 0) {

                for (int i = 0; i < arraySize; i++) {
                    if (mainArray[i] == mainArray[--arraySize]) {
                        isArraySimetric = true;
                    } else {
                        isArraySimetric = false;
                        break;
                    }
                }
            }
            if (isArraySimetric) {
                System.out.println("Array is simetric \n");
            } else {
                System.out.println("Array is not simetric \n");
            }
            for (int i = 0; i < arraySize2; i++) {
                System.out.printf("%d ", mainArray[i]);

                //Min and Max number
                int maxNumb = Integer.MIN_VALUE;
                int minNumb = Integer.MAX_VALUE;

                for (i = 0; i < arraySize; i++) {
                    if (mainArray[i] > maxNumb) {
                        maxNumb = mainArray[i];
                    }
                    if (mainArray[i] < minNumb) {
                        minNumb = mainArray[i];
                    }
                }

                System.out.printf("Max numb is: %d\n", maxNumb);

                System.out.printf("Min numb is: %d\n", minNumb);

                //Displays numbers
                for (i = 0; i < arraySize; i++) {

                    System.out.printf("Display the numb: %d\n ", mainArray[i]);
                }

                //Reversing numbers
                for (i = 0; i < arraySize; i++) {

                    System.out.printf("Reversing : %d\n ", mainArray[i]);
                }

                boolean willYouUseProgram = false;

                System.out.println("Do you want to close program?");
                System.out.println("Yes/No");

                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("Yes")) {
                    willYouUseProgram = false;


                }
            }
        }
    }
}




