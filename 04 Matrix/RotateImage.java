import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #48 — Rotate Image
 */
public class RotateImage {
    public static void main(String[] args) {
        rotate(new int[][] {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } });
    }

    public static void rotate(int[][] matrix) {
        int buffer;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[i].length - 1; j > i; j--) {
                buffer = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buffer;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int r = matrix[i].length - 1;
            while (l < r) {
                buffer = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = buffer;
                l++;
                r--;
            }
        }
    }
}
