import java.util.Arrays;
public class first_array_java {
    public static void main(String[] args)
    {
        int arr [] = {10,20,50,60,99,80,22,23,51,2,88,5};
        int max = arr[2];
        for (int i =0; i < arr.length; i++)
        {
            if (arr[i] < max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);



    }

}