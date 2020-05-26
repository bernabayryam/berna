import java.util.Scanner;

public class OperationsMenu {


    public static void OperationsMenu (){
        System.out.println("=Бойни действия=\n" +
                "[1] Анализ на бойното поле\n" +
                "[2] Обезвреждане на бомба\n" +
                "[3] Придвижване по бойното поле\n");
    }

    public static void OperationsMenu( String[][] gameBoard, int gameBoardWidth,int gameBoardHeight, int nextInt)  {

        System.out.println("Въведете номера на процеса, който желаете: ");
        Scanner scanner = new Scanner (System.in);
        byte oDecision = scanner.nextByte();
        switch (oDecision){
            case 1:
                analyzeArea(gameBoard);
                break;
            case 2:
                defuseBomb(gameBoard);
                break;
            case 3:
                moveWithoutDefusing(gameBoard);
                break;
        }
    }

    private static void moveWithoutDefusing(String[][] gameBoard) {
    }

    private static void defuseBomb(String[][] gameBoard) {
    }

    private static void analyzeArea(String[][] gameBoard) {
    }
}
