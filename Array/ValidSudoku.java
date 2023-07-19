import java.util.Set;
import java.util.HashSet;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!isValidRow(board, i) || !isValidColumn(board, i)){
                return false;
            }
        }
        if(!isValidSubBox(board, new int[]{0,1,2}, new int[]{0,1,2}) || 
           !isValidSubBox(board, new int[]{0,1,2}, new int[]{3,4,5}) || 
           !isValidSubBox(board, new int[]{0,1,2}, new int[]{6,7,8}) || 
           !isValidSubBox(board, new int[]{3,4,5}, new int[]{0,1,2}) || 
           !isValidSubBox(board, new int[]{3,4,5}, new int[]{3,4,5}) || 
           !isValidSubBox(board, new int[]{3,4,5}, new int[]{6,7,8}) || 
           !isValidSubBox(board, new int[]{6,7,8}, new int[]{0,1,2}) || 
           !isValidSubBox(board, new int[]{6,7,8}, new int[]{3,4,5}) || 
           !isValidSubBox(board, new int[]{6,7,8}, new int[]{6,7,8})) {
            return false;
           }

        return true;
    }

    public boolean isValidRow(char[][] board, int r) {
        Set<Character> set = new HashSet<>();
        for(char ch: board[r]){
            if(ch!='.' && set.contains(ch)){
                return false;
            }
            if(ch!='.')
                set.add(ch);
        }
        return true;
    }

    public boolean isValidColumn(char[][] board, int c) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<9;i++){
            char ch = board[i][c];
            if(ch!='.' && set.contains(ch)){
                return false;
            }
            if(ch!='.')
                set.add(ch);
        }
        return true;
    }

    public boolean isValidSubBox(char[][] board, int[] row, int[] col){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char ch = board[row[i]][col[j]];
                if(ch!='.' && set.contains(ch)){
                    return false;
                }
                if(ch!='.')
                    set.add(ch);
            }
        }
        return true;
    }
}
