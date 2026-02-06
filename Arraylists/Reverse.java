package Arraylists;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("a");
        arr.add("b");
        arr.add("c");
        arr.add("d");
        arr.add("e");
        
        System.out.println(arr +" -> "+reverse(arr));

        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i).equals("b")) {
                arr.remove(i);
            }
        }
        System.out.println("Removed B: "+arr);
    }
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayList<String> temp = new ArrayList<>();
        for (int i = arr.size() - 1; i >= 0; i--) {
            temp.add(arr.get(i));
        }
        return temp;
    }
}
