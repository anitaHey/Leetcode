/**
 * Runtime: 3 ms, faster than 69.90% of Java online submissions for Valid Sudoku.
 * Memory Usage: 44.2 MB, less than 73.91% of Java online submissions for Valid Sudoku.
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        char[][] list = new char[9][9];
        int[] num = new int[9];
        for(int a = 0;a < 9 ;a++) {
            char[] array = new char[9];
            if(!check(board[a])) return false;
            
            for(int b = 0;b<9;b++) {
                array[b] = board[b][a];
                int tem = 3 * (int)(a/3) + (int)(b/3);
                list[tem][num[tem]++] = board[a][b];
            }
            
            if(!check(array)) return false;
        }   
        
        for(int a =0;a<9;a++)
            if(!check(list[a])) return false;
        
        return true;
    }
    
    public boolean check(char[] array){
        Set<Character> tem = new HashSet<Character>();
        for(int a = 0;a<array.length;a++){
            if(array[a] == '.') continue;
            else if(tem.contains(array[a])) return false;
            else tem.add(array[a]);
        }
        
        return true;
    }
}