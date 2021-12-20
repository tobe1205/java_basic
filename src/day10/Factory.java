package day10;

public class Factory {

    public static void main(String[] args) {

        //객체의 생성
        Phone galaxy = new Phone();
        System.out.println("galaxy = " + galaxy);

        /*galaxy.model = "갤럭시 S21";
        galaxy.color = "펄 블랙";
        galaxy.price = 800000;*/

        //객체의 속성과 기능을 참조할 때 : .연산자 사용
        galaxy.showSpec();

        System.out.println("================================");


        Phone haptic = new Phone("햅틱2");
        /*haptic.model = "햅틱2";
        haptic.color = "화이트";
        haptic.price = 600000;*/
        haptic.showSpec();

        System.out.println("================================");

        Phone iPhone = new Phone("아이폰X","사파이어");
        iPhone.showSpec();

        System.out.println("==============================");
        iPhone.sendMessage(galaxy, "하이~~~~");
        iPhone.sendMessage(galaxy, "하이 뭐하니~?");
        iPhone.sendMessage(galaxy, "하이헤헤헤헤");
        iPhone.sendMessage(galaxy, "ㅎㅎㅋㅋ!!");

        galaxy.checkMessages();

        haptic.sendMessage(iPhone,"안녕~~");
        galaxy.sendMessage(iPhone,"나는 갤럭시야~~");

        iPhone.checkMessages();
        haptic.checkMessages();

    }
}
