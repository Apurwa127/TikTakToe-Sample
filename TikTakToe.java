import java.util.Scanner;

public class TikTakToe {
    public static void main(String[] args) {

        char[] input = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your choice");
           int value = scanner.nextInt();
           input[value-1] = 'X';



            System.out.println(input[6] + "  | " + input[7] + " | " + input[8]);
            System.out.println("---*---*-----");
            System.out.println(input[3] + "  | " + input[4] + " | " + input[5]);
            System.out.println("---*---*-----");
            System.out.println(input[0] + "  | " + input[1] + " | " + input[2]);

        }
    }
