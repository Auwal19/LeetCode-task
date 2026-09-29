import java.util.Scanner;

public class NumberDivisibleByThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int sum = 0;
 		for (int i = 1; i < 30; i++){
 			if( i % 3 == 0){
 			sum += i;
 			}
 		}
 		System.out.print(sum);
    }
}