import java.util.Scanner;
public class second_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int second_max = 0;
        System.out.print("Enter the range of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("MAX= " + max);
        for(int j=0; j<n; j++)
        {
            if(arr[j] > second_max && arr[j]!=max)
            {
                second_max = arr[j];
            }
        }
        System.out.println("Second_Max = " + second_max);

    }
}