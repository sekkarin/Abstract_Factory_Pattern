
public class ShoppingCart {
private PaymentStrategy paymentStrategy;

public ShoppingCart() {
	this.paymentStrategy = new CashPayment();
}

public void setPaymentStrategy(PaymentStrategy strategy) {
	this.paymentStrategy = strategy;
}

public void cheackout(int amount) {
	paymentStrategy.pay(amount);
}

}
