package com.zxx.sword;

public class Q01TwoDimMatrix {
    public static boolean twoDimMatrix(int[][] matrix,int target){
        if(matrix == null || matrix.length ==0) return false;
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(target == matrix[row][col]) return true;
            else if(target > matrix[row][col]) {
                row++;
            }else {
                col--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 8, 9},
                {4, 7, 10, 13},

        };
        System.out.println(twoDimMatrix(matrix, 7));    // 要查找的数在数组中
        System.out.println(twoDimMatrix(matrix, 5));    // 要查找的数不在数组中
        System.out.println(twoDimMatrix(matrix, 1));    // 要查找的数是数组中最小的数字
        System.out.println(twoDimMatrix(matrix, 15));   // 要查找的数是数组中最大的数字
        System.out.println(twoDimMatrix(matrix, 0));    // 要查找的数比数组中最小的数字还小
        System.out.println(twoDimMatrix(matrix, 16));   // 要查找的数比数组中最大的数字还大



    }
}
