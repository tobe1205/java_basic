package day20.collection;

import java.io.*;
import java.util.*;

public class SongManager {

    private static Map<String, Set<String>> artistMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //디렉토리를 생성하는 코드.
        File f = new File("D:/musics");//File객체의 생성자에 생성할 디렉토리 경로를 적음.
        if(!f.exists()) {//해당 경로에 디렉토리가 존재하지 않는다면~~
            f.mkdirs(); //디렉토리를 만들어라~~
        }

        loadData(); //세이브파일 로딩
        while (true) {
            showMenu();
            int menuNum = sc.nextInt();
            sc.nextLine();

            switch (menuNum) {
                case 1:
                    insertMusic();
                    break;
                case 2:
                    searchMusic();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("# 메뉴를 잘못 입력했습니다.");
            }

        }//end while

    }//end main

    //등록처리
    private static void insertMusic() {

        System.out.println("\n# 노래 등록을 시작합니다.");
        System.out.printf("- 가수명: ");
        String singer = sc.nextLine();

        System.out.printf("- 곡명: ");
        String song = sc.nextLine();

        //신규가수인가?
        if (!artistMap.containsKey(singer)) { //신규가수
            Set<String> newSongList = new HashSet<>(); //노래목록 최초생성
            newSongList.add(song); //노래추가
            artistMap.put(singer, newSongList);

            System.out.printf("# 아티스트 %s님이 신규 등록되었습니다.\n", singer);
        } else { //기존등록가수
            //해당 가수의 노래목록 참조
            Set<String> songList = artistMap.get(singer);
            if (songList.add(song)) {
                System.out.printf("# %s님의 노래목록에 '%s'곡이 추가되었습니다.\n"
                        , singer, song);
            } else {
                System.out.println("# 이미 등록된 노래입니다");
            }
        }

        saveData();

    }

    //검색처리
    private static void searchMusic() {

        System.out.println("\n# 검색할 가수명을 입력하세요.");
        System.out.printf("- 가수명: ");
        String singer = sc.nextLine();

        //등록된 가수인가?
        if (artistMap.containsKey(singer)) {
            System.out.printf("\n# %s님의 노래목록 \n", singer);
            System.out.println("================================");

            int sequence = 1; //노래곡번호
            for (String title : artistMap.get(singer)) {
                System.out.printf("* %d. %s\n", sequence++, title);
            }
        } else {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        }

    }

    //메뉴를 출력하는 메서드
    private static void showMenu() {
        System.out.println("\n\n**** 음악 관리 프로그램 ****");
        System.out.printf("# 현재 등록된 가수: %d명\n", artistMap.size());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("===============================");
    }

    //입력된 노래데이터를 저장하는 메서드.
    private static void saveData() {

        //먼저 저장할 경로와 파일명을 변수에 저장.
        String fileName = "D:/musics/musics.sav";

        //파일 저장기능을 하는 java.io패키지의 api사용.
        FileOutputStream fos = null;
        //보조스트림 oos는 객체저장 기능을 가지고 있음.
        ObjectOutputStream oos = null;

        try {
            //파일 저장을 위한 객체 생성.
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);

            //노래정보가 저장된 리스트를 파일에 저장.
            oos.writeObject(artistMap);

        } catch (FileNotFoundException e) {
            System.out.println("해당 경로가 존재하지 않습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(oos != null) try {oos.close();}catch(Exception e) {}
        }

    }

    //파일에 저장된 정보를 불러오는 메서드.
    private static void loadData() {

        String fileName = "D:/musics/musics.sav";

        //파일 입력(불러오기)을 위한 api
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);

            //readObject는 파일에저장된 객체를 Object타입으로 리턴한다.
            artistMap = (Map<String, Set<String>>) ois.readObject();

        } catch (Exception e) {
        } finally {
            if(ois != null) try {ois.close();}catch(Exception e) {}
        }

    }


}//end class