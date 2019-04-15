//Runtime: 5 ms, faster than 100.00% of Java online submissions for Search a 2D Matrix II.
//Memory Usage: 46 MB, less than 61.86% of Java online submissions for Search a 2D Matrix II.

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        int row = 0,col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]>target) col--;
            else row++;
        }
        return false;
    }
}