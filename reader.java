import jdk.internal.loader.BuiltinClassLoader;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

class Reader {

    private static String dataT;
    private static String wordT;
    private static String type;
    private static String wordName;
    private static String name;
    private static String lName;
    private static String AGE;
    private static String wordNumb;
    private static String wordA;
    private static String wordS;
    private static String SEX;
    private static String wordAdd;
    private static String address;
    private static String number;
    private static String wordSpPr;
    private static String SpPr;
    private static String wordLName;
    private static String nameToFind;


    public static void main(String[] args) {

        FileInformation();

    }

    private static void FileInformation() {

        File fileReference = new File("resident");
        try {
            FileReader fileReferenceReader = null;
            try {
                fileReferenceReader = new FileReader(fileReference);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = new BufferedReader(fileReferenceReader);
            String lineReference;


            while ((lineReference = bufferedReader.readLine()) != null) {
                String[] arrayData = lineReference.split("@");

                dataT = arrayData[0];
                String[] dataArrayType = dataT.split("=");
                wordT = dataArrayType[0];
                type  = dataArrayType[1];

                String dataName = arrayData[1];
                String[] dataArrayName = dataName.split("=");
                wordName = dataArrayName[0];
                name     = dataArrayName[1];


                String dataLastName = arrayData[2];
                String[] dataArrayLastName = dataLastName.split("=");
                wordLName = dataArrayLastName[0];
                lName = dataArrayLastName[1];


                String dataAGE = arrayData[3];
                String[] dataArrayAGE = dataAGE.split("=");
                wordA = dataArrayAGE[0];
                AGE   = dataArrayAGE[1];

                String dataSEX = arrayData[4];
                String[] dataArraySEX = dataSEX.split("=");
                wordS = dataArraySEX[0];
                SEX   = dataArraySEX[1];

                String dataADDRESS = arrayData[5];
                String[] dataArrayADDRESS = dataADDRESS.split("=");
                wordAdd = dataArrayADDRESS[0];
                address = dataArrayADDRESS[1];

                String dataNUMBER = arrayData[6];
                String[] dataArrayNUMBER = dataNUMBER.split("=");
                wordNumb = dataArrayNUMBER[0];
                number   = dataArrayNUMBER[1];

                String dataSpPr = arrayData[7];
                String[] dataArraySpPr = dataSpPr.split("=");
                wordSpPr = dataArraySpPr[0];
                SpPr     = dataArraySpPr [1];
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void selectOption () {

            while (true) {

                Scanner input = new Scanner(System.in);
                System.out.println("Избери онпция:");
                String request = input.nextLine();

                if (name.equalsIgnoreCase(nameToFind)) {

                        System.out.println(name);

                    } else System.out.println("No such person");
                }
        }
}