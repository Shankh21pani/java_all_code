public class no_steps_reduce {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(stepcount(num,0));
    }
    static int stepcount(int num,int count){
        if(num == 0) return count;
        if(num % 2 == 0){
            return stepcount(num/2,count+1);
        }
        return stepcount(num-1,count+1);
    }
}
