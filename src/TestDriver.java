
public class TestDriver {

	public static void main(String[] args) {
		ShoppingCart cart1 = new ShoppingCart();
		cart1.cheackout(1500);
		cart1.setPaymentStrategy(new CredicardPayment());
		cart1.cheackout(2500);
	}

}
