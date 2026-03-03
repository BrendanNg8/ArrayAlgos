
import java.util.ArrayList;

class removeDupes {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            arr.add((int) ((Math.random()) * 10) + 1);
        }
        System.out.println(removeDuplicates(arr));

    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {
        System.out.println("Original Array: "+arr);
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(i).equals(arr.get(j))) {
                    System.out.println("Removing: "+arr.get(i));
                    arr.remove(i);
                    break;
                }
            }
        }
        return arr;
    }
}