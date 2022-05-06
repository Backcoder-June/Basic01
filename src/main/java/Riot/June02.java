package Riot;

public class June02 {
    public static void main(String[] args) {


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
        /*
        int a = 10;
        double b = (double) a / 3;
        System.out.println(b);
*/ /*
        double a = 10;
        int b = 3;
        System.out.println(a/b);
*/
        /*
        int a = 3;
        a=a+1;
        a=a*2;
        a++;
        a++;
        System.out.println(a++);
        System.out.println(a);

     */


        //for(int a=2;a<15;a=a+3){System.out.println("Coding"+a);}
        //for(int a=2;a<15;a=a+3){System.out.println("Coding"+a);a++;}     << a++중복으로도 활용 가능


    /*  int a = 4-3*6;
        System.out.println(a);
        a=a+4;
        System.out.println(a);
*/

  /*       // Boolean
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println(10>=9.9);
        System.out.println(10!=9.9);
*/
/*      //new - original 개념                   <<보충필요
        //String 일때는 .equals() < Boolean
        String a = "JYP";
        String b = new String("JYP");
        String c = new String("SM");
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
*/
 /*
      // 조건문 활용 나이대별로 명칭주기
      // init<x<limit 이런식으로 안되고, init<x && x<limit  &&로 해야함
      //else-if 칠때 하이폰 빼고치면 else 따로 if 따로 인식해버리기도 함. 주의
        int age = 32;
        if(age < 10){
            System.out.println("Boy");}
        else if (10 <= age && age < 20) {
            System.out.println("Adolescent");}
        else if (20 <= age && age<30){
            System.out.println("Adult");}
        else {
            System.out.println("GGONDAE");}
*/


    // ID PW 로그인
    //configuration 에 args 인자값 미리 넣어두기 -> 각 class별 config -> program arguments 에 "A" "B" 나열식.
    //배열로 -> 0,1,2 ... 인자값 구분 (다른방법은 없나?)
/*
     String id = args[0];
     if(id.equals("skystom2")){
     System.out.println("Right!");}else{
     System.out.println("Wrong");}
*/
/*     //if 조건문 중복
       //if 중복을 활용하면 3가지 결과값을 나타낼수 있어서 id가 틀렸는지, 비밀번호가 틀렸는지 구분 가능.
        String id = args[0];
        String pw = args[2];
        if(id.equals("skystom3")){if(pw.equals("1111")){
            System.out.println("Login Success");}else{
            System.out.println("wrong pw");}}else{
            System.out.println("wrong id");}
*/

/*      //if 조건문 에 && 활용
        String id = args[0];
        String pw = args[2];
        if(id.equals("skystom2")&&pw.equals("1121")){
            System.out.println("Login Success");}else{
            System.out.println("wrong id or pw");}
*/
/*

           && 이용할 경우에는, 둘중 하나가 틀렸습니다. 뭐가 틀린진 모릅니다. 이렇게 밖에 안되고
           if 중첩으로 갈 경우에는 3가지 경우 수가 나와서0
           성공 ; 아이디 틀림; 비번 틀림; 으로 만들 수 있다.
   */

/*     || 활용
        int b = 53;
                if(b==55 || b==54){
                    System.out.println("Right!");}else{
                    System.out.println("Wrong!");}
*/
/*
      //중2병 아닌 나이대
        int age = 15;
        if(age<12 || age>20){
            System.out.println("Not 중2병");}
        else{
            System.out.println("중2병");}
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


 /*     //id 여러개 인정 -> || 활용
        //인자값 배열 순서로 여러개 맞춰서 입력해둔다.
        String id = args[0];
        String id2 = args[1];
        String pw = args[2];
        if(id.equals("skystom2")||id2.equals("skystom3")&&pw.equals("1111")){
            System.out.println("log in success");}else{
            System.out.println("Failed to log in. sorry.");}
*/
        // String id = args[0] or args[1] << 이렇게는 못하나?  보충 필요
        // ! String id = args[0] || args[1] ; < 인식못함
        // ! String id = args[0 || 1]; < 안됨
        //String id = args[0];
        //String id = args[1]; 이것도 안됨 (변수값 이미 상수로 지정된거)


        /*  int max = 10;                         < 이걸 이제 method 로
        int a = 0;
        while(a<max){
            System.out.println("alo");a++;}
*/
          //{break;}  for, while 의 조건과 별개로 break 조건 걸기
        // 기본적으로 이러이러한 반복문을 만들고,
        // 근데! if 만약 이런 상황이 발생하면 멈춰!  < 활용도 좋을 듯

/*        for(int a=0;a<10;a++){if(a==5){break;}
          System.out.println("Hello"+a);}


        for(int a=0;a<20;a=a+2){if (a==10){break;}
            System.out.println("Hello"+a);
        }
/*
/*
        int a = 0;
        while(a<10){if(a==4){break;}
        System.out.println("Hello"+a);a++;}
  */
/*

     //{continue;}  <- break 처럼 그 값일 때는 작동 멈춤 / 그 값 지나가면 다시 원래대로 작동함.
      for(int a=0;a<20;a++){if(a==5){continue;}
      System.out.println("alo"+a);}
*/
         //반복문의 중첩  <= 시침과 분침같다.
    /*    for(int a=0;a<10;a++){for(int b=0;b<10;b++){
            System.out.println(a+""+b);}}              <- 덧셈 안되고 String 처럼 나열로 보고싶을때.
                                                          중간에 "" 추가해주는방법
  /*
        //아니면 String c = Integer.toString(a); < "I" 대문자
      for(int a=0;a<10;a++){for(int b=0;b<2;b++){String c = Integer.toString(a); String d = Integer.toString(b);
             System.out.println(c+d);}}
*/
   //배열 Array
        //{ } 로 한번에 묶기
/*        String[] classGroup = {"최", "김", "이", "신"};
        System.out.println(classGroup[3]);
        System.out.println(classGroup.length);

        String[] array = {"June", "Tome", "Nami", "Loopy"};
        System.out.println(array[2]);
        System.out.println(array.length);
/*


/*      //하나하나 지정해주기                       <- 중간에 하나를 수정해야할 때, 몇번 째 index 인지 찾기 쉬울 듯
        String[] classGroup = new String[3];          // 3 <- length, 즉 총 elements 의 개수
        classGroup[0]="A";
        classGroup[1]="B";
        classGroup[2]="C";
        System.out.println(classGroup[1]);
        System.out.println(classGroup.length);
*/
/*
        String[] alo = new String[4];
        alo[0] = "June";
        alo[1] = "Tom";
        alo[2] = "Nami";
        alo[3] = "Loopy";
        System.out.println(alo[3]);
        System.out.println(alo.length);
*/

         //반복문에 배열
    /*    String[] students = {"cho","park","lui","hwang"};
        for(int a=0;a<students.length;a++){String comein = students[a];
            System.out.println(comein + "들어오세요.");}
*/
/*      String[] applicants = {"A","B","C","D"};
        for(int many = 0;many<applicants.length;many++){                    //  <<String 따로 안주고 바로도 가능
            System.out.println(applicants[many]+"차례입니다.");}              // 배열이 여러집단 일때는
                                                                            // String따로 주는게 구별이 쉽겠네
*/

        // 반복문 + 배열 <- foreach 로 간단히!
/*
        String[] mem={"a","b","c"};
        for(String i:mem){
            System.out.println(i+"는 상담완료");
        }
*/
/*        String[] Auto = {"A", "B", "C", "D"};
        for(String x:Auto){
            System.out.println(x+"completed");}
*/

        //-------------METHOD--------------------->Riot2.Kanu01


    }
}