import java.util.Scanner;

public class TenScoresFour{
	public static void main(String...args){
		
		Scanner scanner = new Scanner(System.in);
		int sumOfEven = 0;

		for(int i =0; i<10; i++){
			System.out.println("Enter scores: ");
			int scores  = scanner.nextInt();
			if(i % 2 ==0);{
				sumOfEven += i;

		}	
		int average  = sumOfEven / 10;
		System.out.println("the sum of even index is:" + sumOfEven);
				
		}
	}
}
