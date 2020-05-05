import java.util.Arrays;
import java.util.Scanner;

public class chess {

    public static String dwarf;
    private static String queen;
    private static String king;
    private static String donkey;
    private static String player;
    private static Object counter;
    private static java.util.Arrays Arrays;

    static boolean FigureDwPow6Col1Finished;
    static boolean FigureDwPow6Col6Finished;
    static boolean FigureDwPow1Col1Finished;
    static boolean FigureDwPow1Col6Finished;

     static int whitePlayerTurnsCounter;
     static int blackPlayerTurnsCounter;
     static String[][] ChessBoard;

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
        }

        String[][] chessboar = new String[][]{
                {"wDw", "wd", "wQ", "wK", "wM", "wDw"},         //line 0
                {"xxx", "xxx", "xxx", "xxx", "xxx", "xxx"},         //line1
                {"xxx", "xxx", "xxx", "xxx", "xxx", "xxx"},         //line2
                {"xxx", "xxx", "xxx", "xxx", "xxx", "xxx"},         //line3
                {"xxx", "xxx", "xxx", "xxx", "xxx", "xxx"},         //line4
                {"bDw", "bM", "bK", "bQ", "bD", "bDw"}          //line5

        }   // 0      1      2       3     4     5  columns

        System.out.println("Enter your figures with number");

        {
            System.out.println(java.util.Arrays.deepToString(ChessBoard)
                    .replace("],", "\n").replace(",", "\t| ")
                    .replaceAll("[\\[\\]]", " "));

            if (FigureDwPow6Col1Finished) {
                ChessBoard[5][0] = "XXX";
                ChessBoard[0][0] = "wDw";
            }
            if (FigureDwPow6Col6Finished) {
                ChessBoard[5][5] = "XXX";
                ChessBoard[0][0] = "wDw";
            }
            if (FigureDwPow1Col1Finished) {
                ChessBoard[0][0] = "XXX";
                ChessBoard[5][0] = "bWd";
            }
            if (FigureDwPow1Col6Finished) {
                ChessBoard[0][5] = "XXX";
                ChessBoard[5][5] = "bWd";
            }
            {
                {
                    int maxTurns = 500;
                    while (counter <= maxTurns) ;
                    String mortar;
                    {

                        if (player.equals("White"))
                            System.out.println("Whiten player's turn");

                        //White figure.
                        king = "wK";
                        queen = "wQ";
                        dwarf = "wDw";
                        mortar = "wM";
                        donkey = "wD";
                        player = "White";

                        whitePlayerTurnsCounter++;


                    }
                    {

                        if (player.equals("Black"))

                            System.out.println("Black player's turn");
                        //Black figure
                        dwarf = "bDw";
                        donkey = "bD";
                        king = "bK";
                        queen = "bQ";
                        mortar = "bM";
                        player = "Black";

                        blackPlayerTurnsCounter++;

                    }
                }

            }


        }
    }
}