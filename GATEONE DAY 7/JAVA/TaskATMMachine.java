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

public static ArrayList<TaskATMMachine> atm = new ArrayList<>();
public static void main(String... args){

}
























}