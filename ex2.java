
public class ex2 {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Въведи месец");
        String month = scanner.nextLine();

        int Януари = 31;
        int Февруари = 29;
        int Март = 30;
        int Април = 30;
        int Май = 31;
        int Юни = 30;
        int Юли = 31;
        int Август = 30;
        int Септември = 31;
        int Октомври = 31;
        int Ноември = 30;
        int Декември = 31;

        if (month.equals("Януари")) {
            System.out.println("Януари");
        } else if (month.equals("Февруари")) {
            System.out.println("Февруари");
        }else if (month.equals("Март")) {
            System.out.println("Март");
        }else if (month.equals("Април")) {
            System.out.println("Април");
        }else if (month.equals("Май")) {
            System.out.println("Май");
        }else if (month.equals("Юни")) {
            System.out.println("Юни");
        }else if (month.equals("Юли")) {
            System.out.println("Юли");
        }else if (month.equals("Август")) {
            System.out.println("Август");
        }else if (month.equals("Септември")) {
            System.out.println("Септември");
        }else if (month.equals("Октомври")) {
            System.out.println("Октомври");
        }else if (month.equals("Ноември")) {
            System.out.println("Ноември");
        }else if (month.equals("Декември")) {
            System.out.println("Декември");
        }
        else {
            System.out.println("Грешка");
        }


    }
}
