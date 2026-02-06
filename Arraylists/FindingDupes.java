package Arraylists;

import java.util.ArrayList;

public class FindingDupes {
    public static void main(String[] args) {
        ArrayList<Integer> testing = new ArrayList<>();
        testing.add(1);
        testing.add(2);
        testing.add(2);
        testing.add(5);
        testing.add(5);
        testing.add(5);
        System.out.println(findDuplicates(testing));
    }
    public static boolean findDuplicates(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
