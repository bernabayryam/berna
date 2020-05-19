import java.util.Random;
import java.util.Scanner;

public class PublicOfMonster {

    private static int option;
    private static int arrayForPrimeNumbs;
    private static int mainArray;
    private static int[] arrayForNums;
    private static int arrayForNumsSize;
    private static int arraySize;
    private static  String [] mostCommon;
    private static CharSequence[] array;
    private static String[] arrayForWords;

    public static void main(String[] args) {


        System.out.println("1. Работа с числа " +
                "2. Работа с думи" +
                " 3. Изход");

        System.out.print("Изберете опция");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {

            case 1:

                workWithNumbers();
                break;
            case 2:

                workWithWords();

            default:
                break;
        }

    }

    private static void workWithWords() {

        System.out.print("Въведете колко думи ще използвате.");

        Scanner scan = new Scanner(System.in);

        int lenght_of_array = scan.nextInt();

        String[] array = new String[lenght_of_array];


        System.out.print("Моля въведете думите");

        int i = 0;

        while (i < lenght_of_array) {
            i++;
        }

        System.out.println("Изберете една от опциите");
        System.out.println("1. Обърнете буквите на думите от масива наобратно и ги визуализирайте в конзолата.");
        System.out.println("2. Изведете броя на повтарящите се символи за всяка една от думите в масива.");
        System.out.println("3.  Изведете броя на символите за всяка една от думите в масива.");
        System.out.println("4. Изведете броя на повтарящите се думи от масива.");
        System.out.println("5. Връщане назад към основното меню. ");

        scan = new Scanner(System.in);

        int user_choise = scan.nextInt();

        switch (user_choise) {
            case 1:

                reverseWord(array);
                break;
            case 2:

                mostCommon(array);
                break;
            case 3:

                numsOfChar(array);
                break;
            case 4:

                repeatingWords(array);
                break;
            case 5:

            default:
                break;
        }

    }

    private static void repeatingWords(String[] array) {
    }

    private static void numsOfChar(String[] array){

        for (int i = 0; i < PublicOfMonster.array.length; i++) {
            System.out.println(" - брой символи: ");
        }
    }


    private static void reverseWord(String[] array) {
    }


    private static void mostCommon() {

        int count;
        String mostUsedChar;
        String[] array;

        for (int wordNo = 0; wordNo < arraySize; wordNo++) {

            mostUsedChar = "";
            count = 0;

            array = arrayForWords[wordNo].split("");

            for (int i = 0; i < array.length; i++) {

                int tempCount = 0;

                for (String s : array) {

                    if (array[i].equals(s)) {

                        tempCount++;
                    }
                    if (tempCount > count) {

                        count = tempCount;

                        mostUsedChar = array[i];
                    }
                }
            }
            System.out.printf("брой повтарящи се символи:\n");
        }
    }


    private static void workWithNumbers() {

        System.out.print("Въведете броят на числата");

        Scanner scan = new Scanner(System.in);

        int lenght_of_array = scan.nextInt();

        int[] array = new int[lenght_of_array];


        System.out.print("Моля въведете стойностите!");
        for (int i = 0; i < lenght_of_array; i++) {

            scan = new Scanner(System.in);

            int number = scan.nextInt();

            if (number > 0 && number < 10000) {

                array[i] = number;
            } else {

                System.out.print("Числата трябва да са между 0 и 10000");
                i--;
            }
        }
        System.out.println("Изберете една от опциите");
        System.out.println("1. Извеждане само на простите числа от масива");
        System.out.println("2. Извеждане на най-често срещан елемент в масива");
        System.out.println("3. Извеждане на максимална редица от нарастващи елементи в масива");
        System.out.println("4. Извеждане на максимална редица от намаляваши елементи в масива");
        System.out.println("5.  Извеждане на максимална редица от еднакви елементи в масива");
        System.out.println("6. Извеждане на последователност от числа от масива,които имат сума равна на числор," +
                "генерирано на случаен принцип.");
        System.out.println("7. Връщане назад към основното меню.");

        scan = new Scanner(System.in);
        int choise = scan.nextInt();
        switch (choise) {
            case 1:

                primeNumbs(arrayForNumsSize, arrayForNums);
                break;
            case 2:

                mostCommon();
                break;
            case 3:

                maxIncreasing();
                break;
            case 4:

                maxDecreasing();
                break;
            case 5:

                maxEquals();
                break;
            case 6:



            default:
                break;

        }
    }

    private static void maxEquals() {
    }

    private static void maxDecreasing() {
    }

    private static void maxIncreasing() {
    }

    //Finds the most commons number.
    private static void mostCommon(String[] array) {
        int maxCounter = 0;

        for (int i = 0; i < PublicOfMonster.array.length; i++) {

            int counter = 0;

            for (int j = 0; j < PublicOfMonster.array.length; j++) {

                if (PublicOfMonster.array[i] == PublicOfMonster.array[j]) {

                    counter++;

                    if (counter > maxCounter) {

                        maxCounter = counter;
                    }
                }
            }
        }

        System.out.println("Числото се среща най-много пъти " );
    }

    //Finds the prime number.

    private static void primeNumbs(int arraySize, int[] array) {

        for (int i = 0; i < arraySize; i++) {

            boolean isPrime = true;

            if (array[i] == 1) {

                isPrime = false;

            } else {

                for (int j = 2; j <= array[i] / 2; j++) {

                    if (array[i] % j == 0) {

                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {

                System.out.printf("Числото е просто ");
            }
        }
    }
}
