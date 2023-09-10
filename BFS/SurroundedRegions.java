package BFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SurroundedRegions {
    public void solve(char[][] board) {

        int n = board.length;
        int m = board[0].length;

        boolean canBeChanged[][] = new boolean[n][m];

        Queue<List<Integer>> queue = new LinkedList<>();
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                canBeChanged[i][j] = true;
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(board[i][j] == 'O'){
                        canBeChanged[i][j] = false;
                        queue.add(new ArrayList<>(Arrays.asList(i,j)));
                    }
                }
            }
        }

        while(!queue.isEmpty()){
            ArrayList<Integer> list = (ArrayList<Integer>) queue.remove();
            int i = list.get(0);
            int j = list.get(1);
            if((i-1)>=0 && board[i-1][j] == 'O' && canBeChanged[i-1][j]==true){  
                canBeChanged[i-1][j]=false;
                queue.add(new ArrayList<>(Arrays.asList(i-1,j)));        
            }
            if((i+1)<n && board[i+1][j] == 'O' && canBeChanged[i+1][j]==true){  
                canBeChanged[i+1][j]=false;
                queue.add(new ArrayList<>(Arrays.asList(i+1,j)));        
            }
            if((j-1)>=0 && board[i][j-1] == 'O' && canBeChanged[i][j-1]==true){  
                canBeChanged[i][j-1]=false;
                queue.add(new ArrayList<>(Arrays.asList(i,j-1)));        
            }
            if((j+1)<m && board[i][j+1] == 'O' && canBeChanged[i][j+1]==true){  
                canBeChanged[i][j+1]=false;
                queue.add(new ArrayList<>(Arrays.asList(i,j+1)));        
            }

        }

        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(canBeChanged[i][j]==true && board[i][j]=='O'){
                    board[i][j] = 'X';
                }
            }
        }
    }
}
