package org.example;

public class ChristmasTreeTDD {

    public static String heightOfTheTree(int height){
        String s = "";
        String tree = "";
        String leaf = "X";
        int sHeight = 0;

        if(height > 1) {
            sHeight = height - 1;
        }
        String space = new String(new char[sHeight]).replace("\0", " ");
        String sSpace = space;

        if(height == 0) {
            s = "X" + sSpace +"|";
        } else {
            for (int j = 0; j < height; j++) {
                space = new String(new char[sHeight - j]).replace("\0", " ");
                tree = tree + space + leaf + "\n";
                if (height > 1) {
                    leaf = leaf + "XX";
                }
            }
        }
        s = tree + sSpace +"|";
        System.out.println(s);
        return s;

    }

}
