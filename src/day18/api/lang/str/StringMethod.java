package day18.api.lang.str;

import java.util.Locale;

public class StringMethod {

    public static void main(String[] args) {

        String str = "hello java";

        // charAt(index) : 문자열 인덱스에 따른 글자 반환
        char c = str.charAt(4);//str[4] 와 같음
        System.out.println("c = " + c);

        //substring() : 문자열의 특정 범위를 추출
        String ss1 = str.substring(6);
        System.out.println("ss1 = " + ss1);

        String ss2 = str.substring(0, 5);
        System.out.println("ss2 = " + ss2);
        
        //length() : 문자열 총 길이 반환
        int len = str.length();
        System.out.println("len = " + len);

        //indexOf(), lastIndexOf() : 특정 문자나 단어의 첫글자 인덱스 반환
        int first = str.indexOf("l");
        int last = str.lastIndexOf("l");
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        //java라는 단어가 포함되어있으면 첫글자인덱스를 반환
        //포함되어있지 않으면 -1 반환
        int java = str.indexOf("java");
        System.out.println("java = " + java);

        //일괄 대소문자변경
        String str2 = "HeLLo PoRoRo";
        String lower = str2.toLowerCase();
        String upper = str2.toUpperCase();
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);

        String filePath = "D:/local/img/2022/01/03/dog.GIF";
        String ext = filePath.substring(filePath.indexOf(".")+1);
        String ext2 = filePath.substring(filePath.lastIndexOf(".")+1);
        System.out.println("ext = " + ext);
        System.out.println("ext2 = " + ext2);

        switch (ext.toUpperCase()){
            case "jpg" : case "png" : case "gif": case"svg":
                System.out.println("이미지 파일입니다.");
                break;
            default:
                System.out.println("일반 파일입니다.");
        }

        //replace(old,new) : 문자열 내부에 old문자를 찾아서 new 문자로 일괄변경
        String message = "python study, python program, python data";
        String replace = message.replace("python","java");
        System.out.println("replace = " + replace);
    }
}
