package Riot;

public class June02 {

//02 준 시작
       // System.out.println("\"AloAloAlo Hang!\"");

    //Operator 연산자 + - * / % = > if else
     /*   int a = 5;
        int b = a+1;
        int c = a*2;
        double d = a/2;
        int e = a+10;
        int f = a%3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
 */
    //int a = 10;
      //      double b = (double)a/3;
        //System.out.println(b);

  /*      int a = 10;
        int b = 3;
        System.out.println(a/3);
double c = 10;
double d = 3;
        System.out.println(c/3);
*/

    /*    int a = 3;
        a=a+1;
        a=a*2;
        a++;
        a++;
        System.out.println(a++);
        System.out.println(a);

     */



       // for(int a=2;a<15;a=a+3){System.out.println("Coding"+a);}
        //for(int a=2;a<15;a=a+3){System.out.println("Coding"+a);a++;}


     /*   int a = 4-3*6;
        System.out.println(a);
        a=a+4;
        System.out.println(a); */

       /* System.out.println(1==2);
        System.out.println(1==1);
        System.out.println(10>=9.9);
        System.out.println(10!=9.9);
*/
     /*   String a = "JYP";
        String b = new String("JYP"
        );
        String c = new String("SM");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
*/

      /*  int age = 30;
        if(age<=10){
            System.out.println("Boy");                   <if 에는 boolean 만 올 수 있어서
        }else-if(age>10 && age<=20){                        == 정도만 오는것 같다, 비교연산자 안된다.
            System.out.println("Adolescent");
        }else-if(age>20 && age<=30){
            System.out.println("Adult");
        }else{
            System.out.println("default");
        }
*/
/*        int ag = 15;
        if(ag==10){
            System.out.println("boy");}else{
            System.out.println("not a boy");}
*/

 /*String id = args[0];
 if(id.equals("skystom2")){
     System.out.println("Right!");}else{
     System.out.println("Wrong");}
     */
/*
        String id = args[0];
        String pw = args[1];
        if(id.equals("skystom2")){if(pw.equals("1112")){
            System.out.println("Right~!");}else{
            System.out.println("wrong pw");}}else{
            System.out.println("wrong id");}

         args[0], args[1]은 run - program configuration 에서 "" 로 넣은 값들의 순서를 말하는 것.
         0은 첫번째 즉 아이디, 두번째 는 자동으로 1 비번이 되는것

            */

  /*      String id = args[0];
        String pw = args[1];
        if(id.equals("skystom2")&&pw.equals("1121")){
            System.out.println("right");}else{
            System.out.println("wrong id or pw");}

           && 이용할 경우에는, 둘중 하나가 틀렸습니다. 뭐가 틀린진 모릅니다. 이렇게 밖에 안되고
           if 중첩으로 갈 경우에는 3가지 경우 수가 나와서0
           성공 ; 아이디 틀림; 비번 틀림; 으로 만들 수 있다.
   */

/*
        int b = 53;
                if(b==55 || b==54){
                    System.out.println("Right!");}else{
                    System.out.println("Wrong!");}
*/
/*
        String id = args[0];
        String id2 = args[1];
        String pw = args[2];
        if((id.equals("skystom2")||id2.equals("skystom3"))&&pw.equals("1111")){     <<or 하고 and 같이쓸때,
                                                                             or로 묶은부분 크게 ()로 감싸줘야함
                                                                             //안감싸줘도 되네,
            System.out.println("log in success");}else{
            System.out.println("Fail to log in. sorry.");}
*/

      /*  for(int a = 0; a<100; a=a+1){
            System.out.println("coding everybody"+a);}

*/
 /*       String id = args[0];
        String id2 = args[1];
        String pw = args[2];
        if(id.equals("skystom2")||id2.equals("skystom3")&&pw.equals("1111")){
            System.out.println("log in success");}else{
            System.out.println("Fail to log in. sorry.");}

*/


      /*  int max = 10;
        int a = 0;
        while(a<max){
            System.out.println("alo");a++;}
*/

        //for(int a=0;a<10;a++){if(a==5){break;}
          //  System.out.println("Hello"+a);}
/*
int a = 0;
while(a<10){if(a==4){break;}
    System.out.println("Hello"+a);a++;}
  */
/*
  for(int a=0;a<10;a++){if(a==5){continue;}
      System.out.println("alo"+a);}
*/

    /*    for(int a =0;a<10;a++){for(int b=0;b<10;b++){
            System.out.println(a+""+b);}}
*/

/*for(int a=0; a<10; a++){for(int b=10;b<30;b=b+2){
    System.out.println(a+""+b);}}
*/
        /*
        String[] classGroup = {"최", "김", "이", "신"};
        System.out.println(classGroup[3]);
        System.out.println(classGroup.length);
        */

/*
        String[] classGroup = new String[3];
        classGroup[0]="A";
        classGroup[1]="B";
        classGroup[2]="C";
        System.out.println(classGroup[1]);
        System.out.println(classGroup.length);
*/
       // String[] bros = {"1","2","3","4"};
        //System.out.println(bros[1]);


    /*    String[] students = {"cho","park","lui","hwang"};
        for(int a=0;a<students.length;a++){String comein = students[a];
            System.out.println(comein + "들어오세요.");}
*/
/*
        String[] mem={"a","b","c"};
        for(String i:mem){
            System.out.println(i+"는 상담완료");
        }
*/

 /*       public static void numbering(){
            int a=0;
            while(a<5){
                System.out.println(a);a++;}}

        public static void main(String[]=args){
            numbering();}
            //왜 안되지
*/


    public static void numbering(){
        int a = 0;
        while(a<5){
            System.out.println(a);a++;}
    }

    public static void main(String[] args) {
        numbering();
        numbering();
    }



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
