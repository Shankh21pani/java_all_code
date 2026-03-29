import java.util.Scanner;
public class array_is_sorted_or_not {
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
        boolean count = true;
        for(int i=1; i<n; i++)
        {
            if(arr[i] < arr[i-1])
            {
                count = false;
                break;
            }
        }
        System.out.println("Count = "+ count);

    }
}