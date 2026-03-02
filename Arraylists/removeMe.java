package Arraylists;

import java.util.ArrayList;

public class removeMe {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        System.out.println("Original: "+a);
        System.out.println("After: "+remove(a, 3));
    }
    public static ArrayList<Integer> remove(ArrayList<Integer> arr, int target) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == target) {
                arr.remove(i);
            }
        }
        return arr;
    }
    
}
