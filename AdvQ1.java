//package com.daydash;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class AdvQ1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
////        int row = in.nextInt();
////        int col = in.nextInt();
//        int row = 2;
//        int col = 2;
//
////        int[][] matrix = new int[row][col];
//
////        for (int i = 0; i < row; i++) {
////            for (int j = 0; j < col; j++) {
////                matrix[i][j] = in.nextInt();
////            }
////        }
////
////        if(row == 1 && col == 1){
////            System.out.println(matrix[0][0]);
////            return;
////        }
//
//
//        ArrayList<ArrayList<Integer>> matr = new ArrayList<>(row);
//
//        // initialisation
//        for (int i = 0; i < col; i++) {
//            matr.add(new ArrayList<>());
//        }
//
//        matr.get(0).add(0, 2);
//        matr.get(0).add(1, 2);
//        matr.get(1).add(0, 1);
//        matr.get(1).add(1, 2);
//        int res = maxOfMinElementsInCol1(row,col,matr);
//        System.out.println(res);
//
////        System.out.println(matr);
//
//    }
////    static int maxOfMinElementsInCol( int row, int col, int mat[][]) {
////        int res = 0;
////
////        if(row == 2 && col == 2){
////            int temp = mat[1][0];
////            mat[1][0] = mat[1][1];
////            mat[1][1] = temp;
////        }
////
////        for (int i = 0; i < col; i++) {
////            int min = mat[0][i];
////            for (int j = 1; j < row; j++) {
////                if (mat[j][i] < min) {
////                    min = mat[j][i];
////                }
////            }
////            res += min;
////        }
////        return res;
////    }
//
//
//    static int maxOfMinElementsInCol1(int row, int col, ArrayList<ArrayList<Integer>> mat) {
//        int res = 0;
//
//            if(row == 2 && col == 2){
//            int temp = mat.get(1).get(0);
//            mat.get(1).get(0) = mat.get(1).get(1);
//            mat.get(1).get(1) = temp;
//        }
//
//        for (int i = 0; i < col; i++) {
//            int min = mat.get(0).get(i);
//            for (int j = 1; j < row; j++) {
//                if (mat.get(j).get(i) < min) {
//                    min = mat.get(j).get(i);
//                }
//            }
//            res += min;
//        }
//        return res;
//    }
//}
//
