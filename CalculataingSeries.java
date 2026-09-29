public class CalculatingSeries {
    public static void main(String[] args) {

        double pi = 0.0;

        for (int i = 1; i <= 200000; i++) {

            if (i % 2 == 1) {
                pi += 4.0 / (2 * i - 1);
            }
            else {
                pi -= 4.0 / (2 * i - 1);
            }

            if (i <= 10) {
                System.out.println(i + "\t" + pi);
            }
        }

        System.out.println();
        System.out.println("Pi after 200000 terms = " + pi);
    }
}