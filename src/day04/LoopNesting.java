package day04;

public class LoopNesting {

    public static void main(String[] args) {

        for (char u = 'A'; u <= 'Z'; u++){
            for (char l = 'a'; l<= 'z'; l++){
                System.out.printf("%c - %c\n",u, l);
            }

        }
    }
}
