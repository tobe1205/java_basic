package MyFolder;

import java.util.Arrays;
import java.util.Scanner;

public class Me2 {

    //출근자 이름배열
    static String[] empNames = {"kgw", "aaa", "bbb"};
    static String[] empNumbers = {"0000", "0001", "0002"};
    static String[] empPasswords = {"0000", "0001", "0002"};
    static String[] empPosition = {"사원", "대리", "과장"};

    /*static String[] empNames = {};
    static String[] empNumbers = {};
    static String[] empPosition = {};*/

    // 메뉴화면
    static void LoginMenu() {
        System.out.println("==========직원관리프로그램==========");
        System.out.println("1. 로그인");
        System.out.println("2. 직원등록");
        System.out.println("3. 직원목록");
        System.out.println("4. 프로그램 종료");
        System.out.print("=> ");
    }

    static void printMenu() {
        System.out.println("==========직원관리프로그램==========");
        System.out.println("1. 출근하기");
        System.out.println("2. 퇴근하기");
        System.out.println("3. 출근 확인");
        System.out.println("4. 출근자 확인");
        System.out.println("5. 수정");
        System.out.println("6. 프로그램 종료");
        System.out.print("=> ");
    }


    static Scanner sc = new Scanner(System.in);

    //메뉴 선택
    static int inputInt() {
        int n = sc.nextInt();
        if (n > 7 || n <= 0) {
            System.out.println("범위내에 알맞게 입력해주세요.");
        }
        sc.nextLine();
        return n;
    }

    static String inputString(String s) {
        System.out.print(s);
        return sc.nextLine();
    }

    static void inputName() {
        String name = inputString("이름: ");
        String[] temp = new String[empNames.length + 1];
        for (int i = 0; i < empNames.length; i++) {
            temp[i] = empNames[i];
        }
        temp[temp.length - 1] = name;
        empNames = temp;
        temp = null;
    }

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
                    temp2 = null;
                    break;
                }
            } else {
                System.out.println("등록된 사원 번호입니다.");
            }
        }
    }

    static void totalList() {
        if (empNames.length < 1) {
            System.out.println("* 등록된 사원이 없습니다.");
            System.out.println("* 사원 등록 후 조회해주시기 바랍니다.");
        } else {
            System.out.println("------------ 사원 목록 ---------------");
            for (int i = 0; i < empNames.length; i++) {
                System.out.printf("* 이름 : %s 사번 : %s 직책 : %s\n", empNames[i], empNumbers[i], empPosition[i]);
            }
            System.out.println("-------------------------------------");
        }
    }

    static void exit() {
        System.out.println("프로그램을 종료하시겠습니까? [Y/N]");
        String yesNo = sc.nextLine();
        if (yesNo.equals("y") || yesNo.equals("Y")) {
            System.out.println("프로그램을 종료합니다.");
            System.exit(0);
        }
    }

    static void inputPosition() {
        String position = inputString("직책: ");
        String[] temp4 = new String[empPosition.length + 1];
        for (int i = 0; i < empPosition.length; i++) {
            temp4[i] = empPosition[i];
        }
        temp4[temp4.length - 1] = position;
        empPosition = temp4;
    }
    static void inputPassword() {
        String position = inputString("직책: ");
        String[] temp3 = new String[empPasswords.length + 1];
        for (int i = 0; i < empPasswords.length; i++) {
            temp3[i] = empPasswords[i];
        }
        temp3[temp3.length - 1] = position;
        empPasswords = temp3;
    }

    static boolean login_status = false;

    public static void main(String[] args) {

        while (true) {
            if (login_status == false) {
                LoginMenu();
                int choice = inputInt();
                if (choice == 1) {

                } else if (choice == 2) {
                    inputName();
                    inputNum();
                    inputPassword();
                    System.out.println("등록이 완료되었습니다.");

                } else if (choice == 3) {
                    totalList();

                } else if (choice == 4) {
                    exit();
                }
            } else {
                printMenu();
                int choice = inputInt();

                if (choice == 5) {
                    inputName();
                    inputNum();
                    inputPassword();
                    System.out.println("등록이 완료되었습니다.");

                } else if (choice == 6) {
                    exit();
                }
            }
            /*System.out.println(Arrays.toString(empNames));
            System.out.println(Arrays.toString(empNumbers));
            System.out.println(Arrays.toString(empPosition));*/
        }//while

    }//main
}//class