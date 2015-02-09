package globant.benja;

import globant.benja.service.Services;

import org.junit.Test;

public class TestService {

	@Test
	public void test1Cart() {
		Services service = new Services();
		
		service.addItem("coca 1L", 15.00);
		service.addItem("quilmes",17.00);
		
	}
	@Test
	public void test2Cart() {
		Services service = new Services();
		
		service.addUser("Benjamin", 34953806);
		service.addUser("Fiorella", 35026860);
	}
	
	@Test
	public void test3Cart() {
		Services service = new Services();
		
		service.addItemToCart(1/*user id*/, 1/*item code*/,3/*cant*/);
		service.addItemToCart(1/*user id*/, 2/*item code*/,6/*cant*/);
		
	}
	
	@Test
	public void test4Cart() {
		Services service = new Services();
		service.newTransaction(1,"Credit Card","Benjamin Salas",123457896);
		service.newTransaction(1,"PayPal","Fiorella_a8@gmail.com","benja2164958");
		
	}
}
