import java.util.Scanner;

public class TenScoresFive{
	public static void main(String...args){
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		for(int i =2; i<= 11; i++){
			System.out.println("Enter scores: ");
			int scores  = scanner.nextInt();
			sum += scores;
				
		}	
		int average  = sum / 5;
		System.out.println("the sumOfEven is:" + average); 
				
		
	}
}