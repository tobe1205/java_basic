package day18.api.time;

import java.time.*;

public class Basic {

    public static void main(String[] args) {
        
        //현재 날짜 정보 얻기 (연, 월, 일) - 로컬타임(운영체제시간)
        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);
        
        //특정 날짜정보를 생성
        LocalDate targetDate = LocalDate.of(2022, 3, 9);
        System.out.println("targetDate = " + targetDate);
        
        //현재 시간 정보
        LocalTime localTime = LocalTime.now();
        System.out.println("localTime = " + localTime);

        //특정 시간 정보
        LocalTime targetTime = LocalTime.of(18, 00, 10);
        System.out.println("targetTime = " + targetTime);

        //현재 날짜와 시간정보 얻기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);

        int year = localDateTime.getYear();
        System.out.println("year = " + year);

        int monthValue = localDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        Month month = localDateTime.getMonth();
        System.out.println("month = " + month);

        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);




    }
}
