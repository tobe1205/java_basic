package day19.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 500000; i++) {
            list1.add(i);
            list2.add(i);
        }

        //배열리스트에서 데이터 삭제
        long start = System.currentTimeMillis(); //현재 시간을 밀리초로 리턴
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            list1.remove(0);
        }
        long end = System.currentTimeMillis();
        System.out.printf("배열리스트 삭제소요시간: %dms\n", end-start);

        long start1 = System.currentTimeMillis(); //현재 시간을 밀리초로 리턴
        int size1 = list2.size();
        for (int i = 0; i < size1; i++) {
            list2.remove(0);
        }
        long end1 = System.currentTimeMillis();
        System.out.printf("연결리스트 삭제소요시간: %dms\n", end1-start1);


    }
}