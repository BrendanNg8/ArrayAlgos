//package TWODARRAYS;

import java.util.Arrays;

public class prac3 {
    public static void main(String[] args) {
        String[][] matrix = {{"Jack", "Jill", "Jane", "Joey"}, {"Maura", "Molly", "Mason", "Maureen"}, {"Emma", "Eileen", "Elizabeth", "Emma"}};
        String[][] matrixCopy = {{"Jack", "Jill", "Jane", "Joey"}, {"Maura", "Molly", "Mason", "Maureen"}, {"Emma", "Eileen", "Elizabeth", "Emma"}};
        String[][] shortened = shortenMe(matrix);
        System.out.println(Arrays.deepToString(shortened));

        int rowWithMostDupes = countDuplicates(matrix);
        System.out.println("Row with most duplicates: " + rowWithMostDupes);

        String[][] shifted = shiftMe(matrixCopy);
        System.out.println(Arrays.deepToString(shifted));
    }
    public static String[][] shortenMe(String[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != null && mat[i][j].length() > 4) {
                    mat[i][j] = mat[i][j].substring(0, 3);
                }
            }
        }
        return mat;
    }
    public static int countDuplicates(String[][] mat) {
        int dupes = 0;
        int highestDupe = 0;
        int idx = 0;
        for (int i = 0; i< mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int k = 0; k < mat[i].length; k++) {
                    if (mat[i][j].equals(mat[i][k])) {
                        dupes++;
                    }
                }
            }
            if (dupes > highestDupe) {
                highestDupe = dupes;
                idx = i;
            }
            dupes = 0;
        }
        return idx;
    }
    public static String[][] shiftMe(String[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int total = rows * cols;

        String[] flatten = new String[total];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flatten[idx] = mat[i][j];
                idx++;
            }
        }
    
        String[] shifted = new String[total];
        shifted[0] = flatten[total - 1];
        for (int i = 1; i < total; i++) {
            shifted[i] = flatten[i - 1];
        }
    
        String[][] product = new String[rows][cols];
        idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = shifted[idx];
                idx++;
            }
        }
    
        return product;
    }
    
}
