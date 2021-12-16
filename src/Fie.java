import java.util.Arrays;
import java.util.Scanner;

public class Fie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = {};
        String number = sc.nextLine();

        String[][] temp = new String[arr.length+1][];
        int index = -1;
        for (int i = 0; i < arr.length ; i++){
            if(number.equals(arr[i])){
                index = i;
                for (int j = 0; j < arr[index].length; i++){
            }


            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
