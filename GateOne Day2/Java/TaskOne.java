import java.util.Scanner;

public class TaskOne{

	public static void main(String...args){
	
		Scanner scanner = new Scanner(System.in);

		int[] scores = new int[10];

		for(int counter = 0; counter < 10; counter++){
			System.out.print("Enter scores");
			scores[counter] = scanner.nextInt();
			

		}

	}


}