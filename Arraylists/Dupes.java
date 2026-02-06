package Arraylists;

import java.util.ArrayList;

public class Dupes {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);
        System.out.println(test);
        System.out.println(duplicate(test));
    }
    public static ArrayList<Integer> duplicate(ArrayList<Integer> arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i : arr) {
            temp.add(i);
            temp.add(i);
        }
        return temp;
        
    }
}
