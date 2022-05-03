package Riot;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class June01 {
    //gradle version error
    //알림창 pre kit - always download
    /**색깔주석,
     */
    public static void main(String[] args) {

        // HEllo WORLD!
        //  System.out.println("HelloWorld!");
        //  System.out.println("HelloWordl!".length());
        //  System.out.println("Hello\nWorld!");

        /* 앵무새 만들기
        Scanner jake = new Scanner(System.in);
        String ab = jake.nextLine();
        System.out.println(ab);
        */

         //.replace(A,B)
         //System.out.println("Hello June...Bye June...".replace("June","Tom"));


/*      int k=3;
        int a=(int)5.1234;       < Explicit conversion 강제
        double c=4;
        float d = 5.655F;        < 상수 값이 기본 double 이므로 F 붙여줘야 인식함
        System.out.println(k);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
*/
/*      // "+변수+" 로 "~" 안에서 String 변수값 구별!
        //.replace 보다 효율적
          String name = "Tom";
          System.out.println("Hello "+name+"! It\'s nice to meet you, "+name+"! Bye "+name+"!");
          */

          //String to int Casting! << Googling 활용
          //String으로 들어온 정보에 연산을 해야할 때 이용하자
/*         String age = "24";
           int realage = Integer.parseInt(age);           // << String to int casting
           System.out.println(realage+2);
*/

       //int to String Casting << Googling
/*     int c = 33;
       String age = Integer.toString(c);           //  << int to String casting
       System.out.println(age+6);              //  -> 33+6=336 (!39) 문자열로 인식한다.
 */

        // Conversion 순서
        // byte -> short -> int -> long -> float -> double

     /*           int a = 3 ;
                float b = 3.1415F;
        System.out.println(a+b);             // int->float  implicit conversion 3->3.0
                                                                6.1415 */



    }
}