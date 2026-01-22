public class selection {
    public static void main(String[] args) {
        String[] arr = {"SS", "Math", "Health", "ELA", "Engineering", "APCSA", "Chemistry", "Chemistry", "Spanish"};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (i < arr.length) {
                System.out.println("["+arr[i]+", "+arr[i+1]+"]");
            } 
        }
        System.out.println(arr[arr.length - 1]);
    }
}

