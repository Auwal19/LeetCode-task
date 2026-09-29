public class TrianglePrinting {
    public static void main(String[] args) {

        for (int row = 1; row <= 10; row++) {

            for (int i = 1; i <= row; i++) {
                System.out.print("*");
            }

            System.out.print("     ");

            for (int i = 10; i >= row; i--) {
                System.out.print("*");
            }

            System.out.print("     ");

            for (int i = 1; i < row; i++) {
                System.out.print(" ");
            }

            for (int i = 10; i >= row; i--) {
                System.out.print("*");
            }

            System.out.print("     ");

            for (int i = 10; i >= row; i--) {
                System.out.print(" ");
            }

            for (int i = 1; i <= row; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}