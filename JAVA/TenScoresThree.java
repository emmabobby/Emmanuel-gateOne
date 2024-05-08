import java.util.Scanner;

public class TenScoresThree{
	public static void main(String...args){
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		for(int i =0; i<10; i++){
			System.out.println("Enter scores: ");
			int score  = scanner.nextInt();
			sum += score;

			
		int average  = sum / 10;
		System.out.println("the sum is" + sum );
		System.out.println("the average is" + average );			
		}
	}
}
