public class Diamond {
    public static void main(String[] args) {

        // Top half
        for (int row = 1; row <= 5; row++) {

            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int row = 4; row >= 1; row--) {

            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= row * 2 - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}