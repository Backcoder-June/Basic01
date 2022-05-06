package Riot2;

public class Kanu01 {
    //---------- METHOD 시작 -----------

    /*
    public static void num(){             // num 이라는 method 는 이러이러한 놈이야_정의 Define
        int a = 0;
        while(a<5){
            System.out.println(a);a++;}
        }

        public static void main(String[] args){          //num 불러오기_Call
        num();
        num();
        }
*/
/*
        //String 으로 출력해보기
        public static void num(){
            int a = 0;
            while(a<5){String c = Integer.toString(a);
                System.out.println(c+1);a++;}

        }

        public static void main(String[] args){
            num();
            num();
        }

*/
/*      //Parameter 매개변수 한개 줘보기 - arguments 인자값도 한개
    public static void man(int m){
        int a = 5;
        while(a<m){
            System.out.println(a);a++;}
        }

    public static void main(String[] args) {
        man(12);
    }
*/
/*       매개변수2개 인자값2개 줘보기
    public static void alo(int init, int limit)
    {for(int a = init;a<limit;a++){
        System.out.println(a);
    }}
    public static void main(String[] args){
        alo(0,5);

        alo(1,6);
    }

*/
/*
    public static void numbering(int init, int limit){
        for(int a = init;a<limit;a++) {
            System.out.println("Hello" + a);
        }}

    public static void main(String[] args) {
        numbering(2,10);
        numbering(3,9);
    }
*/
       //  return - 출력(입력갑의 반환) << 으로 해보기   - return 에서 그 method 는 반드시 종료된다.
                       //return 쓸때는 void(빈, Type 없음) 못오고, String,int 처럼 Type 필요.

/*    public static String chul(int init, int limit){
        int a = init;
        String out = "";
        while (a<limit){out = out+a;a++;}
        return out;
    }

    public static void main(String[] args) {
        String result = chul(2,6);
        System.out.println(result);
    }
*/


/*     // for 구문에 return 출력 해보기

    public static String para(int x, int y){
        String bob = "";

        for (int a = x; a<y; a++){bob = bob+a;}
        return bob;

    }

    public static void main(String[] args) {
        String result = para(1,10);
        System.out.println(result);
    }

*/
 /*
        public static String log(int x, int y){
            String alpha = "";
            for (int a = x; a<y; a++){alpha = alpha+a;}
            return alpha;
        }
        public static void main(String[] args){
            String result = log(3,7);
            System.out.println(result);
        }
*/


    /*
       // int Type 으로 return 해보기

        public static int met(int init, int limit){
        int p = 0;                                            //String 일때는 "" 로 쌩변수 하나 만들었음
        for(int a = init; a<limit; a++){p=p+a;}               //int 일때는 0 으로 하면 되는 듯
        return p;
    }


    public static void main(String[] args) {
        int result = met(2,7);
        System.out.println(result);                          //  p = p+a
    }                                                        //  p = 0+2 = 2
                                                             //  p = 2+3 = 5
                                                             //  p = 5+4 = 9
                                                             //  p = 9+5 = 14
                                                             //  p = 14+6= 20
*/                                                      //-> p = p+a +2+3+4+5+6
    /*
    public static int beta(int init, int limit){
        int c = 0;
        for (int x = init; x<limit; x=x+2){c = c+x;}
        return c;
    }

    public static void main(String[] args){
        int result = beta(0,10);
        System.out.println(result);
    }
*/

//Copied from Riot.June02 연습했던 거
    //method 연습장
    /*
        public static void numbering () {
            int a = 0;
            while (a < 5) {
                System.out.println(a);
                a++;
            }
        }

        public static void main (String[]args){
            numbering();
            numbering();
        }


*/
/*
package Riot;

    public class June03 {
 /*   public static void numbering(){
        int a=0;
        while(a<5){
            System.out.println(a);a++;}}

    public static void main(String[] args){
        numbering();} }
*/
  /*  public static void numbering(){
        int a = 0;
        while(a<10){
            System.out.println(a);a++;}
    }

    public static void main(String[] args) {
        numbering();
    }

*/

/*
    public static void numbering(int limit) {   // limit => 매개변수(parameter)
        int i = 0;
        while(i < limit) {
            System.out.println(i);
            i++;
        }
    }


    public static void main(String[] args) {
        numbering(5);      // 5 => 인자(argument)
    }}  */
/*
    public static void numbering(int limit){
        int a = 0;
        while(a<limit){
            System.out.println(a);a++;
        }
    }

    public static void main(String[] args){

        numbering(6);
    }
  */
/*
        public static void numbering(int init, int limit) { // init, limit => 매개변수(parameter)
            int i = init;
            while (i < limit) {
                System.out.println(i);
                i++;
            }
        }

        public static void main(String[] args) {
            numbering(1, 5);    // 1, 5 => 인자(argument)
        }
    }
*/
    /*
    public static void numbering(int init, int limit){
        int a = init;
        while(a<limit){
            System.out.println(a);a++;}
    }

    public static void main(String[] args){

        numbering(5, 10);
    }
*/
/*


        public static String numbering(int init, int limit) {   // (1) 'numbering'이 'return'할 값이 반드시 'String'이다
            int i = init;
            String output = "";
            while (i < limit) {
                output += i;
                i++;
            }
            return output;
        }

        public static void main(String[] args) {
            String result = numbering(1, 5);    // numbering이 리턴한 값이 변수 result에 담긴다
            System.out.println(result);         // (1)에 의해서 result는 String만 가능하다
        }






*/

    }

