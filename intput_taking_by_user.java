import java.util.Scanner;
import java.util.Arrays;
public class intput_taking_by_user {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i < arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString((arr)));

    }
}