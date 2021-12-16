package HomeWork;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Project01 {

    //현재로그인한 사람 정보 저장 배열
    static String[] curLoginUserInfo = new String[3];

    //직원 인적사항 저장 배열 (이름, 사원번호,직책, 비밀번호)
    /*static String[] empNames = {"kgw", "aaa", "bbb"};
    static String[] empNumbers = {"0000", "0001", "0002"};
    static String[] empPosition = {"사원", "대리", "과장"};
    static String[] empPassWord = {"abc", "def", "ghi"};*/
    static String[] cheakinTime = {};
    static String[] cheakoutTime = {};

    static String[] empNames = {};
    static String[] empNumbers = {};
    static String[] empPosition = {};
    static String[] empPassWord = {};


    //첫 화면 메뉴
    static void firstMenu() {
        System.out.println("\n==========[직원관리프로그램]==========");
        System.out.println("1. 로그인");
        System.out.println("2. 직원등록");
        System.out.println("3. 프로그램 종료");
        System.out.print("=> ");
    }

    //로그인 전 메뉴선택
    static int inputInt() {
        int n = sc.nextInt();
        if (n > 4 || n <= 0) {
            System.out.println("1 ~ 3사이로 입력해주세요.");
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
                System.out.println("이전 화면으로 돌아가시려면 Enter를 눌러주세요.");
                sc.nextLine();
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
                    System.out.println("\n==========[로그인 성공]==========");
                    date();// 첫 로그인 시점에만 로그인 성공과 시간 출력
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
            }
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
        System.out.println("\n등록이 완료되었습니다.");
        System.out.println("초기메뉴에서 로그인 해주세요.");
        System.out.println("이전 화면으로 돌아가시려면 Enter를 눌러주세요.");
        sc.nextLine();

    }

    //직원목록 전체 보기 [이름, 사번, 직책]
    static void totalList() {
        if (empNames.length < 1) {
            System.out.println("* 등록된 사원이 없습니다.");
            System.out.println("* 사원 등록 후 조회해주시기 바랍니다.");
            System.out.println("이전 화면으로 돌아가시려면 Enter를 눌러주세요.");
            sc.nextLine();
        } else {
            System.out.println("--------------- 직원 목록 ---------------");
            for (int i = 0; i < empNames.length; i++) {
                System.out.printf("* [이름]  %s | [사번]  %s | [직책]  %s\n", empNames[i], empNumbers[i], empPosition[i]);
            }
            System.out.println("----------------------------------------");
            System.out.println("이전 화면으로 돌아가시려면 Enter를 눌러주세요.");
            sc.nextLine();
        }
    }

    //프로그램 종료
    static void exit() {
        System.out.println("프로그램을 종료하시겠습니까? [Y / N]");
        String yesNo = sc.nextLine();
        if (yesNo.equals("y") || yesNo.equals("Y")) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }

    static Scanner sc = new Scanner(System.in);

    //퇴근하기
    static void cheakout() {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 출력 모양
        Calendar cal = Calendar.getInstance();
        String format_time2 = format1.format(cal.getTime());

        String[] temp6 = new String[cheakoutTime.length + 1];

        for (int i = 0; i < cheakoutTime.length; i++) {
            temp6[i] = cheakoutTime[i];
        }
        temp6[temp6.length - 1] = format_time2;
        cheakoutTime = temp6;

        System.out.println("----------------------------------------------------");
        System.out.printf("%s님 %s 퇴근이 확인되었습니다..\n", curLoginUserInfo[2], cheakoutTime[0]);
        System.out.println("----------------------------------------------------");
        System.out.println("로그아웃 하시겠습니까? [Y / N]");
        String yesNo = sc.nextLine();
        if (yesNo.equals("y") || yesNo.equals("Y")) {
            logOut();
        }

    }

    //로그인 후 현재시간
    static void date() {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 출력 모양
        Calendar cal = Calendar.getInstance();
        String format_time = format1.format(cal.getTime());

        System.out.printf("현재 시간 : %s\n", format_time);
//        int hour = cal.get(Calendar.HOUR_OF_DAY);
//        int min = cal.get(Calendar.MINUTE);
//        int sec = cal.get(Calendar.SECOND);

        String[] temp5 = new String[cheakinTime.length + 1];

        for (int i = 0; i < cheakinTime.length; i++) {
            temp5[i] = cheakinTime[i];
        }
        temp5[temp5.length - 1] = format_time;
        cheakinTime = temp5;
        temp5 = null;
    }

    //로그인 후 메뉴
    static void printMenu() {

        System.out.println("1. 출근하기");
        System.out.println("2. 퇴근하기");
        System.out.println("3. 출근자 확인");
        System.out.println("4. 직원 목록");
        System.out.println("5. 직원 삭제");
        System.out.println("6. 로그아웃");
        System.out.print("=> ");
    }

    //로그인 후 메뉴선택
    static int inputInt2() {
        int n = sc.nextInt();

        if (n > 6 || n <= 0) {
            System.out.println("1 ~ 6 사이로 입력해주세요.");
        }
        sc.nextLine();
        return n;
    }

    //출근하기
    static void workCheak() {
        System.out.println("----------------------------------------------------");
        System.out.printf("%s님 %s 출근이 확인되었습니다..\n", curLoginUserInfo[2], cheakinTime[0]);
        System.out.println("----------------------------------------------------");
        System.out.println("이전 화면으로 돌아가시려면 Enter를 눌러주세요.");
        sc.nextLine();

    }

    //현재 로그인정보 ( [사원번호] [직책] [이름] )
    static void nowLogin() {
        System.out.println("--------------------------------------------------------------");
        System.out.printf("* [이름]  %s | [사번]  %s | [직책]  %s 님으로 로그인 중입니다.\n", curLoginUserInfo[2], curLoginUserInfo[0], curLoginUserInfo[1]);
        System.out.println("--------------------------------------------------------------");
        System.out.println("이전 화면으로 돌아가시려면 Enter를 눌러주세요.");
        sc.nextLine();
    }

    // 직원 삭제
    static void del() {
        while (true) {
            System.out.println("- 삭제할 직원의 사원 번호를 입력하세요. ");
            System.out.print("=> ");
            String target = sc.nextLine();

            int index = -1;

            for (int i = 0; i < empNumbers.length; i++) { // 사원 번호의 존재 여부 확인
                if (target.equals(empNumbers[i])) {
                    index = i;
                    break;
                }
            }

            if (index == -1) { // 사원 번호가 존재하지 않을 경우 index가 -1 상태
                System.out.println("해당 사원번호(" + target + ")는 존재하지 않습니다.");
            } else { // 사원 번호가 존재할 경우
                System.out.println("사원번호가 [" + empNumbers[index] + "] 인 " + empNames[index] + " 님의 정보를 삭제합니다 ");

                for (int i = index; i < empNumbers.length - 1; i++) { // 배열에서 index에 맞는 정보를 삭제
                    empNumbers[i] = empNumbers[i + 1];
                    empNames[i] = empNames[i + 1];
                    empPosition[i] = empPosition[i + 1];
                }
                String[] temp = new String[empNumbers.length - 1]; // emp 배열보다 하나 작은 temp 배열 생성
                String[] temp2 = new String[empNames.length - 1];
                String[] temp3 = new String[empPosition.length - 1];

                for (int i = 0; i < temp.length; i++) { //temp 배열에 정보를 저장
                    temp[i] = empNumbers[i];
                    temp2[i] = empNames[i];
                    temp3[i] = empPosition[i];
                }
                empNumbers = temp;
                temp = null; // 주소 옮기기
                empNames = temp2;
                temp2 = null;
                empPosition = temp3;
                temp3 = null;

                System.out.println("* 삭제가 완료되었습니다 \n");
                break;
            }
        }
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
                firstMenu(); //로그인 전 메뉴
                int choice1 = inputInt();
                switch (choice1) {
                    case 1: // 로그인
                        Login();
                        break;
                    case 2: // 직원 등록
                        inputName();
                        inputPassWord();
                        inputNum();
                        inputPosition();
                        break;
                    case 3: // 프로그램 종료
                        exit();
                        break;
                }
            } else {
                printMenu(); //로그인 후 메뉴
                int choice2 = inputInt2();
                switch (choice2) {
                    case 1: // 출근하기
                        workCheak();
                        break;
                    case 2: // 퇴근하기
                        cheakout();
                        break;
                    case 3: // 출근자 확인
                        nowLogin();
                        break;
                    case 4: // 직원 목록
                        totalList();
                        break;
                    case 5: // 직원 삭제
                        del();
                        break;
                    case 6: // 로그아웃
                        logOut();
                        break;
                }
            }
        } // end while
    }// end main
}// end class