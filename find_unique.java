import java.util.Arrays;
import java.util.Scanner;
public class find_unique{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = -1;
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if (arr[i]==arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int k=0; k<n; k++)
        {
            if (arr[k] > 0)
            {
                ans = arr[k];
            }
        }
        System.out.println(ans);
    }
}