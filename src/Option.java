import java.util.Scanner;

public class Option {


        public static void Option() {
                System.out.println("Меню:" +
                "\n1.Анализ" +
                "\n2.Обезвреждане" +
                "\n3.(пре)Мини\n");
                Option();
        }

    public static void chooseFromMenu(String[][] array, boolean[][]isMined){
        System.out.println("Въведете числото на опцията ");
        Scanner input = null;
        int choice = input.nextInt();
        switch (choice){

            case 1:{
                GameBoard(array,isMined);
                Coordinates(array,isMined);
                break;
            }
            case 2: {
                Disposal();
                BattleStation(array, isMined);
                GameBoard(array, isMined);
                Coordinates(array, isMined);
            }

            case 3: {
                BattleStation(array, isMined);
                GameBoard(array,isMined);
                Coordinates(array,isMined);
                break;
            }
            default:{
                Coordinates(array, isMined);
                break;
            }
        }
    }

    private static void Disposal() {
    }
     private static void BattleStation(String[][] array, boolean[][] isMined) {
    }

    private static void Coordinates(String[][] array, boolean[][] isMined) {
    }

    private static void GameBoard(String[][] array, boolean[][] isMined) {

    }
}


