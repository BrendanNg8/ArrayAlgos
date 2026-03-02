package Arraylists;

import java.util.ArrayList;

public class HomeworkFriday {
    public static void main(String[] args) {
        ArrayList<Integer> testing = new ArrayList<>();
        testing.add(1);
        testing.add(2);
        testing.add(2);
        testing.add(5);
        testing.add(5);
        testing.add(5);
        System.out.println(findDuplicates(testing));
        findPairs(testing);
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
    public static void findPairs(ArrayList<Integer> arr) {
        int checker = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((checker + 1) <= arr.size() - 1) {
                System.out.println(arr.get(i) +", "+arr.get(i + 1));
            } else {
                return;
            }

        }
    }
}
