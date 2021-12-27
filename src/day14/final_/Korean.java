package day14.final_;

public class Korean {

    String name; //이름
    final String ssn; //주민번호

    //상수이름규칙: 모두 대문자와 스네이크 케이스
    static final String MY_NATION = "대한민국"; //국적

    //이메일 수신여부
    public static final int MAIL_OK = 1;
    public static final int MAIL_NO = 0;
    public static final int MAIL_NOT_DECISION = -1;

    public Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
