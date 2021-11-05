package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                rsl = false;
                break;
            }
          }
        return rsl;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] str = MatrixCheck.extractDiagonal(board);
        for (int i = 0; i < board.length; i++) {
            if (str[i] == 'X' && (MatrixCheck.monoVertical(board, i) || MatrixCheck.monoHorizontal(board, i))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
