//Runtime: 5 ms, faster than 84.62% of Java online submissions for Maximal Square.
//Memory Usage: 43.9 MB, less than 5.23% of Java online submissions for Maximal Square.

class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0||matrix[0].length==0) return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] tem = new int[row+1][col+1];
        int ans = 0;
        for(int a = 0;a<=row;a++){
            for(int b = 0;b<=col;b++){
                if(a==0 || b==0) tem[a][b]=0;
                else{
                    tem[a][b] = (matrix[a-1][b-1]==48)?0:Math.min(tem[a-1][b],Math.min(tem[a][b-1],tem[a-1][b-1]))+(matrix[a-1][b-1]-48);
                    ans = Math.max(ans,tem[a][b]);
                }
            }
        }
        return ans*ans;
    }
}