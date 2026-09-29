import java.util.Scanner;

public class ModifiedDiamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an odd number from 1 to 19: ");
        int number = input.nextInt();

        if (number >= 1 && number <= 19 && number % 2 != 0) {


            for (int row = 1; row <= number; row += 2) {

                for (int space = number; space > row; space -= 2) {
                    System.out.print(" ");
                }

                for (int star = 1; star <= row; star++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int row = number - 2; row >= 1; row -= 2) {

                for (int space = number; space > row; space -= 2) {
                    System.out.print(" ");
                }

                for (int star = 1; star <= row; star++) {
                    System.out.print("*");
                }

                System.out.println();
            }

        } else {
            System.out.println("Please enter an odd number from 1 to 19.");
        }
    }
}