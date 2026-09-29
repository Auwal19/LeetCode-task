public class ModifiedCompundInterest{
	public static void main(String[] args) {
		
		double amount;
		double principle = 1000.00;
		
		System.out.print("Rate\tAmount");
		
		for(int rate = 5; rate <= 10; rate++){
			System.out.print(rate + "%\t");
			
			for (int year = 1; year <= 10; year++){
				amount = principal * Math.pow(1.0 + rate / 100.0, year);
				
				System.out.printf("%.2f%n", amount);
	}
	
	System.out.println();
	}
	}
}