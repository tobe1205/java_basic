package MyFolder.HomeWork01.Gugudan;

public class GugudanQuiz {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);

        System.out.print("단수 입력: ");
        int level = sc.nextInt();
        int n = 1;

        System.out.printf("랜덤 구구단 %d단\n",level);

        while (n <= 9){
            System.out.printf("%d x %d = %d\n", level,n,level*n);
            n += 1;
        }*/

        /*Scanner sc = new Scanner(System.in);

        System.out.print("단수 입력: ");
        int level = sc.nextInt();
        System.out.printf("구구단 %d단\n",level);
        System.out.println("---------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d x %d = %d\n", level,i,level * i);

        }*/

        for (int level = 2; level <= 9; level++) {
            for (int i = 1; i <=9 ; i++) {
                System.out.printf("%d x %d = %d\n",level,i,level*i);

            }
            
        }
        

    }
}
