package com.zxx.sword;

/**
 * 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径
 * 某格子经过后不能再访问
 */
public class Q68HasPathInMatrix {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if (matrix == null || rows <= 0|| cols <= 0 || str ==null || str.length == 0)return false;
        boolean[] isVisited = new boolean[cols * rows];
        //当前判断的元素下标
        int pathLen = 0;
        for (int row = 0;row < rows; row++){
            for (int col = 0;col < cols; col++){
                if(hasPathCode(matrix,rows,cols,row,col,str,pathLen,isVisited))
                    return true;
            }
        }
        return false;
    }
    //判断指定的row，col位置处是否是str[pathLen]字符
    private boolean hasPathCode(char[] matrix, int rows, int cols, int row, int col, char[] str, int pathLen, boolean[] isVisited) {
        if(pathLen == str.length)return true;
        if(row >= 0 && row < rows && col >= 0 && col <cols && matrix[row * cols + col] == str[pathLen]
        && isVisited[row * cols + col] == false){
            isVisited[row * cols + col] = true;
            pathLen++;
            if(hasPathCode(matrix,rows,cols,row + 1,col,str,pathLen,isVisited)
            || hasPathCode(matrix,rows,cols,row - 1,col,str,pathLen,isVisited)
            || hasPathCode(matrix,rows,cols,row,col + 1,str,pathLen,isVisited)
            || hasPathCode(matrix,rows,cols,row,col - 1,str,pathLen,isVisited)){
                return true;
            }
            isVisited[row * cols + col] = false;
        }
        return false;
    }
}
