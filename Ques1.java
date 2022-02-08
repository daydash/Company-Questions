package com.daydash;

import java.util.*;
import java.io.*;

public class Ques1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String in1 = br.readLine();
        String in2 = br.readLine();
        int inn = Integer.parseInt(br.readLine());
        String ans = "";
        if(inn>in1.length() || inn>in2.length())
        {
            ans  = in1+in2;
        }
        else
        {
            int i=0,j=0;
            while(in1.length()-i >= inn && in2.length()-j >= inn)
            {
                ans += in1.substring(i,i+inn);
                ans += in2.substring(j,j+inn);
                i += inn;
                j += inn;
            }
            if(in1.length()-i>0)
            {
                ans += in1.substring(i,in1.length());
            }
            if(in2.length()-i>0)
            {
                ans += in2.substring(i,in2.length());
            }
        }
        System.out.println(ans);
    }
}
