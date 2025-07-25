package com.rony.Basic.Arrays.TwoD;

public class SumMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum = sum + matrix[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("-------------");
        int add = 0;
        for (int[] row : matrix){
            for (int val : row){
                add += val;
            }
        }
        System.out.println("Sum = "+add);
    }
}
