
public class Visit {
	private Customer customer;
	private String date;
	private double serviceExpense;
	private double productExpense;

	public Visit(String date, Customer name) {
		this.date = date;
		this.customer = name;
	}

	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}

	public double getTotal() {
		if (customer.isMember()) {
			return serviceExpense
					+ productExpense
					- (serviceExpense
							* DiscountRate.getServiceDiscountRate(customer
									.getMemberType()) + productExpense
							* DiscountRate.getProductDiscountRate(customer
									.getMemberType()));
		} else {
			return serviceExpense + productExpense;
		}

	}

	@Override
	public String toString() {
		Double gasto = getTotal();
		return customer.toString() + ", Date " + date + ", Gastos: " + gasto;
	}
}
