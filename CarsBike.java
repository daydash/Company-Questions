package com.daydash;

import java.util.ArrayList;

public class CarsBike {
    public static void main(String[] args) {
        int Q = 3;
        ArrayList<ArrayList<Integer>> Arr = new ArrayList<>(Q);

        for (int i = 0; i < Q; i++) {
            Arr.add(new ArrayList<>());
        }
        Arr.get(0).add(2);
        Arr.get(0).add(3);
        Arr.get(0).add(1);

        Arr.get(1).add(2);
        Arr.get(1).add(1);
        Arr.get(1).add(0);

        Arr.get(2).add(1);
        Arr.get(2).add(1);
        Arr.get(2).add(0);

        int res = answer(Q, Arr);
        System.out.println(res);
    }

    static int answer(int Q, ArrayList<ArrayList<Integer>> Arr) {
        int fans = 0;
        int ans = 0;

        for (int i = 1; i <= Q; i++) {
            int x = 0;
            x = (Arr.get(i-1).get(1) - Arr.get(i-1).get(0));
            if ((x >= 0) && (x <= Arr.get(i-1).get(2))) {
                ans = (int) (ans + (Math.pow(2, i)));
            }
        }

        fans = ans % 1000000007;
        return fans;
    }
}
