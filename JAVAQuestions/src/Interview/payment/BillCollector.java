package Interview.payment;

public class BillCollector {
    private IPayment payment;

    public void setPayment(IPayment payment){
        this.payment = payment;
    }

    public BillCollector(){}

    public BillCollector(IPayment payment){
        this.payment = payment;
    }

    public void collectPayment(double amount){
        String status = payment.pay(amount);
        System.out.println(status);
    }

    public static void main(String args[]){
        BillCollector bc  = new BillCollector();
        // Setter Injection of CreditcardPayment
        bc.setPayment(new CreditCardPayment());
        bc.collectPayment(1400.00);

        // Constructor Injection of DebitcardPayment
        BillCollector bc1 = new BillCollector(new DebitcardPayment());
        bc1.collectPayment(1500.00);
    }
}