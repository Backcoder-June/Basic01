package OOP1;

    //method 사용해서 중복의 제거
/*    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args){
        sum(10,20);
        sum(20, 40);
    }
*/
/*

    //method 두개 쓰기
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void avg(int a, int b){
        System.out.println((a+b)/2);
    }

    public static void main(String[] args) {
        int a, b;                                     // main 에는 method 의 a,b가 정의가 안되있으니까

        a = 10;
        b = 20;
        sum(a, b);                                // 이게 method 가 두개가아니라 10개라고 생각해보자
        avg(a, b);                                // 이렇게 해야 a,b 변수 값만 고침으로서 전체에 적용된다.

                                                  // 이 변수와 이 로직은 연관되어있다.
        a = 20;
        b = 40;
        sum(a, b);
        avg(a, b);

    }

    //연관된 logic 들이 반복되서 나온다.
    //여기서 a,b 같은 "변수(data)"와 sum,avg 같은 "method" 들을 Grouping 해보자 => Object-Oriented Programming
*/
/*
    class calculator{
        int a, b;
        public void set(int a, int b){
            this.a = a;
            this.b = b;
        }

    public void sum(){
        System.out.println(this.a + this.b);
    }
    public void avg(){
        System.out.println((this.a+this.b)/2);
    }
    }

    public class oopbasic01 {
        public static void main(String[] args) {
            calculator c1 = new calculator();
            c1.set(10,20);
            c1.sum();
            c1.avg();

            calculator c2 = new calculator();
            c2.set(20,40);
            c2.sum();
            c2.avg();



        }
    }
*/
/*
     class caca{
         int c, d;


         public void set(int a, int b){
             this.c = a;
             this.d = b;

         }
         public void sum(){
             System.out.println(this.c+this.d);
         }
         public void doub(){
             System.out.println(this.c*this.d);
         }
    }
     //-------------------------------------------- class 설계도 ---------3개의 method 를 정의함 ------------
    public class oopbasic01{
        public static void main(String[] args) {               //평범한 class 시작
            caca c1 = new caca();                              //위에서 만든 객체 caca 사용하겠다
            c1.set(10,50);                                     //c1 <= 객체 caca 의 구체적 모습 = instance
            c1.sum();                                          //거기다가 위에서 정의했던 method 들 사용하겠다
            c1.doub();
        }
    }
         //class member 와 instance member 의 관계
*/
/*
        class calculator {
        static int a = 1;
        int b = 2;



        static void static_static(){
            System.out.println(a);
        }
        //  static void static_instance(){
        //    System.out.println(b);}

        void instance_static(){
            System.out.println(a);
        }
        void instance_instance(){
            System.out.println(b);
        }
        }

        public class oopbasic01{
            public static void main(String[] args) {

                calculator c1 = new calculator();
                c1.static_static();
                c1.instance_static();
                c1.instance_instance();                   // class method -> instance 변수 (x) 생성 안됨

                calculator.static_static();               //class 로 직접접근 -> instance 는 아직 생성이 안됬으므로
                                                          // class - class 만 가능


            }
        }
*/
/*
       public class oopbasic01 {
        static void scope() {
            int a = 0;
        }

        public static void main(String[] args) {
            for (int a = 1; a<6; a++){
                scope(); System.out.println(a);}     //method 안에 변수 a를 0으로 주고있어서
        }                                            //옛날에는 for 문의 a와 충돌이 일어나고 실제로 00000도출
                                                     //하지만 이젠 scope 개념이 생겨서
                                                     //method 안에서 선언된 변수 a 는 그 method 안에서만 유효함
    }                                                // for 문의 변수 a 에 영향 못미침
*/
          // 전역변수 global variables 가 영향을 미치는 경우
/*
     public class oopbasic01{
         static int i;               // class 영역(전역)에 int i를 선언함
         static void a(){
             i = 0;                  // 메소드에서 i 선언X 할당만
         }

         public static void main(String[] args) {
             for (i = 0; i<5 ; i++){                        // for 문에서 i 선언X 할당만
                 a(); System.out.println(i);
             }
         }
     }

*/
 /*      public class oopbasic01{
           static void a(){
               String title = "Coding every body";     //변수 title 선언했어도, method 안에서만 유효
           }

        public static void main(String[] args) {
            a();
            System.out.println(title);                 // main 안에 title 은 없으므로 error
        }
           }

  */
           //그럼 global variables 이용하고, 선언X 할당만 함으로서 class 의 변수가 main 에서 유효하게 만들어보자
/*         public class oopbasic01{
             static String title;
             static void a(){
                 title = "Coding Everybody";
             }

        public static void main(String[] args) {a();
            System.out.println(title);
        }
         }                                                       //성공
*/
/*      public class oopbasic01{
          static int i = 5;
          static void a(){
              int i = 10;
              b();
          }
          static void b(){
              //int i = 30;
              System.out.println(i);              // 정적 유효범위 (static scope)
          }                                       // 1.자기 자신범위(30) 2.전역변수(5)

        public static void main(String[] args) {
            a();
        }
    }
*/













//

