import java.util.*;

public class CheckerBoard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gimme an integer >1: ");

        int num = input.nextInt();

        if (num > 1) {
            int[][] board = new int[num][num];
            for (int i = 0; i < board.length; i++) {
                for (int r = 0; r < board[i].length; r++) {
                    if ((i + r) % 2 == 0) {
                        board[i][r] = 0;
                    } else {
                        board[i][r] = 1;
                    }
                }
            }
            displayCheckerboard(board);

            System.out.println("Replacing middle sqaure with 5");

            board[num / 2][num / 2] = 5;
            displayCheckerboard(board);
            System.out.println();

        }
    }   

    public static void displayCheckerboard(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }

            System.out.println();
        }
    }
}