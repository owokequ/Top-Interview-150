import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #36 — Valid Sudoku
 */
public class ValidSudoku {

    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {
        Set<String> res = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char value = board[i][j];

                if (value == '.') {
                    continue;
                }

                int boxRow = i / 3;
                int boxCol = j / 3;

                if (!res.add("row:" + i + ";" + value)
                        || !res.add("col:" + j + ";" + value)
                        || !res.add("box" + boxRow + ":" + boxCol + ":" + value)) {
                    return false;
                }

            }
        }
        return true;
    }
}
