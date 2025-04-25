package ch11_access_modifier;
/*
    1. Bank 클래스
        1) 필드
            accountNum 계좌번호
            accountHolder 예금주 String
            balance (잔액, 정수)
            pinNumber(4자리 정수의 비밀번호 0~9999)

        2) 생성자
            기본생성
            계좌만 받는 생성
            계좌,예금주
            계좌 예금주 초기잔액
            계좌 예금주 초기잔액 비밀번호 생성자

        3) 메서드
            setter/getter
            setter는 로직 편집 필요
                잔액 음수 불가, 비밀번호 범위 설정
            deposit(int amount, int inputPin) 입금 관련 메서드
                - 비밀번호 확인, 틀리면 메서드 종료
                - 유효 금액 확인- 실패시 메서드 종료
                성공시
                    콘솔창에
                        입금완료 현재 잔액:**** 원
            withdraw(int amount, int inputPin) 입금 관련 메서드
                - 비밀번호 확인, 틀리면 메서드 종료
                - 유효 금액 확인- 실패시 메서드 종료
                - 출금 예정액이 잔액보다 작아야함 실패시 메서드 종료
                성공시
                    콘솔창에
                        출금완료 현재 잔액 :***원

            showAccountInfo()
                콘솔창에
                    김일 님의 계좌번호는 ~~~~이며 현재 잔액은 ~~~원 입니다

            BankMain 클래스에 객체 생성해서 setter/getter 사용하여 계좌정보 및 출력 해보고
            위 설정한 메서드들 실행 시켜 입금 시도 및 확인



 */
public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setBalance(int balance) {
        if (balance<=0){
            System.out.println("입력 오류");
            return;
        }
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber<0 || pinNumber>9999){
            System.out.println("불가능한 비밀번호");
            return;
        }
        this.pinNumber = pinNumber;

    }

    public void deposit(int amount, int inputPin){
        if (inputPin != pinNumber){
            System.out.println("비밀번호 입력 오류");
        }else if (amount<0){
            System.out.println("불가능한 금액");
        }else {
            balance+=amount;
        System.out.println("\n"+amount+ "원 입금 되었습니다. 현재 잔액 : "+balance);
        }
    }
    public void withdraw(int amount, int inputPin){
        if (inputPin != pinNumber){
            System.out.println("비밀번호 입력 오류");
        }else if (amount<0){
            System.out.println("불가능한 금액");
        }else if (amount > balance){
            System.out.println("잔액부족!");
        }else {
            balance-=amount;
            System.out.println("\n"+amount+ "원 출금 되었습니다. 현재 잔액 : "+balance );
        }
    }
    public void showAccountInfo(){
        System.out.println(accountHolder
                + "님 의 계좌번호는 "+accountNum
                +"이며, 현재 잔액은 "+ balance+" 원 입니다");
    }
    public void displayInfo(){
        System.out.println("\n계좌번호 : "+accountNum);
        System.out.println("계좌 소유자 : "+accountHolder);
        System.out.println("잔액 : "+balance);
    }
}
