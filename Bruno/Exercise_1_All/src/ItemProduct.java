
public class ItemProduct {
	
	private Product pr;
	private int units;
	
	public ItemProduct(Product p, int u){
		pr=p;
		units=u;
	}
	
	public Product getProduct(){
		return pr;
	}
	
	public int getUnits(){
		return units;
	}
	
	public void changeUnits(int newU){
		units=newU;
	}
	
	public int subtotalItem(){
		int subtotal = pr.getPrice() * units;
		return subtotal;
	}
	
	public void showItem(){
		pr.showProduct();
		System.out.println("Units: " +getUnits());
	}
}
