package HomeWork;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Project01 {

    //현재로그인한 사람 정보 저장 배열
    static String[] curLoginUserInfo = new String[3];

    //직원 인적사항 저장 배열 (이름, 사원번호,직책, 비밀번호)
    static String[] empNames = {"kgw", "aaa", "bbb"};
    static String[] empNumbers = {"0000", "0001", "0002"};
    static String[] empPosition = {"사원", "대리", "과장"};
    static String[] empPassWord = {"abc", "def", "ghi"};

    /*static String[] empNames = {};
    static String[] empNumbers = {};
    static String[] empPosition = {};
    static String[] empPassWord = {};*/


    //첫 화면 메뉴
    static void firstMenu() {
        System.out.println("\n==========직원관리프로그램==========");
        System.out.println("1. 로그인");
        System.out.println("2. 직원등록");
        System.out.println("3. 직원목록");
        System.out.println("4. 프로그램 종료");
        System.out.print("=> ");
    }

    //로그인 전 메뉴선택
    static int inputInt() {
        int n = sc.nextInt();
        if (n > 4 || n <= 0) {
            System.out.println("1 ~ 4사이로 입력해주세요.");
        }
        sc.nextLine();
        return n;
    }


    //문자 입력
    static String inputString(String s) {
        System.out.print(s);
        return sc.nextLine();
    }

    //로그인하기
    static void Login() {
        while (true) {
            String nameCheck = inputString("이름: ");
            int index = -1;
            for (int i = 0; i < empNames.length; i++) {
                if (nameCheck.equals(empNames[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("\n등록되지 않은 정보입니다.");
                System.out.println("초기메뉴에서 직원등록을 먼저 해주세요.");
                return;
            } else {
                String pwCheck = inputString("비밀번호: ");
                index = -1;
                for (int i = 0; i < empPassWord.length; i++) {
                    if (pwCheck.equals(empPassWord[i])) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("\n이름과 비밀번호가 일치하지 않습니다.");
                    System.out.println("다시 입력해주세요.");
                } else {
                    //현재 로그인한 사람 정보 저장 시점
                    curLoginUserInfo[0] = empNumbers[index];
                    curLoginUserInfo[1] = empPosition[index];
                    curLoginUserInfo[2] = empNames[index];
//                    System.out.println(Arrays.toString(curLoginUserInfo));
                    loginStatus = true;
                    return;
                }
            }
        }
    }

    //직원등록 - 이름 입력
    static void inputName() {
        String name = inputString("이름: ");
        String[] temp = new String[empNames.length + 1];
        for (int i = 0; i < empNames.length; i++) {
            temp[i] = empNames[i];
        }
        temp[temp.length - 1] = name;
        empNames = temp;

    }

    //직원등록 - 패스워드 입력
    static void inputPassWord() {
        while (true) {
            String pw = inputString("비밀번호: ");
            /*
            int index = -1;

            for (int i = 0; i < empPassWord.length; i++) {
                if (pw.equals(empPassWord[i])) {
                    index = i;
                    break;
                }
            }*/
            /*if (index == -1) {*/
            if (pw.length() > 8 | pw.length() < 4) {
                System.out.println("비밀번호는 4 ~ 8자리로 입력해주세요.");

            } else {
                String[] temp4 = new String[empPassWord.length + 1];
                for (int i = 0; i < empPassWord.length; i++) {
                    temp4[i] = empPassWord[i];
                }
                temp4[temp4.length - 1] = pw;
                empPassWord = temp4;
                break;
            }/*
            } else {
                System.out.println("등록된 사원 번호입니다.");
            }*/
        }
    }

    //직원등록 - 사원번호 입력
    static void inputNum() {
        while (true) {
            String num = inputString("사원 번호: ");
            int index = -1;

            for (int i = 0; i < empNumbers.length; i++) {
                if (num.equals(empNumbers[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                if (num.length() > 4) {
                    System.out.println("사원 번호는 4자리 숫자입니다.");
                    System.out.println("다시 입력해주세요.");
                } else {
                    String[] temp2 = new String[empNumbers.length + 1];
                    for (int i = 0; i < empNumbers.length; i++) {
                        temp2[i] = empNumbers[i];
                    }
                    temp2[temp2.length - 1] = num;
                    empNumbers = temp2;
                    break;
                }
            } else {
                System.out.println("등록된 사원 번호입니다.");
            }
        }
    }

    //직원등록 - 직책 입력
    static void inputPosition() {
        String position = inputString("직책: ");
        String[] temp3 = new String[empPosition.length + 1];
        for (int i = 0; i < empPosition.length; i++) {
            temp3[i] = empPosition[i];
        }
        temp3[temp3.length - 1] = position;
        empPosition = temp3;
    }

    //직원목록 전체 보기 [이름, 사번, 직책]
    static void totalList() {
        if (empNames.length < 1) {
            System.out.println("* 등록된 사원이 없습니다.");
            System.out.println("* 사원 등록 후 조회해주시기 바랍니다.");
        } else {
            System.out.println("--------------- 직원 목록 ---------------");
            for (int i = 0; i < empNames.length; i++) {
                System.out.printf("* [이름]  %s | [사번]  %s | [직책]  %s\n", empNames[i], empNumbers[i], empPosition[i]);
            }
            System.out.println("----------------------------------------");
        }
    }

    //프로그램 종료
    static void exit() {
        System.out.println("프로그램을 종료하시겠습니까? [Y/N]");
        String yesNo = sc.nextLine();
        if (yesNo.equals("y") || yesNo.equals("Y")) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }

    static Scanner sc = new Scanner(System.in);

    //로그인 후 현재시간
    static void date() {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 출력 모양
        Calendar cal = Calendar.getInstance();
        String format_time = format1.format(cal.getTime());

        System.out.println(format_time);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
    }

    //로그인 후 메뉴
    static void printMenu() {
        System.out.println("\n==========로그인 성공==========");
        date();
        System.out.println("1. 출근하기");
        System.out.println("2. 퇴근하기");
        System.out.println("3. 출근 확인");
        System.out.println("4. 출근자 확인");
        System.out.println("5. 로그아웃");
        System.out.print("=> ");
    }

    //로그인 후 메뉴선택
    static int inputInt2() {
        int n = sc.nextInt();
        if (n > 5 || n <= 0) {
            System.out.println("1 ~ 5사이로 입력해주세요.");
        }
        sc.nextLine();
        return n;
    }

    //현재 로그인정보 ( [사원번호] [직책] [이름] )
    static void nowLogin() {
 /*       for (int i = 0; i < curLoginUserInfo.length; i++) {
            System.out.printf("\n* [%s] || [%s] || [%s]님이 현재 로그인 중입니다.", empNumbers[i], empPosition[i], empNames[i]);
        }*/
        System.out.printf("\n* [%s] || [%s] || [%s]님이 현재 로그인 중입니다.", curLoginUserInfo[0], curLoginUserInfo[1],curLoginUserInfo[2] );
        sc.nextLine();
    }

    //로그아웃
    static void logOut() {
        System.out.println("로그아웃 되었습니다.");

        loginStatus = false;
    }

    // 전역변수
    static boolean loginStatus = false;

    public static void main(String[] args) {
        while (true) {
            if (!loginStatus) {
                firstMenu();
                int choice1 = inputInt();
                switch (choice1) {
                    case 1:
                        Login();
                        break;
                    case 2:
                        inputName();
                        inputPassWord();
                        inputNum();
                        inputPosition();
                        break;
                    case 3:
                        totalList();
                        break;
                    case 4:
                        exit();
                        break;
                }
            } else {
                printMenu();
                int choice2 = inputInt2();
                switch (choice2) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        nowLogin();
                        break;
                    case 4:
                        break;
                    case 5:
                        logOut();
                        break;
                }
            }
        } // end while
    }// end main
}// end class

