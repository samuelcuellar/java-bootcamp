import java.util.ArrayList;

public class Catalog {

	private ArrayList<Product> ct;
	private ArrayList<Offers> off;
	private ShoppingList sp;
	private ProductFactory productfactory;

	public Catalog() {
		ct = new ArrayList<Product>();
		sp = new ShoppingList();
		off = new ArrayList<Offers>();
		productfactory = new ProductFactory();
	}

	public void addOffers(String name, int perc) {
		Offers o = new Offers(name, perc);
		off.add(o);
		System.out.println("An offer was added, send mail at the manager");
	}

	public void addCatalog(String name, int price, int code, int type) {

		boolean exist = false;
		if(ct.size()==0){
			Product p = productfactory.getProduct(type);
			p.setName(name);
			p.setPrice(price);
			p.setCode(code);
			ct.add(p);
			System.out.println("A new product was added, send mail at the manager");
		}
		else{
			for (int i = 0; i < ct.size(); i++) {
				Product prod = (Product) ct.get(i);
				if (prod.getName().equals(name)) {
					exist = true;
				}
				if (!exist) {
					Product p = productfactory.getProduct(type);
					p.setName(name);
					p.setPrice(price);
					p.setCode(code);
					ct.add(p);
					System.out.println("A new product was added, send mail at the manager");
					break;
				}
			}
		}
	}

	public void changePrice(String name, int newPrice) {
		for (int i = 0; i < ct.size(); i++) {
			Product prod = (Product) ct.get(i);
			if (prod.getName().equals(name)) {
				prod.setPrice(newPrice);
				System.out.println("A new price was changed, send mail at the manager");
				break;
			}
		}
	}

	public void buyProduct(String name, int u) {
		for (int i = 0; i < ct.size(); i++) {
			Product p = (Product) ct.get(i);
			if (p.getName().equals(name)) {
				sp.addItem(p, u);
			}
		}
	}

	public void showBuy() {
		System.out.println("Lista de Compras");
		sp.getList();
	}

	public void showSubtotal() {
		if (off.size() == 0) {
			System.out.println("Subtotal: " + sp.subtotalList());
		} else {
			System.out.println("Subtotal sin oferta: " + sp.subtotalList());
			System.out.println("Precio con oferta");
			System.out.println("Subtotal con oferta: " + (sp.subtotalList() - sp.compareOffers(off)));
		}
	}

	public void showTotal() {
		System.out.println("El total de la compra con descuentos y ofertas: ");
		sp.totalList(sp.subtotalList() * 1.0 - sp.compareOffers(off));
		System.out.println("send mail to the manager");
		sp = new ShoppingList();
	}

	public void showTrans() {
		System.out.println("Cantidad de transacciones: " + sp.getTransaction());
	}

	public void showCatalog() {
		for (int i = 0; i < ct.size(); i++) {
			Product prod = (Product) ct.get(i);
			prod.showProduct();
		}
		System.out.println();

	}
}
