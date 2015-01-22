public final class DiscountRate {
	
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;

	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	public static double getServiceDiscountRate(String memberType) {
		double discount = 0;
		if (memberType == "Premium"){
			discount = serviceDiscountPremium;
		}
		if (memberType == "Gold"){
			discount = serviceDiscountGold;
		}
		if (memberType == "Silver"){
			discount = serviceDiscountSilver;
		}
		return discount;
		
	}

	public static double getProductDiscountRate(String memberType) {
		double discount = 0;
		if (memberType == "Premium"){
			discount = productDiscountPremium;
		}
		if (memberType == "Gold"){
			discount = productDiscountGold;
		}
		if (memberType == "Silver"){
			discount = productDiscountSilver;
		}
		return discount;
	}

	
}
