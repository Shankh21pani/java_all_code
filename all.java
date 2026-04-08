import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {

        int row = 4;
        int col = 6;

        paths(1, 1, row, col, "");


    }

    static void paths(int sr, int sc, int er, int ec, String str) {
        if (sc > ec || sr > er) return;
        if (sc == ec && sr == er) {
            System.out.println(str);
            return;
        }
        // for down
        paths(sr + 1, sc, er, ec, str + "D");
        // for right 
        paths(sr, sc + 1, er, ec, str + "R");
    }
}