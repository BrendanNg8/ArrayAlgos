public class test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(findMax(nums));
    }
    public static int findMax(int[] arr) {
        int largest = arr[0];
        for (int i : arr) {
           if (i > largest) {
                largest= i;
           }
       }
       return largest;
     
     }
     
}
