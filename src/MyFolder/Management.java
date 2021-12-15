package MyFolder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Management {
    //멤버 필드 선언
    private BufferedReader in;
    private int inputNum;
    private String name;
    private String memberNum;
    private String position;
    private String time;
    private Member s;
    private static final int MEMBER_NUM_LEN = 8;
    private static final int Time_NUM_LEN = 5;
    // 디폴트 생성자
    // 입출력, 메뉴 선택 번호, Member 객체 생성
    public Management(){
        in = new BufferedReader(new InputStreamReader(System.in));
        inputNum = 0;
        s = Member.genTo();
    }

    public int getInputNum() {
        return this.inputNum;
    }
    // 메뉴 선택 번호를 정수로 변환
    public void setInputNum() throws IOException {
        this.inputNum = Integer.parseInt(in.readLine());
    }
    public String getName() {
        return this.name;
    }

    public void setName() throws IOException {
        this.name = in.readLine();
    }

    public String getMemberNum() {
        return this.memberNum;
    }
    // 사번 자리 수 검사를 통해 조건에 맞는 값을 입력시 통과
    public void setMemberNum() throws IOException {
        while(true) {
            this.memberNum = in.readLine();
            if(this.memberNum.length() != MEMBER_NUM_LEN) {
                System.out.println("*사번은 " + MEMBER_NUM_LEN + "자리 입니다.");
                System.out.println("*다시입력해 주시기 바랍니다.");
                System.out.print("사번 : ");
            } else {
                break;
            }
        }
    }
    public String getPosition() {
        return this.position;
    }

    public void setPosition() throws IOException {
        this.position = in.readLine();
    }


    public String getTime() {
        return this.time;
    }
    // 시간 자리 수 검사를 통해 형식에 맞는 값을 입력시 통과
    public void setTime() throws IOException {
        while(true) {
            this.time = in.readLine();
            if (this.time.length() != Time_NUM_LEN) {
                System.out.println("*시간의 형식은 hh:mm 입니다.");
                System.out.println("*형식에 맞게 다시 입력해 주시기 바랍니다.");
                System.out.print("시간 : ");
            } else {
                break;
            }
        }
    }


    public static void main(String[] args) {
        // MyFolder.Management 객체 생성
        Management m =new Management();

        while(true) {
            try {
                // 메뉴 출력
                printMenu();
                // 메뉴 선택 번호 입력받기
                m.setInputNum();
                // 선택값에 따른 분기
                switch(m.getInputNum()) {
                    case 1:
                        System.out.print("이름 : ");
                        m.setName();
                        System.out.print("사번 : ");
                        m.setMemberNum();
                        System.out.print("시간(hh:mm) : ");
                        m.setTime();
                        m.s.goWork(m.getName(), m.getMemberNum(), m.getTime());

                        break;
                    case 2:
                        System.out.print("이름 : ");
                        m.setName();
                        m.s.leaveWork(m.getName());

                        break;
                    case 3:
                        System.out.print("이름 : ");
                        m.setName();
                        m.s.checkGo(m.getName());
                        break;
                    case 4:
                        m.s.printGo();
                        break;
                    case 5:
                        System.out.print("이름 : ");
                        m.setName();
                        System.out.print("사번 : ");
                        m.setMemberNum();
                        System.out.print("직책 : ");
                        m.setPosition();
                        m.s.addMember(m.getName(), m.getMemberNum(), m.getPosition());
                        break;
                    case 6:
                        m.s.printMember();
                        break;
                    case 7:
                        System.out.println("프로그램을 종료합니다.");
                        System.exit(0);
                        break;
                    default:
                        // 1~7가 아닌 다른 숫자 입력시 예외 던지기
                        throw new Exception();
                }

                // 조건에 맞지 않는 숫자를 입력시 예외처리하여 출력하기
            } catch(Exception e){
                System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("입력이 올바르지 않습니다.");
                System.out.println("1 ~ 7 사이의 숫자를 입력해 주세요.");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }

        }

    }
    // 메뉴 구성
    public static void printMenu() {
        System.out.println("==========직원관리프로그램==========");
        System.out.println("1. 출근하기");
        System.out.println("2. 퇴근하기");
        System.out.println("3. 출근확인");
        System.out.println("4. 출근자 확인");
        System.out.println("5. 사원등록");
        System.out.println("6. 사원리스트 보기");
        System.out.println("7. 프로그램 종료");
        System.out.println("*프로그램 종료시 모든 데이터는 소멸됩니다.");
        System.out.println("번호입력 : ");
    }




    public static class  Member {
        // 등록사원리스트, 등록사원사번리스트, 등록사원직책리스트, 출근자이름리스트, 출근자사번리스트, 출근자시간리스트 선언
        private ArrayList<String> nameList;
        private ArrayList<String> memberNumList;
        private ArrayList<String> positionList;
        private ArrayList<String> todayMem;
        private ArrayList<String> todayNum;
        private ArrayList<String> todayTime;
        private static Member memB;

        //디폴트 생성, 의미없음.
        private Member() {}

        //객체를 싱글톤으로 관리
        public static Member genTo() {
            if (memB == null) {
                memB = new Member();
                memB.nameList = new ArrayList<String>();
                memB.positionList = new ArrayList<String>();
                memB.todayMem = new ArrayList<String>();
                memB.memberNumList = new ArrayList<String>();
                memB.todayNum = new ArrayList<String>();
                memB.todayTime = new ArrayList<String>();
            }
            return memB;
        }
        // 사원 리스트에 등록하기
        public void addMember(String name, String memberNum, String position) {
            boolean Flag = true;
            // 사원리스트에 동일 사번이 있을 시 중단
            if (Member.memB.memberNumList.size() != 0) {
                for(int i = 0 ; i<Member.memB.memberNumList.size(); ++i) {
                    if(memberNum.equals(Member.memB.memberNumList.get(i))) {
                        System.out.println("*이미 등록된 사번입니다.\n");
                        Flag = false;
                    }
                }
            }
            // 사원리스트에 이름, 사번, 직책 등록
            if(Flag) {
                this.nameList.add(name);
                this.memberNumList.add(memberNum);
                this.positionList.add(position);
                System.out.println("\n등록이 완료되었습니다.\n");
            }
        }
        // 사원 리스트 프린트 하기
        public void printMember() {
            if(Member.memB.nameList.size() < 1) {
                System.out.println("*등록된 사원이 없습니다.");
                System.out.println("*사원 등록 후 조회하시기 바랍니다.\n");
            } else {
                System.out.println("--------------- 사원 목록 ---------------");
                for(int i = 0; i<Member.memB.nameList.size(); ++i) {
                    System.out.println("* " + "이름 : " + Member.memB.nameList.get(i) + ", "+ "사번 : " + Member.memB.memberNumList.get(i) + ", "+ "직책 : " + Member.memB.positionList.get(i));
                }
                // 이름, 사번, 직책 순으로 등록한 순서대로 나열하기
                System.out.println("--------------------------------------");
                System.out.println();
            }
        }
        // 출근 리스트 등록
        public void goWork(String name, String memberNum, String time) {
            boolean Flag = true;
            int count = 0;
            // 출근 리스트에 동일 사번이 있을 시 중단.
            if (Member.memB.todayNum.size() != 0) {
                for(int i = 0 ; i<Member.memB.todayNum.size(); ++i) {
                    if(memberNum.equals(Member.memB.todayNum.get(i))) {
                        System.out.println("*이미 출석처리 되었습니다.\n");
                        Flag = false;
                    }
                }
            }
            // 사원리스트에 입력한 사번이 없을 시 중단.
            for(int i = 0; i<Member.memB.memberNumList.size(); ++i) {
                if(memberNum.equals(Member.memB.memberNumList.get(i))) {
                    count ++;
                }
            }
            if (count == 0) {
                System.out.println("\n사원등록이 안되어 있는 번호입니다. 등록 후 이용해주세요.\n");
                Flag = false;
            }
            // 사원리스트에 이름, 사번, 시간 등록
            if(Flag) {
                this.todayMem.add(name);
                this.todayNum.add(memberNum);
                this.todayTime.add(time);
                System.out.println("\n출근처리가 완료되었습니다.\n");
            }
        }
        // 퇴근 하기
        public void leaveWork(String name) {
            if(Member.memB.todayMem.size() != 0) {
                // 입력한 사원 이름이 있을 시 삭제
                for(int i = 0 ; i<Member.memB.todayMem.size(); ++i) {
                    if(name.equals(Member.memB.todayMem.get(i))) {
                        Member.memB.todayMem.remove(i);
                        Member.memB.todayNum.remove(i);
                        Member.memB.todayTime.remove(i);
                        System.out.println("\n퇴근처리가 완료되었습니다.\n");
                    }
                }
                //입력한 사원 이름이 없을 시 중단.
            }else {
                System.out.println("*이미 퇴근처리가 되었습니다.\n");
            }
        }
        // 출근자 확인
        public void checkGo(String name) {
            // 임시로 1000이라는 값을 넣었음. 만약 사원 수가 1000이 될 시 예외가 생김.
            int k = 1000;
            // 입력한 이름이 리스트에 동일한 이름이 하나라도 있게 되면 해당 사원의 정보를 출력
            if(Member.memB.todayMem.size() != 0) {
                for(int i = 0 ; i<Member.memB.todayMem.size(); ++i) {
                    if(name.equals(Member.memB.todayMem.get(i))) {
                        k = i;
                    }
                }
                if(k != 1000) {
                    System.out.println(Member.memB.todayMem.get(k) +"분은 " + Member.memB.todayTime.get(k) + "에 출근하였습니다.\n");
                }else {
                    System.out.println("* 해당 사원은 출근하지 않은 상태입니다.\n");
                }
            }
        }
        // 출근자리스트 출력하기
        public void printGo() {
            // 출근자의 이름, 사번, 출근 시간을 순서대로 나열.
            if(Member.memB.todayMem.size() < 1) {
                System.out.println("아직 출근자가 없습니다.\n");
            } else {
                System.out.println("---------------출근자 목록---------------");
                System.out.println("이름       사번                   출근시간");
                for(int i = 0; i<Member.memB.todayMem.size(); ++i) {
                    System.out.println(Member.memB.todayMem.get(i) + "     " + Member.memB.todayNum.get(i) + "     "+ Member.memB.todayTime.get(i));
                }
                System.out.println("--------------------------------------");
                System.out.println();
            }
        }

    }
}