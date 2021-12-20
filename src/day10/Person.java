package day10;

public class Person {

    String name; //이름
    int money; // 가진 돈
    Account account; //본인 계좌

    Person(String pName, int pMoney) {
        name = pName;
        money = pMoney;
    }

    //계좌 개설 기능
    void makeAccount(Bank bank) {
        account = new Account(this);
        account.bankName = bank.bankName;
        bank.resistryAccount(account);
        System.out.printf("%s은행에 %s님의 계좌가 신설되었습니다.\n"
                , bank.bankName, name);

    }

    //입금 기능
    void deposit(int depositMoney) {
        if (money >= depositMoney) {
            account.balance += depositMoney;
            money -= depositMoney;
            System.out.printf("계좌에 %d원이 입금되었습니다.\n", depositMoney);
        } else {
            System.out.printf("입금하려면 소지금이 %d원 더 필요합니다."
                    , depositMoney - money);
        }
    }

    //예금잔액 확인기능
    void checkAccountBalance() {
        System.out.printf("현재 예금 잔액은 %d원입니다.\n", account.balance);
    }

    //계좌이체 기능
    void sendMoney(Person target, int money) {
        // 상대방 예금액이 늘어남
        target.account.balance += money;
        //내 예금액이 줄어듬
        account.balance -= money;

        System.out.printf("%s님이 %s님에게 %d원을 송금했습니다.\n"
                , name, target.name, money);
    }
}
