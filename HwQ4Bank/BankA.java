package HwQ4Bank;

public class BankA extends Bank {
    @Override
    public void getBalance() {
        System.out.println("The amount deposited $ in BankA is:" + A );
        super.getBalance();
    }
}
