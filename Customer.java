class Restaurant{
	void menu() {
		System.out.println("1.Idly 2.Dosa 3.Wada");
	}
	void takeOrder(String order) {
		System.out.println("Order given is "+order);
	}
	String serveFood() {
		return "Dosa";
	}
	String payBill(int amount) {
		System.out.println("Amount given is "+amount);
	return "Paid";
	}
}
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant ohris=new Restaurant();
		ohris.menu();
		ohris.takeOrder("Dosa");
		System.out.println("Food served is "+ohris.serveFood());
		System.out.println("Bill "+ohris.payBill(678));
	}

}
