import java.math.BigDecimal;


public class TaskATMMachine{

private String firstName;
private String lastName;
private String pin;
private BigDecimal balance;
private string number;


public  Account (String firstName,String lastName,String pin, String number){
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
