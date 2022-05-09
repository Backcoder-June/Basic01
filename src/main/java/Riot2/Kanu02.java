package Riot2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Kanu02 {

    public static void main(String[] args) {
/*    //스캐너 1회용
        Scanner sc = new Scanner(System.in);          << new scanner 할때 띄어쓰기로 치면 new따로 scanner따로 조심
        int a = sc.nextInt();                            << new Scanner( file source ) < System < 대문자 S
        System.out.println(a * 1000);
*/
        //스캐너 + while -> 계속사용가능한 System.in
/*
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine()+"라구요?");
        }
        sc.close();
*/
/*
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            System.out.println(sc.nextInt()*100);
        } sc.close();
*/
        // File 을 입력값으로 받는 방법

        // Project 디렉토리에 txt 파일 생성, txt 파일에 입력값
/*        try {


            File fi = new File("out.txt");
            Scanner sc = new Scanner(fi);
            while (sc.hasNextInt()) {
                System.out.println(sc.nextInt() * 100);
            }
            sc.close();

        }

           catch (FileNotFoundException e){e.printStackTrace();}      //< {} 안 인데도 ; 로 마무리 해줘야함
*/                                                                     // printStackTrace(); 특
        // {sout();} 처럼 ()로 끝나는거엔 ; 붙인다
        // FNFE e <<< . 안붙이고다

        //String 을 File 에서 가져와보자
/*         try{
            File fi = new File("out02.txt");
            Scanner sc = new Scanner(fi);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            } sc.close();
        }
        catch(FileNotFoundException e){e.printStackTrace();}
*/
        //Configuration 을 이용해 프로그램에 입력값(초기값)(인자값) 미리 줘놓기  <= program arguments
/*        System.out.println(args.length);              // <- main(String[] args) 의 args. <- configuration
        for (String a : args){
            System.out.println(a+1);

        }
*/
        // 그런데 configuration 으로 넣은건 String 으로만 출력된다.
        // int 로 안빼진다. main 이 String 기반이라 그런 듯 하다.

        // String to Int 캐스팅으로 Configuration 인자값을 Int 로 출력해보기
/*

           for(String a : args){int b = Integer.parseInt(a);
           System.out.println(b+2);}                               << 된다잇

*/


        //


        }


    }

