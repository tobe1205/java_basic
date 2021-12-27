package day14.static_;

public class 학생 {
    String 전공;
   static String 국적 = "대한민국";

   void 전공을물어보다(){
       System.out.println("나의 전공: " + this.전공);
   }
   static void 국적을물어보다(학생 질문대상){
       System.out.println("질문대상 학생 전공 = " + 질문대상.전공);
       System.out.println("나의 국적 = " + 국적);
   }

    public static void main(String[] args) {

       학생 김철수 = new 학생();
       학생 박영희 = new 학생();
       김철수.전공 = "경영학";
       박영희.전공 = "물리학";

       김철수.전공을물어보다();
       학생.국적을물어보다(박영희);
    }
}
