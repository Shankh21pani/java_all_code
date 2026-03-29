import java.util.ArrayList;
import java.util.Arrays;

public class N_Queens {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        char board[][] = new char[4][4];
        for(char row[] : board) Arrays.fill(row,'.');
        places(board,0);
    }
    static void places(char[][] board,int row){
        if(row == board.length){
            for(int i=0; i<board.length; i++){
                for(int j=0; j<board[0].length; j++){
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();

            }
            System.out.println("---Next Step---");
            return;
        }
        for(int i=0; i<board[0].length; i++){
            if(issafe(board,row,i)) {
                board[row][i] = 'Q';
                places(board, row + 1);
                board[row][i] = '.';
            }
        }
    }
    static boolean issafe(char board[][], int row,int col){
        for(int i= row-1; i>=0;i--) {
            if (board[i][col] == 'Q') return false;
        }
        for(int i= row-1 , j= col-1; i>=0 && j>= 0; i--,j--){
            if(board[i][j] == 'Q') return false;

        }
        for(int i= row-1,j= col+1; i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q') return false;
        }
        return true;



    }

}
