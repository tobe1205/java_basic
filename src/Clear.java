import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Clear {

    static String[] foods = {"파스타", "짬뽕", "짜장면"};

    static void clear() {
        foods = new String[0];
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(foods));
        System.out.println("===========================");

        clear();
        System.out.println(Arrays.toString(foods));

        System.out.println("===========================");

        List<String> list = new ArrayList<>(Arrays.asList(foods));
        list.clear(); // 리셋
        foods = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(foods));

    }
}
