import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int amount = input.nextInt();

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int smallest = number;
        int largest = number;

        for (int i = 1; i < amount; i++) {

            System.out.print("Enter number: ");
            number = input.nextInt();

            if (number < smallest) {
                smallest = number;
            }

            if (number > largest) {
                largest = number;
            }
        }

        int sum = smallest + largest;

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Sum: " + sum);
    }
}