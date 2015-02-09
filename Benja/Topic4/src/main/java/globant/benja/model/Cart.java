package globant.benja.model;
import java.util.ArrayList;

public class Cart {
	
	private ArrayList<CartLine> lines = new ArrayList<CartLine>();
	private double total;	
	
	public Cart() {
	}
	
	public ArrayList<CartLine> getLines() {
		return lines;
	}
	
	public double getTotal() {
		return total;
	}

	public void calcularTotal(){
		double sum = 0;
		for(CartLine i : lines){
			sum = sum + i.getSubTotal();
		}
		total = sum;
	}
	
	@Override
	public String toString() {
		return "Cart: \n" + lines + "\nTotal: $" + total;
	}

}
