package HomeWork01.ForQuiz;

public class ForQuiz1 {

    public static void main(String[] args) {
        /*int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

//        int x, y;
//
//        for (x = 5; x >= 1; x--) {
//            for (y = 1; y <= x ; y++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        /*int a, b;

        for(a=1;a<=5;a++){
            for(b=5;b>=1;b--){
                if(a<b){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }*/

        int num1,num2;

        for (num1 = 0;  num1 < 5; num1++) {
            for (num2 = 0; num2 < num1; num2++) {
                System.out.print(" ");
            }
            for (int k = 5; k > num1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
