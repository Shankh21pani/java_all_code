import java.util.ArrayList;
public class some_Easy {
    public static void main(String[] args) {
//        numberprint(10);
//        System.out.println(factorial(10));
//        System.out.println(fabo(5));
//        mult(10);
//        System.out.println(reversenum(12345,0));
//        System.out.println(sumOFind(12345));
        System.out.println(countzero(1234567,0));

    }
    // printing number
    static void numberprint(int num){
        if(num == 0) return;
        //System.out.println(num);  // Here first print number after call function
        numberprint(num-1);
        System.out.println(num); // Here first recursive call from fuction complete after return number
    }
    // factorial
    static int factorial(int num){
        if(num <= 1) return 1;
        return num * factorial(num-1);
    }
    // fabonaci series
    static int fabo(int num){
        if(num <= 1) return num;
        return fabo(num-1) + fabo(num-2);

    }

    static void mult(int num){
        if(num == 0) return;
        mult(num -1);
        System.out.print(5*num + " ");
    }
    // reverse of number
    static int reversenum(int num,int rev ){
        if(num == 0) return rev;
        int n = num%10;
        rev = rev*10 + n;
        return reversenum(num / 10,rev);
    }
    // sum of find number
    static int sumOFind(int num){
        if(num == 0) return 0;
        return sumOFind(num/10) + (num%10);
    }
    static int countzero(int num , int count){
        if(num == 0) return count;
        int digit = num%10;
        if(digit == 0) count++;
        return countzero(num/10,count);


    }

}
