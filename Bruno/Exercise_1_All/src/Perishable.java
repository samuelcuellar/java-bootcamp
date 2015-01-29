//Class which extends of Product
public class Perishable extends Product {
	
	//Attributes of Perishable
	private String name;
	private int price;
	private int code;

	public Perishable(){
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
	
	public void setCode(int code){
		this.code = code;
	}
	
	public int getCode(){
		return code;
	}
	
	public void showProduct(){
		System.out.print("Product: "+getName());
		System.out.print(", Code: "   +getCode());
		System.out.print(", Price: "  +getPrice());
		System.out.println();

	}
}
