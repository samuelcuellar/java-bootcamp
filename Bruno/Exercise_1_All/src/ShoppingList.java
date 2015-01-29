import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {

	private ArrayList<ItemProduct> list;
	private PaymentFactory paymentfactory;
	static int transaction = 0;
	Scanner sc = new Scanner(System.in);

	ShoppingList() {
		list = new ArrayList<ItemProduct>();
		paymentfactory = new PaymentFactory();
	}

	public void addItem(Product p, int u) {
		boolean exist = false;
		if (list.size() == 0) {
			ItemProduct ip = new ItemProduct(p, u);
			list.add(ip);
		} else {
			for (int i = 0; i < list.size(); i++) {
				ItemProduct ip = (ItemProduct) list.get(i);
				if (ip.getProduct().getName().equals(p.getName())) {
					exist = true;
					ip.changeUnits(ip.getUnits() + u);
				}
			}
			if (!exist) {
				ItemProduct ip2 = new ItemProduct(p, u);
				list.add(ip2);
			}
		}
	}

	// Method to get the cheapest Item to apply a discount	
	public int getCheap() {
		int cheap = 0;
		for (int i = 0; i < list.size(); i++) {
			ItemProduct ip = (ItemProduct) list.get(i);
			if (i == 0) {
				cheap = ip.getProduct().getPrice();
			} else if (ip.getProduct().getPrice() < cheap) {
				cheap = ip.getProduct().getPrice();
			}
		}
		return cheap;
	}
	
	// Method to get the most expensive Item to apply a discount	
	public int getExpensive() {
		int exp = 0;
		for (int i = 0; i < list.size(); i++) {
			ItemProduct ip = (ItemProduct) list.get(i);
			if (i == 0) {
				exp = ip.getProduct().getPrice();
			} else if (ip.getProduct().getPrice() > exp) {
				exp = ip.getProduct().getPrice();
			}
		}
		return exp;
	}
	
	public int subtotalList() {
		int subtotal = 0;
		for (int i = 0; i < list.size(); i++) {
			ItemProduct ip = (ItemProduct) list.get(i);
			subtotal = subtotal + ip.subtotalItem();
		}
		return subtotal;
	}
	
	public void getList() {
		for (int i = 0; i < list.size(); i++) {
			ItemProduct ip = (ItemProduct) list.get(i);
			ip.showItem();
		}
	}
	
	public double compareOffers(ArrayList<Offers> offe) {
		double sum = 0;
		for (int i = 0; i < offe.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				ItemProduct ip = (ItemProduct) list.get(j);
				if (ip.getProduct().getName().equals(offe.get(i).getName())) {
					sum = sum + offe.get(i).priceOffer(ip.subtotalItem());
					break;
				}
			}
		}
		return sum;
	}
	
	public void totalList(double subtotal) {
		int x;
		System.out.print("Ingrese una forma de pago: ");
		x=sc.nextInt();
		Payment p = paymentfactory.getPayment(x);
		switch (x) {
		case 1:
			p.pay(subtotal * 0.9);
			transaction++;
			break;
		case 2:
			p.pay(subtotal- getCheap());
			transaction++;
			break;
		case 3:
			p.pay(subtotal - getExpensive());
			transaction++;
			break;
		}
	}
	
	public int getTransaction(){
		return transaction;
	}
}
