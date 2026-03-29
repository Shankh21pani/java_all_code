import java.util.Scanner;
import java.util.Arrays;
public class newtome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
