import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        char[] input = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        char turn = 'X';

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int value;

            do {
                System.out.println(input[6] + "  | " + input[7] + " | " + input[8]);
                System.out.println("---*---*---");
                System.out.println(input[3] + "  | " + input[4] + " | " + input[5]);
                System.out.println("---*---*---");
                System.out.println(input[0] + "  | " + input[1] + " | " + input[2]);
                System.out.println("Please enter your choice from 1-9");
                value = scanner.nextInt();

             } while (input[value - 1] == 'X' || input[value - 1] == 'O');
            input[value - 1] = turn;

            if (input[0] == turn && input[1] == turn && input[2] == turn ||
                    input[3] == turn && input[4] == turn && input[5] == turn ||
                    input[6] == turn && input[7] == turn && input[8] == turn ||
                    input[0] == turn && input[3] == turn && input[6] == turn ||
                    input[1] == turn && input[4] == turn && input[7] == turn ||
                    input[2] == turn && input[5] == turn && input[8] == turn ||
                    input[8] == turn && input[4] == turn && input[0] == turn ||
                    input[6] == turn && input[4] == turn && input[2] == turn) {

                System.out.println(turn + " is the winner");
                System.out.println("This is a test");
                break;
            }


            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }


        }
    }
}