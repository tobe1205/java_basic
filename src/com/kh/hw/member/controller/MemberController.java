package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

    private Member[] m = new Member[SIZE];
    public static final int SIZE = 10;

    public MemberController() {
        m[0] = new Member("abc", "김철수", "1234", "abc@naver.com", 'M', 24);
        m[1] = new Member("def", "박영희", "4321", "def@naver.com", 'F', 32);
        m[2] = new Member("ghi", "김철수", "6544", "ghi@naver.com", 'M', 44);
        /*m[3] = new Member("jkl", "김철수", "1234", "ddd@naver.com", 'M', 24);
        m[4] = new Member("mno", "박영희", "4321", "sss@naver.com", 'F', 32);
        m[5] = new Member("pqr", "홍길동", "1111", "bbb@naver.com", 'M', 44);
        m[6] = new Member("stu", "임꺽정", "2222", "www@naver.com", 'M', 44);
        m[7] = new Member("vwx", "호랭이", "3333", "yyy@naver.com", 'M', 44);
        m[8] = new Member("yza", "개구리", "4444", "zzz@naver.com", 'M', 44);
        m[9] = new Member("bcd", "고양이", "5555", "xxx@naver.com", 'M', 44);*/
    }

    /**
     * 실제로 배열에 저장되어 있는 회원객체의 숫자를 세는 메서드
     *
     * @return count - 실제 저장된 회원의 수
     */
    public int existMemberNum() {
        int count = 0; //숫자를 세는 변수
        for (Member member : m) {
            if (member == null) break;
            count++;
        }
        return count;
    }

    /**
     * 아이디 중복을 체크하는 메서드
     *
     * @param inputId - 중복을 확인할 사용자의 입력 아이디
     * @return 중복되었으면 true, 아니면 false
     */
    public boolean checkId(String inputId) {
        return findIndexById(inputId) != -1;
    }
    public boolean checkIdLength(String inputId){
        return inputId.length() < 7 && inputId.length() > 2;
    }
    //멤버 배열 리턴
    public Member[] printAll() {
        return m;
    }

    public void insertMember(String id, String name, String password
            , String email, char gender, int age) {
        int count = existMemberNum();


        m[count] = new Member(id, name, password, email, gender, age);
    }

    /**
     * 아이디를 입력하면 해당 회원 객체를 리턴
     *
     * @param inputId - 검색할 회원의 아이디
     * @return Member - 찾은 경우 해당 아이디를 가진 회원의 전체정보를 가진 객체
     * - 못찾은 경우 null 리턴
     */
    public Member searchId(String inputId) {
        for (Member member : m) {
            if (member == null) {
                break;
            }
            if (inputId.equals(member.getId())) {
                return member;
            }
        }
        return null;
    }

    //이메일을 입력하면 해당 회원 객체 리턴
    public Member searchEmail(String inputEmail) {
        for (Member member : m) {
            if (member == null) {
                break;
            }
            if (inputEmail.equals(member.getEmail())) {
                return member;
            }
        }
        return null;
    }

    public Member[] searchName(String name) {

        Member[] foundMembers = new Member[SIZE];

        int count = 0;
        for (Member member : m) {
            if (member == null) break;
            if (name.equals(member.getId())) {
                foundMembers[count++] = member;
            }
        }
        Member[] returnMembers = new Member[count];
        for (int i = 0; i < count; i++) {
            returnMembers[i] = foundMembers[i];
        }
        return returnMembers;
    }

    /**
     * 회원의 비밀번호를 변경하는 메소드
     *
     * @param id          - 변경을 요청한 회원의 아이디
     * @param newPassword - 새로운 비밀번호
     * @return -변경 성공 여부
     */
    public boolean updatePassword(String id, String newPassword) {
        Member member = searchId(id);
        if (member != null) {
            System.out.println("수정이 성공적으로 완료 되었습니다.");
            member.setPassword(newPassword);
            return true;
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
            return false;
        }
    }

    public boolean updateName(String id, String newName) {
        Member member = searchId(id);
        if (member != null) {
            System.out.println("수정이 성공적으로 완료 되었습니다.");
            member.setName(newName);
            return true;
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
            return false;
        }
    }

    public boolean updateEmail(String id, String newEmail) {
        Member member = searchId(id);
        if (member != null) {
            System.out.println("수정이 성공적으로 완료 되었습니다.");
            member.setEmail(newEmail);
            return true;
        } else {
            System.out.println("존재하지 않는 아이디입니다.");
            return false;
        }
    }

    private int findIndexById(String id) {
        int index = -1;
        for (int i = 0; i < existMemberNum(); i++) {
            if (id.equals(m[i].getId())) {
                index = i;
                break;
            }
        }
        return index;
    }

    //회원정보 하나를 삭제하는 메서드
    public boolean delete(String id) {
        int index = findIndexById(id);

        if (index != -1) {
            for (int i = index; i < existMemberNum() - 1; i++) {
                m[i] = m[i + 1];
            }
            //마지막 데이터를 null로 변경
            m[existMemberNum() - 1] = null;
            return true;
        } else {
            return false;
        }
    }

    //회원정보 전체 삭제
    public void delete(){
        int count = existMemberNum();
        for (int i = 0; i < count; i++) {
            m[i] = null;
        }
    }
}