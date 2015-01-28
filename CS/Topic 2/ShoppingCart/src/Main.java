import java.util.ArrayList;

import entities.Cart;
import entities.Items;
import entities.User;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		ArrayList<Items>item= new ArrayList<Items>();
		String user1;
		String pass1;

		User user = new User();
		Scanner scanner = new Scanner(System.in);
		System.out.println("User:");
		user1 = scanner.next();
		if (user1.equals(user.getUser())) {
			System.out.println("Password");
			Scanner scanner2 = new Scanner(System.in);
			pass1 = scanner.next();
			System.out.println("Welcome");
		} else {
			System.out.println("User Incorrect");

		}
		
		User user0= new User("cristian07");
		
		
		Items i1= new Items(001,"Led TV 42", 5999.0);
		Items i2= new Items(002,"Microondas",1278.0);
		Items i3= new Items(003,"Lavarropas", 7000.0);
		
		 
		user0.addToCart(i1);
		user0.addToCart(i3);
		user0.listMyCart();
		
		
		
	
					
		
		
	
	}
}