
public class Offers {
	
	private String name;
	private int perc;
	
	Offers(String name, int perc){
		this.name=name;
		this.perc=perc;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public void setPerc(int perc){
		this.perc = perc;
	}
	
	public String getName(){
		return name;
	}
	
	public int getPerc(){
		return perc;
	}
	
	public double priceOffer(int price){
		return  price * (perc) * (0.01);
	}

}
