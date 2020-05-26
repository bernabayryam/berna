public class MineBoard {

    boolean BOMB;
    boolean CHEKED;
    boolean FINISH;
    boolean START;
    boolean MyLocation;

    public char Definition() {
        if (START) return 'S';
        if (FINISH) return 'F';
        if (CHEKED) {
            if (BOMB) return 'Y';
            else return 'N';
        }
        if (MyLocation) return 'X';
        else return 'O';
    }
    public  void Visited(){
        this.MyLocation = false;
        this.BOMB       = false;
        this.CHEKED     = true;
    }

    public void BOMB(){
        this.MyLocation = true;
        this.BOMB       = false;
        this.CHEKED     = false;
    }

    public void Location(){
        this.MyLocation = true;
        this.BOMB       = false;
        this.CHEKED     = false;
    }


}
