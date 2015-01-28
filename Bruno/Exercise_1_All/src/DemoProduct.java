public class DemoProduct {

	public static void main(String[] args) {
		
		Catalog c = new Catalog();
	    
	    c.addCatalog("arroz",10,12345,1);
	    c.showCatalog();
	    c.addCatalog("fideo",11,67890,1);
	    c.showCatalog();
	    c.addCatalog("tomate",12,16273,2);
	    c.showCatalog();
	    
	    c.buyProduct("arroz", 3);
	    c.buyProduct("fideo",4);
	    c.showBuy();
	    c.showSubtotal();
	    c.addOffers("arroz",50);
	    c.showSubtotal();
	    c.showTotal();
	    c.showTrans();
   
	}
}
