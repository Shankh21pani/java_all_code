import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        int row = 4;
        int col = 4;
        boolean[][] visited = new boolean[row][col];

        paths(0, 0, row-1, col-1, "",visited);


    }

    static void paths(int sr, int sc, int er, int ec, String str,boolean[][] visited) {
        if(sc<0 || sr<0) return;
        if (sc > ec || sr > er) return;
        if(visited[sr][sc] == true) return;
        if (sc == ec && sr == er) {
            System.out.println(str);
            return;
        }
        visited[sr][sc] = true;
        // for down
        paths(sr + 1, sc, er, ec, str + "D",visited);
        // for right 
        paths(sr, sc + 1, er, ec, str + "R",visited);
        // for left
        paths(sr,sc-1,er,ec,str+"L",visited);
        // for up 
        paths(sr-1,sc,er,ec,str+"U",visited);
        
        // backtracking
        
        visited[sr][sc] = false;
    }
}