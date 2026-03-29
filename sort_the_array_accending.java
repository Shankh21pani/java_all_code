import java.util.Scanner;
import java.util.Arrays;
public class sort_the_array_accending {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arrays");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int temp;
        for(int i=0; i<n; i++)
        {
           for (int j=0; j<n-i-1; j++)
           {
               if(arr[j]<arr[j+1])
               {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
        }
        System.out.println(Arrays.toString(arr));

    }
}