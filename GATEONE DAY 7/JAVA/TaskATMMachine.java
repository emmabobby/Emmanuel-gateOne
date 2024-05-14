import java.math.BigDecimal;


public class TaskATMMachine{

private String firstName;
private String lastName;
private String pin;
private BigDecimal balance;
private String number;


public TaskATMMachine(String firstName,String lastName,String pin, String number){
this.firstName = firstName;
this.lastName = lastName;
this.pin = pin;
this.number = number;
}

public BigDecimal checkBalance(String pin){
BigDecimal result = null;
if(pin.equals(this.pin)){
result = balance;
}
return result;

}

public void deposit(BigDecimal amount){
validateAmount(amount);
if(balance == null){balance = BigDecimal.ZERO;}
balance = balance.add(amount);


}
public void validateAmount(BigDecimal amount){
	if (amount.compareTo(BigDecimal.ZERO) <= 0){
		System.out.println("amount can not be less than 0");
		
	}
}

public void withdraw(BigDecimal amount,String pin){
if(!(pin.equals(this.pin))){
	System.out.println("Incorrect pin");
}

validateAmount(amount);
if(balance == null){balance = BigDecimal.ZERO;}
	if(this.balance.compareTo(amount) < 0){
		System.out.println("Insufficient fund");
	}
	
		balance = balance.subtract(amount);
}



























}