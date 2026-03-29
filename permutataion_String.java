public class permutataion_String {
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        findPermutaion(arr,0);

    }
    static void findPermutaion(char[] arr, int index){
        if(index == arr.length){
            System.out.println(arr);
        }
        for(int i=index; i<arr.length; i++){
            swap(index,i,arr);
            findPermutaion(arr,index+1);
            swap(index,i,arr);
        }
    }
    static void swap(int index , int i, char[] arr){
        char temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
    }
}
