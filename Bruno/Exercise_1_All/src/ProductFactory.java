
public class ProductFactory {
	
	public Product getProduct(int type) {
		if (type==1){
			return new Perishable();
		}
		else{
			return new NoPerishable();
		}
	}
}
