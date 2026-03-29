public class power_of_2 {
    public static void main(String[] args) {
        int num = 128;
        System.out.println(power(num));
    }
    static boolean power(int num){
        if(num == 1) return true;
        if(num % 2 == 0){
            return power(num/2);
        }
        return false;
    }
}
