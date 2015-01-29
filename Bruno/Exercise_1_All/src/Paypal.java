import java.util.Scanner;


public class Paypal extends Payment {
	 
	private String email;
	private String pass;
	Scanner sc = new Scanner(System.in);
	
	public Paypal(){
		
	}
	
	public void setEmail(String email){
		this.email=email;
	}	

	public void setPass(String pass){
		this.pass=pass;
	}
	
	public String getEmail(){
		return email;
	}
	
    public String getPass(){
		return pass;
	}
    
    public void pay(double saldo){
		System.out.println("PAYPAL PAYMENT");
		System.out.println("Email: ");
		setEmail(sc.next());
		System.out.println("Password: ");
		setPass(sc.next());
		System.out.println("TOTAL TO PAY WITH PAYPAL: " + "\t$" +saldo);
	}

}
