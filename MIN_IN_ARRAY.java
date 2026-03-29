import java.util.Scanner;

public class MIN_IN_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int second_min = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("MIN= " + min);
        for(int j=0; j<n; j++)
        {
            if(arr[j]< second_min && arr[j]!= min)
            {
                second_min = arr[j];
            }
        }
        System.out.println("SECOND_MIN = "+ second_min);


    }
}