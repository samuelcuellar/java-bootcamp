
public class Cash extends Payment {

	public Cash(){
		
	}
	
	public void pay(double saldo){
		System.out.println("CASH PAYMENT");
		System.out.println("TOTAL TO PAY BY CASH: " + "\t$" +saldo);
	}
}
