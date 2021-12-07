package HomeWork01.ArrayPractice;

public class ArrayPractice {

    public static void main(String[] args) {

        int [] score = {98,83,25,17,100,95};

        int total = 0;

        for (int number : score){
        total += number;
        }

        System.out.printf("총점: %d점, 평균: %.2f점",total, (double)total/ score.length);

    }
}
