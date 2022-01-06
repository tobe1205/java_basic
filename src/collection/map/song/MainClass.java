package collection.map.song;

import java.util.*;
import java.io.*;

public class MainClass {


    static Map<String, Set<String>> artists = new HashMap<>();
    static Set<String> songs = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //디렉토리를 생성하는 코드.
        File f = new File("D:/musics");//File객체의 생성자에 생성할 디렉토리 경로를 적음.
        if(!f.exists()) {//해당 경로에 디렉토리가 존재하지 않는다면~~
            f.mkdirs(); //디렉토리를 만들어라~~
        }

        loadData();//저장된 데이터 자동 불러오기 기능.
        while(true) {

            showMenu();
            int menu = inputMenu();

            switch(menu) {

                case 1:
                    insertMusic();
                    break;
                case 2:
                    searchMusic();
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("메뉴를 잘못 입력했습니다.");
            }

        }

    }

    public static void showMenu() {
        System.out.println("\n\n*** 음악 관리 프로그램 ***");
        System.out.printf("# [현재 등록된 가수: %d명]\n", artists.size());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("*********************");
    }

    public static int inputMenu() {
        int menu = 0;
        while(true) {
            System.out.print("- 메뉴 입력: ");
            try {
                menu = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("메뉴는 숫자로만 입력하세요.");
                sc.nextLine();
            }
        }
        return menu;
    }

    public static void insertMusic() {
        System.out.println("\n# 노래 등록을 시작합니다.");
        System.out.print("- 가수명: ");
        sc.nextLine();
        String artist = sc.nextLine();
        System.out.print("- 곡명: ");
        String song = sc.nextLine();
        songs = new HashSet<>();
        if(artists.containsKey(artist) && artists.get(artist).contains(song)){
            System.out.println("# 이미 등록된 노래입니다.");
            return;
        }
        if(!artists.containsKey(artist)){
            System.out.printf("# 아티스트 [%s]님이 신규등록되었습니다.",artist);
            songs.add(song);
            artists.put(artist,songs);
        }else{
            System.out.printf("# 아티스트 [%s]님의 노래목록에 [%s]이(가) 추가되었습니다.",artist,song);
            songs = artists.get(artist);
            songs.add(song);
        }


		/*
		 1. 가수명이 중복되었는지 확인 후 신규 가수 등록이라면
		 "# 아티스트 xxx님이 신규등록되었습니다."를 출력 후 해당 곡명과 함께
		  컬렉션에 저장하세요.
		 2. 만약 이미 등록되었던 가수명이라면
		 "# 아티스트 xxx님의 노래목록에 xxx이(가) 추가되었습니다."
		 를 출력 후 컬렉션에 저장하세요.
		 3. 가수명과 곡명이 모두 사전에 등록된 정보라면
		 "# 이미 등록된 노래입니다."를 출력하세요.
		 */

        saveData();
    }

    public static void searchMusic() {
        System.out.println("\n# 노래를 검색할 가수명을 입력하세요.");
        System.out.print("- 가수명: ");
        sc.nextLine();
        String artist = sc.nextLine();
        if (artists.containsKey(artist)){
            System.out.printf("* [%s]님의 노래목록 *\n",artist);
            System.out.println(artists.get(artist));
        } else{
            System.out.println("해당 아티스트는 등록되지 않았습니다.");
        }

		/*
		 1. 가수명을 입력받아 해당 가수명에 매핑되어 저장되어있는 Set컬렉션을
		  출력하세요.
		  ex) * xxx님의 노래목록 *
		      [abc, def, ghi, jkl ...]
		 2. 등록된 가수가 아니라면 "해당 아티스트는 등록되지 않았습니다."를 출력.
		 */

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

            //성적정보가 저장된 리스트를 파일에 저장.
            oos.writeObject(artists);

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
            artists = (Map<String, Set<String>>) ois.readObject();

        } catch (Exception e) {
        } finally {
            if(ois != null) try {ois.close();}catch(Exception e) {}
        }

    }

}






