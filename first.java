public class first {

    // linear recursion
    static void count(int num){
        if(num == 0) return;
        count(num -1);
        System.out.println(num);
//        count(num -1);
    }

    static int sum(int val ){
        if(val == 0) return 0;
        return val+sum(val-1);


    }
    static int fact(int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num-1);
    }

    static int numsum(int num){
        if(num == 0){
            return 0;
        }
        int digit = num % 10;
        return digit + numsum(num / 10);
    }
    static int countdigit(int num){
        if(num == 0) return 0;

        return 1 + countdigit(num / 10);


    }
    static int sumarr(int[] arr, int i){
        if(i== arr.length) return 0;
        return arr[i] + sumarr(arr,i+1);
    }

    // Binary recursion
    static int fib(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;
        return fib(num-1) + fib(num-2);
    }
    public static void main(String[] args) {
//        count(10);
//        System.out.println(sum(10));
//        System.out.println(fact(15));
//        System.out.println(numsum(123456789));
//        System.out.println(countdigit(1234));
//        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(sumarr(arr,0));sout
        System.out.println(fib(4));
//        System.out.println(fib(4));
    }
}
