import java.util.Scanner;

class MorseCodeConverter {
    public static StringBuffer convert(String message) {
        StringBuffer respone = new StringBuffer ();
        for (int i = 0; i < message.length (); i++) {
            char temStore = message.charAt (i);
            switch (temStore) {
                case 'A','a' -> respone.append (". -");
                case 'B','b' -> respone.append ("- . . .");
                case 'C' ,'c'-> respone.append ("- . - .");
                case 'D','d' -> respone.append ("- . .");
                case 'E','e' -> respone.append (".");
                case 'F','f' -> respone.append (". . - .");
                case 'G','g' -> respone.append ("- - .");
                case 'H','h' -> respone.append (". . . .");
                case 'I','i' -> respone.append (". .");
                case 'J','j' -> respone.append (". - - -");
                case 'K','k' -> respone.append ("- . -");
                case 'L','l' -> respone.append (". - . .");
                case 'M','m' -> respone.append ("- -");
                case 'N','n' -> respone.append ("- .");
                case 'O','o' -> respone.append ("- - -");
                case 'P','p' -> respone.append (". - - .");
                case 'Q','q' -> respone.append ("- - . -");
                case 'R','r' -> respone.append (". - .");
                case 'S','s' -> respone.append (". . .");
                case 'T','t' -> respone.append ("-");
                case 'U','u' -> respone.append (". . -");
                case 'V','v' -> respone.append (". . .-");
                case 'W','w' -> respone.append (". - -");
                case 'X','x' -> respone.append ("- . . -");
                case 'Y','y' -> respone.append ("- . - -");
                case 'Z','z' -> respone.append ("- - . .");
                case '1' -> respone.append (". - - - -");
                case '2' -> respone.append (". . - - -");
                case '3' -> respone.append (". . . - -");
                case '4' -> respone.append (". . . . - -");
                case '5' -> respone.append (". . . . .");
                case '6' -> respone.append ("- . . . .");
                case '7' -> respone.append ("- - . . .");
                case '8' -> respone.append ("- - - . .");
                case '9' -> respone.append ("- - - - .");
                case '0' -> respone.append ("- - - - -");
            }
        }

        return respone;
    }


    public static void main(String[] args) {
        /*
        input from user
         */
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the String");
        String str = input.nextLine ();

        System.out.println ("here is your morse code :" + convert (str));
    }
}