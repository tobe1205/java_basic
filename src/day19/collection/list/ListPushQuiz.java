package day19.collection.list;

import java.util.*;


public class ListPushQuiz {

    public static void main(String[] args) {
        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        //문자열 1. equals(문자열2) 를 사용할 것!
        // ex) if (s1 == s2) (x)
        //     if(s1.equals(s2)) (o)

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        Scanner sc = new Scanner(System.in);

        //음식명을 2개 입력받고서 해야할 일
        // 1. 입력한 문자가 그만인지 확인해본다.
        // 2. 그만이면 종료하고 반복문을 종료하고 아니면? 배열에 저장해야한다.
        // 3. 음식의 개수가 정해지지 않았으므로 일단 빈 배열로 시작한다.
        // 4. 음식이 한개 입력되었을 때? 빈배열이므로 음식명을 저장할 수 없다.
        // 5. 배열의 크기를 1개 늘려야한다. 그리고 그 자리에 음식명을 저장한다.

        // 2번째 음식명 입력부터 해야할 일
        // 3-2. 기존 음식이 저장된 배열보다 1개 더 큰 배열을 생성한다.
        // 4. 기존 음식명들을 새로 생성된 배열로 복사한다.
        // 5. 마지막 위치에 지금 입력받은 음식명을 저장한다.

//        String[] foodList = {};
        List<String> foodList = new ArrayList<>();

        while (true) {
            System.out.print(">> ");
            String newFood = sc.nextLine();
            if (newFood.equals("그만")) break;

            foodList.add(newFood);
        }
        System.out.println(foodList);
        sc.close();
    } //end main
}//end class

// 처음 리스트를 크게 만들어놓고 카운트를 하나 따로 잡아서 length로 하는것이아닌 count갯수로 출력 확인하는 방법도 있다.