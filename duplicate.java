public class duplicate {
    public static void main(String[] args) {
        String[] arr = {"SS", "Math", "Health", "ELA", "Engineering", "APCSA", "Chemistry", "Chemistry", "Spanish"};
        System.out.println(dupes(arr));

    }
    public static boolean dupes(String[] arr) {
        int idx = 0;
        String curr = "";
        while (idx < arr.length) {
            curr = arr[idx];
            int innerIdx = 0;
            for (String val : arr) {
                if (innerIdx != idx) { 
                    if (val.equals(curr)) {
                        return true;
                    }
                }
                innerIdx++;
            }
            idx++;
        }
        return false;
    }
}