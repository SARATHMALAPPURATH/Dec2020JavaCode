package BuilderPattern;

public class EcommUser {

	public static void main(String args[]) {

		EcommApp shop = new EcommApp();

		shop.login("Sarath", "password").doSearch("macbook", 1000).addToCart("macbook")
				.dopayment("ICICI bank 12211", "test123").getEmail().logout().login().doSearch("nike shoes")
				.addToCart("nike shoes").dopayment("Gpay", "pwd123").getEmail().logout();

		int orderId = shop.generateOrderId();
		System.out.println(orderId);

		shop.login().dopayment("hdfc", "pwd123").getEmail().logout();

		shop.login().doSearch("imac").dopayment("sbi", "pwd123").getEmail().logout();

		shop.login().logout();

	}

}
