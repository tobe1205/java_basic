package day11.player;

public class Main {
    
    public static void main(String[] args) {
        
        Player park = new Player();
        Player show = new Player();

        System.out.println("park = " + park);
        System.out.println("show = " + show);

        show.attack(park);
    }
}
