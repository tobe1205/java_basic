package day10;

public class BankMain {

    public static void main(String[] args) {

        //은행 생성
        Bank shinhan = new Bank("신한");
        Bank woori = new Bank("우리");

        //사람 생성
        Person kim = new Person("김철수",10000);
        Person park = new Person("박영희",30000);
        Person hong = new Person("홍길동",5000);

        kim.makeAccount(woori);
        park.makeAccount(woori);
        hong.makeAccount(shinhan);

        kim.deposit(8000);
        park.deposit(20000);
        hong.deposit(7000);
        park.deposit(7500);

        park.sendMoney(hong,15000);
        hong.sendMoney(kim,10000);

        System.out.println("===========================");

        woori.showAllAccount();
        shinhan.showAllAccount();

    }
}
