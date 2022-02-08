package com.daydash;

import java.util.Scanner;

public class badQues1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String instr1 = in.next();
        String instr2 = in.next();
        int innum = in.nextInt();


//        String instr1 = "Raines"; //RaBoinwless = Ra Bo in wl es s
//        String instr2 = "Bowls";
//        int innum = 2;

        StringBuilder str1 = new StringBuilder();
        for (int i = 0; i < instr1.length(); i++) {
            str1.append(instr1.charAt(i));
        }
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < instr2.length(); i++) {
            str2.append(instr2.charAt(i));
        }

        StringBuilder ans = new StringBuilder();
        System.out.println(ans);

        if (instr2.length() < innum) {
            System.out.println(instr1 + instr2);
            return;
        }

        int n = instr1.length() % (instr1.length() / innum);
        for (int i = 0; i < instr1.length() / innum + n; i++) {

            if (!str1.isEmpty()) {

                for (int j = 0; j < innum; j++) {
                    ans.append(str1.charAt(j));
                }
            }
            if (str1.length() > innum) {
                for (int j = 0; j < innum; j++) {
                    str1.deleteCharAt(0);
                }
            }
            if (!str2.isEmpty()) {
                for (int j = 0; j < innum; j++) {
                    ans.append(str2.charAt(j));
                }
            }
            if (str2.length() > innum) {
                for (int j = 0; j < innum; j++) {
                    str2.deleteCharAt(0);
                }
            }
        }

        System.out.println(ans);
    }
}
