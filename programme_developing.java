import java.util.Scanner;
//import java.util.Arrays;
public class programme_developing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int index = -1;
        for (int i=0;i<n;i++)
        {
            if(arr[i] == x)
            {
                index = i;
                System.out.println("INDEX= "+ index);
            }
        }
    }
}