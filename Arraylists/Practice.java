package Arraylists;

// bng -> 2/2/26 -> WrapperClass
import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        Integer i = 30;
        Double d = 40.3;

        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);
        int newInt = i;
        double newDouble = d;
        System.out.println((double) newInt * newDouble);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Michael");
        list.add("Jessica");
        list.add("Lee");
        System.out.println(list);
        list.add(1, "Sarah");
        System.out.println(list);
        String store = list.set(2, "Mary");
        list.get(3);
        list.size();

        ArrayList<String> names = new ArrayList<String>();
        names.add("Avery");
        names.add("Brendan");
        names.add("Carson");
        names.add("Daniel");
        
        for (int n = 0; n < names.size(); n++) {
        System.out.println(names.get(n));
        if (names.get(n).substring(0, 1).equals("B")) {
            names.set(n, "Lebron");
        }
        /*
        int z = 0;
        while (z < names.size()) {
        System.out.println(names.get(z));
        z++;
        */

        for (String name : names) {
            System.out.println(name);
        }
        int b = 0;
        while (b < names.size()) {
            if (names.get(b).indexOf("Avery") >= 0) {
                names.remove(b);
            }
            else {
                i++;
            }
        }
        System.out.println(names);
         
}


    }
    }

