package com.zxx.sword;

import java.util.ArrayList;
import java.util.Arrays;

public class Q18PrintMatrixClockwise {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length ==0)return null;
        int m = matrix.length;
        int n = 0;
        if(m > 0) {
            n = matrix[0].length;
        }else {
            return result;
        }
        int start = 0;
        while (n > start * 2 && m > start * 2){
            printMatrixInClock(matrix,m,n,start,result);
            start++;
        }
        return result;
    }
    public static void printMatrixInClock(int[][] matrix,int rows,int columns,int start,ArrayList<Integer> print){
        int endX = columns - 1 - start;
        int endY = rows - 1 - start;

        for(int i = start; i <= endX; i++){
            int num = matrix[start][i];
            print.add(num);
        }
        if(start < endY){
            for (int i = start + 1;i <= endY;i++){
                int num = matrix[i][endX];
                print.add(num);
            }
        }
        if(start<endX&&start<endY){
            for(int i = endX  - 1;i >= start;i--){
                int num = matrix[endY][i];
                print.add(num);
            }
        }

        if(start < endX && start < endY - 1){
            for (int i = endY - 1;i >= start + 1;i--){
                int num = matrix[i][start];
                print.add(num);
            }
        }
    }
}
