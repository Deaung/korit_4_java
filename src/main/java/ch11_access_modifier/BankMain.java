package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setAccountNum(123456);
        bank.setAccountHolder("홍길동");
        bank.setBalance(100000);
        bank.setPinNumber(100);

        bank.displayInfo();

        bank.deposit(50000,100);
        bank.withdraw(200000,100);
        bank.withdraw(100000,100);
        bank.showAccountInfo();

        Bank bank1 = new Bank();
        bank1.setAccountNum(987654);
        bank1.setAccountHolder("신사임당");
        bank1.setBalance(500000);
        bank1.setPinNumber(100);

        bank1.displayInfo();

        bank1.withdraw(100000,100);
        bank1.deposit(200000,100);
        bank1.showAccountInfo();

        System.out.println("최종 계좌 정보");
        bank.displayInfo();

        bank1.displayInfo();
    }
}
