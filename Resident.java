public class Resident {

    public Integer name;
    String specialChar;
        String TYPE;
        String NAME;
        String LNAME;
        String AGE;
        String ADDRESS;
        String NUMBER;
        String SEX;
        String Information;
    SpecialCharacteristic specialCharacteristic = new SpecialCharacteristic(Information);


        public Resident(String t, String n, String ln, String a, String s, String ad, String num, String specialChar) {
            TYPE = t;
            NAME = n;
            LNAME = ln;
            AGE = a;
            SEX = s;
            ADDRESS = ad;
            NUMBER = num;
            this.Information = specialChar;


        }
        public String String() {
            return String.format(" NAME, LNAME, AGE, SEX, ADDRESS, NUMBER, Special.Char");
        }
}
