import java.util.Scanner;


public class CreditCard extends Payment{
	
	private String name;
	private int number;
	Scanner sc = new Scanner(System.in);
	
	public CreditCard(){
		
	}
	
	public void setName(String name){
	this.name=name;
	}	
	
	public void setNumber(int number){
		this.number=number;	
	}
	
	public String getName(){
		return name;
	}
	
    public int getNumber(){
		return number;
	}
    
    public void pay(double saldo){
		System.out.println("CREDITCARD PAYMENT");
		System.out.println("Name: ");
		setName(sc.next());
		System.out.println("CREDITCARD NUMBER: ");
		setNumber(sc.nextInt());
		System.out.println("TOTAL TO PAY WITH CREDITCARD: " + "\t$" +saldo);
	}
}
