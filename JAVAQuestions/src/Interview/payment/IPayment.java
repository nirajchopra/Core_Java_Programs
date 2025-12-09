package Interview.payment;

public interface IPayment {
	String pay(double amount);
}

// Credit card payment implementation
class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "Paid " + amount + " using Credit Card.";
	}

}

// Debit card payment implementation
class DebitcardPayment implements IPayment {
	public String pay(double amount) {
		return "Paid " + amount + " by Debit Card";
	}
}
