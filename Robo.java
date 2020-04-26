import java.util.Random;
import java.util.Scanner;

public class Robo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int robotHits = 4;
        int hitsDone = 1;

        while (hitsDone <= 4) {

            //1. Navigation of the Robot Killer
            System.out.println("what is the object in front of the Robot");

            String object = scanner.next();
            String movement = " ";

            switch (object) {
                case "Wall":
                    movement = "go Sideway\n";
                    break;
                case "Chair":
                    movement = "jump\n";
                    break;
                case "Nothing":
                    movement = "forward\n";
                    break;
                default:
                    movement = "object is passed\n";
                    break;
            }
            System.out.printf("movement: %s\n", movement);

            //2.Is the mouse in front of the Robot ?
            System.out.println("Give the enter pixcels the Robot");

            for (int i = 0; i < 1; ) {
                int pixcels = Integer.parseInt(scanner.nextLine());

                if (pixcels % 2 == 0) {
                    i++;
                    System.out.println("Mouse is in front of the Robot!");
                } else {
                    System.out.println("Give enter pixcels the Robot again");
                }
            }

            //4. Is the Robot Charging himself ?
            System.out.println("is the Robot Charging");

            for (int i = 0; i < 1; ) {

                Random numberGenerator = new Random();

                int numberOne = numberGenerator.nextInt(1000) + 1;
                int numberTwo = numberGenerator.nextInt(1000) + 1;

                if (numberOne > numberTwo) {
                    System.out.println("robot is charging\n");
                    ++i;
                } else if (numberOne < numberTwo) {
                    System.out.println("robot is not charging\n");
                    ++i;
                } else {
                    System.out.println("robot will wait for electricity");
                }
            }
            //5. Robot's Communication
            System.out.println("Robot's Communication");

            for (int number = 10; number >= 1; number--) {
                if (number % 2 == 0) {
                    System.out.println("I am a Robottttt");
                } else {
                    System.out.println(number);
                }
            }
            hitsDone++;
        }
    }
}

