import java.util.Scanner;
public class ulta_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) //or for ( int i=1;i<=rows;i++)
        {
            for (int j = 1; j<= i; j++ ) // or for( int j = 1;j=rows-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}