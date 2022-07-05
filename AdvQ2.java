package com.daydash;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int[] H = new int[N];
        int N = 4;
        ArrayList<Integer> H = new ArrayList<>(N);
        int max = 0;

        H.add(3);
        H.add(5);
        H.add(4);
        H.add(4);

        for (int i = 0; i < N; i++) {

            int x = H.get(i);
            int y = 0;
            for (int j = i + 1; j < N; j++) {
                if (H.get(j) > H.get(i)) {
                    y++;
                    if (H.get(j) < H.get(i)) {
                        break;
                    }
                }
                if(max<y){
                    max = y;
                }
            }
        }
//        return max;
        System.out.println(max);
    }
}
