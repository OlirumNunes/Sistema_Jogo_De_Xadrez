package application;

import chess.ChessPiece;
import chess.Color;

/**
 * The UI class provides methods to print the chess board and its pieces.
 */
public class UI {

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    /**
     * Prints the chess board with the given pieces.
     *
     * @param pieces a 2D array of ChessPiece objects representing the chess board.
     */
    public static void printBoard(ChessPiece[][] pieces) {
        /**
         * Iterates through the rows of the chess board and prints each row and its pieces.
         *
         * @param pieces a 2D array of ChessPiece objects representing the chess board.
         */
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " "); // Prints the row number in reverse order.
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j]); // Prints the ChessPiece at the specified position.
            }
            System.out.println(); // Prints a new line after each row.
        }
        System.out.println("  a b c d e f g h"); // Prints the alphabetical column headers.
    }

    private static void printPiece(ChessPiece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);
            } else {
                System.out.print(ANSI_YELLOW + piece + ANSI_RESET);
            }
        }
        System.out.print(" ");
    }
}
