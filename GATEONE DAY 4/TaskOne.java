import java.util.*;

public class TaskOne{

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[3][3];


        for (int index = 0; index < board.length; index++) {
            for (int counter = 0; counter < board.length; counter++) {
                board[index][counter] = "-";
            }
        
for (int count = 0; count < board.length; count++) {
            for (int index = 0; index < board.length; index++) {
                System.out.println("Enter X or O:");

                System.out.println("user1 choose a space to put :");
                int user1 = scanner.nextInt();

                board[count][index] = "X";
                System.out.println(board[count][index]);

                System.out.println("user2 choose a space to put :");
                int user2 = scanner.nextInt();
                board[count][index] = "O";
                System.out.println(board[count][index]);

            }
        }






        for (int count = 0; count < board.length; count++) {
            for (int counter = 0; counter < board.length; counter++) {
                System.out.print(board[count][counter] + "  ");
            }
            System.out.println();
        }
}
}