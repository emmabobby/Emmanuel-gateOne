import java.util.*;


public class TaskATMMachine{

private String firstName;
private String lastName;
private String pin;
private double balance;
private String number;


public TaskATMMachine(String firstName,String lastName,String pin, String number){
this.firstName = firstName;
this.lastName = lastName;
this.pin = pin;
this.number = number;
}

public double checkBalance(String pin){
double result = 0.0;
if(pin.equals(this.pin)){
result = balance;
}
return result;

}

public void deposit(double amount){
validateAmount(amount);
balance = balance + amount;


}
public void validateAmount(double amount){
	if (amount <= 0.0){
		System.out.println("amount can not be less than 0");
		
	}
}

public void withdraw(double amount,String pin){
if(!(pin.equals(this.pin))){
	System.out.println("Incorrect pin");
}

validateAmount(amount);
	if(this.balance < 0.0){
		System.out.println("Insufficient fund");
	}
	
		balance = balance - amount;
}

public String getNumber(){return number;}

public String toString(){
return String.format(" %s%n %s%n %s%n %s%n",firstName,lastName,pin,number);

}

public static ArrayList<TaskATMMachine> atm = new ArrayList<>();

public static TaskATMMachine createAccount(String firstName,String lastName,String pin){
TaskATMMachine account = new TaskATMMachine(firstName,lastName,pin,"231" + (atm.size()+1));
atm.add(account);
return account;
}



public static void mainMenu(){
Scanner scanner = new Scanner(System.in);
System.out.println("""
press 1 -> Create account;

""");
String userInput = scanner.nextLine();

switch (userInput){
case "1":
       createUserAccount();
       break;   


}}

public static void createUserAccount(){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter firstName: ");
   String firstName = scanner.nextLine();

   System.out.println("Enter lastName: ");
   String lastName = scanner.nextLine();
   
   System.out.println("Enter pin: ");
   String pin = scanner.nextLine();

TaskATMMachine result = createAccount(firstName,lastName,pin);
System.out.println("Account created successfully\nAccount number is " + result.getNumber());
mainMenu();

}
public static void main(String... args){
mainMenu();
}  


public static TaskATMMachine findAccountNumber(String acctNumber){
TaskATMMachine result = null;

for(TaskATMMachine value : atm){
if(value.getNumber().equals(acctNumber)){
result = value;
}
}
return result;

}


public static void deposit(String acctNumber,double amount){
TaskATMMachine output = findAccountNumber(acctNumber);

if(output == null){
System.out.println("Account number is incorrect");
mainMenu(); 
}

output.deposit(amount);

}























}