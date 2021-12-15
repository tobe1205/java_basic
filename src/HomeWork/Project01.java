package HomeWork;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Project01 {

    static Scanner sc = new Scanner(System.in);

    //출근자 이름배열
    static String[] empNames = {"kgw", "aaa", "bbb"};
    static String[] empNumbers = {"0000", "0001", "0002"};
    static String[] empPosition = {"사원", "대리", "과장"};

    /*static String[] empNames = {};
    static String[] empNumbers = {};
    static String[] empPosition = {};*/

    static void date(){
        SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss"); // 출력 모양
        Calendar cal = Calendar.getInstance();
        String format_time = format1.format(cal.getTime());

        System.out.println(format_time);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec =  cal.get(Calendar.SECOND);
    }

    // 첫 화면 메뉴
    static void firstMenu() {
        System.out.println("\n==========직원관리프로그램==========");
        System.out.println("1. 로그인");
        System.out.println("2. 직원등록");
        System.out.println("3. 직원목록");
        System.out.println("4. 프로그램 종료");
        System.out.print("=> ");
    }


    // 메뉴화면
    static int printMenu() {
        System.out.println("==========로그인 성공==========");
        date();
        System.out.println("1. 출근하기");
        System.out.println("2. 퇴근하기");
        System.out.println("3. 출근 확인");
        System.out.println("4. 출근자 확인");
        System.out.println("5. 프로그램 종료");
        System.out.print("=> ");
        return inputInt();
    }


    //1. 출근하기
    //이름, 사번 입력하기 -> 사번번호는 4자리, 동일 사번여부(y:이미출석처리되었습니다/n:사원등록이 안되어있는번호입니다. 등록후 이용해주세요)
    //출근자 리스트에 데이터 추가

    //메뉴선택
    static int inputInt() {
        int n = sc.nextInt();
        if (n > 4 || n <= 0) {
            System.out.println("1 ~ 4사이로 입력해주세요.");
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

    static void inputPosition() {
        String position = inputString("직책: ");
        String[] temp3 = new String[empPosition.length + 1];
        for (int i = 0; i < empPosition.length; i++) {
            temp3[i] = empPosition[i];
        }
        temp3[temp3.length - 1] = position;
        empPosition = temp3;
        temp3 = null;
    }

    //로그인하기
    static boolean Login() {
        while (true) {
            String numCheck = inputString("사원번호: ");
            int index = -1;
            for (int i = 0; i < empNumbers.length; i++) {
                if (numCheck.equals(empNumbers[i])) {
                    index = i;
                    break;
                }
            }
            if (index == -1) {
                System.out.println("\n등록되지 않은 사원번호입니다.");
                System.out.println("초기메뉴에서 등록을 먼저 해주세요.");
                return false;
            } else {
                String nameCheck = inputString("이름: ");
                index = -1;
                for (int i = 0; i < empNames.length; i++) {
                    if (nameCheck.equals(empNames[i])) {
                        index = i;
                        break;
                    }
                }
                if (index == -1) {
                    System.out.println("\n사원번호와 이름이 일치하지 않습니다.");
                    System.out.println("다시 입력해주세요.");
                } else {

                    return true;
                }
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
                System.out.printf("* 이름 : %s || 사번 : %s || 직책 : %s\n", empNames[i], empNumbers[i], empPosition[i]);
            }
            System.out.println("-------------------------------------");
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


    public static void main(String[] args) {

        while (true) {
            firstMenu();

            while (true) {
                int choice = inputInt();
                if (choice == 1) {
                    if(!Login()) {
                        break;
                    } else {
                       int menuNum = printMenu();
                       showWorkProcess(menuNum);
                       break;
                    }
                } else if (choice == 2) {
                    inputName();
                    inputNum();
                    inputPosition();
                    System.out.println("등록이 완료되었습니다.");
                    break;
                } else if (choice == 3) {
                    totalList();
                    break;
                } else if (choice == 4) {
                    exit();
                    break;
                }
            }// end inner while

            /*System.out.println(Arrays.toString(empNames));
            System.out.println(Arrays.toString(empNumbers));
            System.out.println(Arrays.toString(empPosition));*/
        }//outer while

    }//main

    private static void showWorkProcess(int menuNum) {

        if (menuNum == 1) {
            System.out.println("출그,ㄴ했다");
        }
        if (menuNum > 5){
            System.out.println("범위에 맞게 입력하세요");
        }

    }
}