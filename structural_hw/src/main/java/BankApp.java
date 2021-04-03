interface Operation {
    void doOperation();
}

class Investment implements Operation {
    @Override
    public void doOperation() {
        System.out.println("You have invested some amount");
    }
}

class MobileBalance implements Operation {
    @Override
    public void doOperation() {
        System.out.println("You have checked your balance");
    }
}

class Payment implements Operation {
    @Override
    public void doOperation() {
        System.out.println("Payment completed successfully");
    }
}

class Transfer implements Operation {
    @Override
    public void doOperation() {
        System.out.println("Transfer completed successfully");
    }
}

class ATM {
    public void getInvestInfo(){
        Operation i = new Investment();
        i.doOperation();
    }
    public void getBalanceInfo(){
        Operation mb = new MobileBalance();
        mb.doOperation();
    }
    public void getPaymentInfo(){
        Operation p = new Payment();
        p.doOperation();
    }
    public void getTransferInfo(){
        Operation t = new Transfer();
        t.doOperation();
    }
}

public class BankApp {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getInvestInfo();
        atm.getBalanceInfo();
        atm.getPaymentInfo();
        atm.getTransferInfo();
    }
}
