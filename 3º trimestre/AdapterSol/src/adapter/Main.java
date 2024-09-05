package adapter;

public class Main {
    
    public static void main(String[] args) {
        PaypalAdapter p = new PaypalAdapter(new Paypal());
        p.pay(20);
    }

}
