package org.example;

public class GiveMeADiamond {
    public static String repeat(int count, String with) {
        String nameDesString = new String(new char[count]).replace("\0", with);
        return nameDesString;
    }

    public static String print (int n) {
        int input = n;
        String dia = "";
        String sDia = "";
        int spaces = 1;
        spaces = input / 2;
        int astrix = 1;
        boolean flag = true;
        String sSpaces = "";

        if (n % 2 == 0) {
            System.out.println("not Working!");
            return dia;
        } else {
            for (int i = 0; i < input; i++) {
                sSpaces = repeat(spaces, " ");
                dia = sSpaces + repeat(astrix,"*");
                sDia = sDia + dia + "\n";

                if(astrix < input && flag) {
                    astrix = astrix + 2;
                    spaces = spaces - 1;
                } else {
                    flag = false;
                    astrix = astrix - 2;
                    spaces = spaces + 1;
                }
            }
        }
        return sDia;
    }

    public static void main(String[] args) {
        int input =5;
        print(input);
        System.out.println(print(input));
    }

}
