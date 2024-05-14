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

public void checkBalance(String pin){

if(!(pin.equals(this.pin))){
System.out.println("wrong pin");
}
else{
System.out.println(balance);
}


}

public void deposit(double amount){
if (amount <= 0.0){
		System.out.println("amount can not be less than 0");

		
	}
else{
balance = balance + amount;
System.out.println("Deposited successfully");
}

}

	


public void withdraw(double amount,String pin){
if(!(pin.equals(this.pin))){
	System.out.println("Incorrect pin");
}

else if (amount <= 0.0){
		System.out.println("amount can not be less than 0");

		
	}
	else if(this.balance <= 0.0 || this.balance < amount){
		System.out.println("Insufficient fund");
	}
		else{
		
	
		balance = balance - amount;
		System.out.println("Withdraw successfully");
	

}
}
public void setPin(String pin){
this.pin = pin;
}

public String getPin(){return pin;}

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
press 1 -> Create account
press 3 -> Deposit
press 4 -> Withdraw
press 5 -> Check balance
press 7 -> Change pin
""");
String userInput = scanner.nextLine();

switch (userInput){
case "1":
       createUserAccount();
       break;   

case "3":

   	System.out.println("Enter AccountNumber: ");
	String accountNumber = scanner.nextLine();
	System.out.println("Enter Amount: ");
	double amount = scanner.nextDouble();
	depositMethod(accountNumber,amount);
	
	mainMenu();


	break;

case "4":
	System.out.println("Enter AccountNumber: ");
	String acctNumber = scanner.nextLine();
	
	System.out.println("Enter pin: ");
	String pin = scanner.nextLine();

	System.out.println("Enter Amount: ");
	double withdrawAmount = scanner.nextDouble();
	withdrawMethod(acctNumber,withdrawAmount,pin);
	
	mainMenu();

	break;


case "5":
	System.out.println("Enter AccountNumber: ");
	String accNumber = scanner.nextLine();
	
	System.out.println("Enter pin: ");
	String digitpin = scanner.nextLine();
	checkBalance(accNumber,digitpin);

	mainMenu();

	break;
	
case "7":
	
	System.out.println("Enter AccountNumber: ");
	String accNumber2 = scanner.nextLine();
	
	System.out.println("Enter old pin: ");
	String oldPin = scanner.nextLine();

	System.out.println("Enter newPin: ");
	String newPin = scanner.nextLine();
	changePin(accNumber2,oldPin,newPin);
	mainMenu();

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



public static void depositMethod(String acctNumber,double amount){
TaskATMMachine output = findAccountNumber(acctNumber);

if(output == null){
System.out.println("Account number is incorrect");
mainMenu(); 
}

output.deposit(amount);

}


public static void withdrawMethod(String acctNumber,double amount, String pin){
TaskATMMachine output = findAccountNumber(acctNumber);

if(output == null){
System.out.println("Account number is incorrect");
mainMenu(); 
}

output.withdraw(amount,pin);

}

public static void checkBalance(String accountNumber,String pin){
TaskATMMachine output = findAccountNumber(accountNumber);

if(output == null){
System.out.println("Account number is incorrect");
mainMenu(); 
}

output.checkBalance(pin);



}
public static void changePin(String accountNumber,String oldPin,String newPin){
TaskATMMachine output = findAccountNumber(accountNumber);

if(output == null){
System.out.println("Account number is incorrect");
mainMenu(); 
}

else if(output.getPin().equals(oldPin)){
output.setPin(newPin);
System.out.println("new pin is " + output.getPin());

}

else{
System.out.println("wrong pin");
}

}
















}