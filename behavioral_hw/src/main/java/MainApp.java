class Bank {
    private final BillPay billPay;

    public Bank(BillPay billPay){
        this.billPay = billPay;
    }
    public void payInfo(){
        billPay.payNotify();
    }
}

interface BillPay {
    void payNotify();
}

class Cash implements BillPay {
    @Override
    public void payNotify(){
        System.out.println("Payment method: cash");
    }
}

class Card implements BillPay{
    @Override
    public void payNotify(){
        System.out.println("Payment method: card");
    }
}

class OnlineTransfer implements BillPay{
    @Override
    public void payNotify(){
        System.out.println("Payment method: online transfer");
    }
}

public class MainApp {
    public static void main(String[] args) {
        Bank bank = new Bank(new Cash());
        bank.payInfo();

        bank = new Bank(new Card());
        bank.payInfo();

        bank = new Bank(new OnlineTransfer());
        bank.payInfo();
    }
}
