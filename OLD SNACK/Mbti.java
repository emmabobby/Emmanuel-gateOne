import java.util.*;


public class MbtiOne {
	public static void main(String...args) {

		Scanner scan = new Scanner(System.in);

		String[] mbti = {
" expend energy, enjoy groups", "conserve energy, enjoy one-on-one",

"Interpret litrally", "look for meaning and possibilities",

" logical,thinking, questioning", " empathetic, feeling, accomodating",

"organized, orderly", "flexible, adaptable",

"more outgoing, think out loud", "more reserved, think to yourself",

"practical, realistic, experiential", "imaginative innorvative, theoretical",

"candid,straight forward, frank", " tactiful, kind, encouraging",

"plan, schedule", "unemplanned, spontenous",

"seek many task, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate",

"standard, usual,conventional", "different,novel,unique",

"firm, tend to criticize, hold the line", "gentle, tend to apprecite, conciliate",

"regulated, structured", "easy-going,live and let live",

"external, communicative, express yourself", "internal, recticent, keep to yourself",

"focus on here-and-now", "look to the future, global perspective,big picture",

"tough-minded, just", "tender-hearted, merciful",

"preparation, plan ahead", "go with the flow, adapt as you go",

"active,initiate", "reflective, delibrate",

"facts, things, what is", "ideas, dreams, what could be, philosophical",

"matter of fact, issues-oriented", "sensitive, people-oriented, "compassionate",

"control, govern", "latitude,freedom"};

                  System.out.println(" what is your name: ");
                  String name = scan.nextLine();

		ArrayList<String> ans = new ArrayList<>();
		ArrayList<String> option = new ArrayList<>();
			
               
		for(int index = 0 ;index < mbti.length;index += 2 ){
			System.out.println("A." + mbti[index] + "          B." + mbti[index + 1]);
			String answer = scan.nextLine().toUpperCase();
			

			while( !(answer.equals("A") || answer.equals("B"))) {
				System.out.println("Expected A or B as Response\nI know this is an error,please retry again: ");
				answer = scan.nextLine().toUpperCase();
			}
                          	if(answer.equals("A")){
					option.add("A. " + mbti[index]);}

						if(answer.equals("B")) {
							option.add("B. " + mbti[index + 1]);}
				ans.add(answer);
                        }
			


			int increment = 5;
		
	                
			System.out.println("hello " + name + " you selected");

			for(int index = 0; index < option.size();index += increment) {	
			int countA = 0;
			int countB = 0; 
                                   for(int temp =index; temp < index + increment; temp++){
					System.out.println(option.get(temp));

			if(ans.get(temp).equals("A")){
					countA += 1;}

				if(ans.get(temp).equals("B")){countB += 1;}
					
					
					
			}

				System.out.println("number of A selected: " + countA);
				System.out.println("number of B selected: "+ countB + "\n\n");	

					}
				
			
	}

		

}