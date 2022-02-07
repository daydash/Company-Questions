package com.daydash;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringBuffer alpha = new StringBuffer(),
                num = new StringBuffer();
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> inmatrix = new ArrayList<>(1);

        for (int i = 0; i < 2; i++) {
            inmatrix.add(new ArrayList<String>());
        }
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 3; j++) {
//                inmatrix.get(i).add(in.next());
//            }
//        }

        inmatrix.get(0).add(0, "mo3s");
        inmatrix.get(0).add(1, "t23m");
        inmatrix.get(0).add(2, "4tq5");
        inmatrix.get(1).add(0, "13");
        inmatrix.get(1).add(1, "3");
        inmatrix.get(1).add(2, "45");

        System.out.println(inmatrix);


//        inmatrix = {{"mo3s","t23m","4tq5"},{"13","3","45"}};

        ArrayList<ArrayList<String>> outmatrix = new ArrayList<>(1);

        for (int i = 0; i < 2; i++) {
            outmatrix.add(new ArrayList<String>());
        }

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
////                inmatrix.get(i).add(in.next());
//                outmatrix.add(inmatrix.get(i));
//            }
//        }

        outmatrix = selection(inmatrix);

        System.out.println(outmatrix);


    }

    static ArrayList<ArrayList<String>> selection(ArrayList<ArrayList<String>> inmatrix) {
        ArrayList<ArrayList<String>> outmatrix = new ArrayList<>(1);
        for (int i = 0; i < 2; i++) {
            outmatrix.add(new ArrayList<String>());
        }
        for (int i = 0; i < 3 /*inmatrix.size()-1*/; i++) {
            String s = inmatrix.get(0).get(i);
            String num = extractNum(s);
            String alpha = extractAlpha(s);
//            for (int j = 0; j < 2; j++) {


                for (int k = 0; k < 2 /*inmatrix.get(1).size()*/; k++) {
                    if (inmatrix.get(1).get(k).equals(num)) {
                        outmatrix.get(0).add(i, alpha);
                        outmatrix.get(1).add(i, num);
                    } else {
                        outmatrix.get(0).add(i, "NA");
                        outmatrix.get(1).add(i, "NA");
                    }
                }
            }
//        }
        return outmatrix;
    }

//    static String extractInt(String str) {
//        // Replacing every non-digit number
//        // with a space(" ")
////        str = str.replaceAll("[^\\d]", " ");
//
//        // Remove extra spaces from the beginning
//        // and the ending of the string
//        str = str.trim();
//
//        // Replace all the consecutive white
//        // spaces with a single space
//        str = str.replaceAll(" +", " ");
//
//        if (str.equals(""))
//            return "-1";
//
//        return str;
//    }

    static String extractNum(String str) {
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                num.append(str.charAt(i));

        }
        System.out.println(num.toString());
        return num.toString();
    }

    static String extractAlpha(String str) {
        StringBuilder alpha = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
                alpha.append(str.charAt(i));

        }
        System.out.println(alpha.toString());
        return alpha.toString();
    }

}
