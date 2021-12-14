package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Project01 {

    //출근자 이름배열
    static String[] empNames = {};
    static String[] empNumbers = {};
    static String[] empPosition = {};

    // 메뉴화면
    static void printMenu() {
        System.out.println("==========직원관리프로그램==========");
        System.out.println("1. 출근하기");
        System.out.println("2. 퇴근하기");
        System.out.println("3. 출근 확인");
        System.out.println("4. 출근자 확인");
        System.out.println("5. 사원등록");
        System.out.println("6. 사원리스트 보기");
        System.out.println("7. 프로그램 종료");
        System.out.print("=> ");
    }

    //1. 출근하기
    //이름, 사번 입력하기 -> 사번번호는 8자리, 동일 사번여부(y:이미출석처리되었습니다/n:사원등록이 안되어있는번호입니다. 등록후 이용해주세요)
    //출근자 리스트에 데이터 추가


    static Scanner sc = new Scanner(System.in);

    static int inputInt() {
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    static String inputString(String s) {
        System.out.print(s);
        return sc.nextLine();
    }

    public static void main(String[] args) {

        while (true) {
            printMenu();
            int choice = inputInt();

            if (choice == 5) {
                String name = inputString("이름: ");
                String num = inputString("사원 번호: ");
                String position = inputString("직책: ");

                String[] temp = new String[empNames.length + 1];
                String[] temp2 = new String[empNumbers.length + 1];
                String[] temp3 = new String[empPosition.length + 1];

                for (int i = 0; i < empNames.length; i++) {
                    temp[i] = empNames[i];
                }
                temp[temp.length - 1] = name;
                empNames = temp;
                temp = null;

                for (int i = 0; i < empNumbers.length; i++) {
                    temp2[i] = empNumbers[i];
                }
                temp2[temp2.length - 1] = num;
                empNumbers = temp2;
                temp2 = null;

                for (int i = 0; i < empPosition.length; i++) {
                    temp3[i] = empPosition[i];
                }
                temp3[temp3.length - 1] = position;
                empPosition = temp3;
                temp3 = null;
            } else if (choice == 6) {
                int index = -1;
                System.out.println("------------ 사원 목록 ---------------");

            }
            System.out.println("등록이 완료되었습니다.");
            System.out.println(Arrays.toString(empNumbers));
            System.out.println(Arrays.toString(empNames));
            System.out.println(Arrays.toString(empPosition));
        }//main
    }//class
}