package TWODARRAYS;

public class prac2 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        sum(matrix);
        System.out.println("_________________________");
        sum2(matrix);
        System.out.println("_________________________");
        System.out.println(avgMatrix(matrix));
    }
    public static void sum(int [][] arr) {
        int s = 0;
        int storage = 0;
        for (int i [] : arr) {
            for (int j : i) {
                s += j;
            }
            System.out.println("ROW SUM: "+s);
            storage += s;
            s=0;
            System.out.println();
        }
        System.out.println("AVG: "+(double) storage/(arr.length * arr[0].length));
    }
  
    public static void sum2(int [][] arr) {
        int s = 0;
        int storage = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                s += arr[i][j];
            }
            System.out.println("ROW SUM: "+s);
            storage += s;
            s=0;
            System.out.println();
        }
        System.out.println("AVG: "+(double) storage/(arr.length * arr[0].length));
    }
    public static double avgMatrix(int [][] arr) {
        int s = 0;
        int globalMin = Integer.MAX_VALUE;
        for (int i [] : arr) {
            for (int j : i) {
                globalMin = i[0];
                if (j < globalMin) {
                    globalMin = j;
                }
            }
            s += globalMin;
        }
        return (double) s/(arr.length);
    }
}
