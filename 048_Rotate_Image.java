//Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
//Memory Usage: 37.1 MB, less than 92.95% of Java online submissions for Rotate Image.

class Solution {
    public void rotate(int[][] matrix) {
        int length =matrix[0].length;
        for(int a = 0;a<length;a++){
            for(int b = a+1;b<length;b++){
                int tem = matrix[a][b];
                matrix[a][b] = matrix[b][a];
                matrix[b][a] = tem;
            }
        }
        for(int a = 0;a<length;a++){
            for(int b = 0;b < length/2 ;b++){
                int tem = matrix[a][length-1-b];
                matrix[a][length-1-b] = matrix[a][b];
                matrix[a][b] = tem;
            }
        }
    }
}