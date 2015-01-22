public class Prueba {
	public static void main(String[] args) {
		Customer c = new Customer("Benjamin");
		c.setMember(true);
		c.setMemberType("Premium");
		
		
		Visit v = new Visit("21/5/14",c);
		v.setProductExpense(100);
		v.setServiceExpense(100);
		System.out.println(v);
	}
}
