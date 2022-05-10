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
/*    //객체 지향 - calculator 객체 생성
    class calculator{                              //클래스 생성
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
            calculator c1 = new calculator();                   // instance 생성
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
        public static void main(String[] args) {               //평범한 main 시작
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
        static int a = 1;          //class variable
        int b = 2;                 //instance variable



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
              //c1.static_instance();                    // class method -> instance 변수 (x) 생성 안됨
                c1.instance_static();
                c1.instance_instance();

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
         //주의! 하지만 전역변수를 쓰는건 상당히 위험하다.
         //특히 method 에서는 전역변수가 적용되게 하는건 매우 바람직하지 못함 (위험성, 재활용성, 분리하기 쉽게끔 해야해)
         //method 는 parameter, arguments 인자값으로 작동하게 하는걸 거의 원칙으로 하자

*/
           //static scope(lexical scope)
/*      public class oopbasic01{
          static int i = 5;
          static void a(){
              int i = 10;
              b();                                //메소드 안에 메소드 넣어서 연쇄적으로 실행
          }
          static void b(){
              //int i = 30;                       // 지역변수>전역변수 (우선순위가 더 높다)
              System.out.println(i);              // 정적 유효범위 (static scope)
          }                                       // 1.자기 자신범위(30) 2.전역변수(5)

        public static void main(String[] args) {
            a();
        }
    }
*/

       // this. -> instance 자신, 객체의 전역을 의미
/*
         class scope{
             int a = 10;
         void m(){
             int a = 20;                                  //기본 전역 가져다 씀, 예외 줄때 지역 따로줘서 쓰는 방식
             System.out.println(a);
             System.out.println(this.a);                  //지역 가져다 쓰는 메소드에서, 특정부분은 전역을 쓰고자 할때
         }                                                // this. 으로 전역꺼 가져다 쓸 수 있음
         }
         public class oopbasic01{
             public static void main(String[] args) {
                 scope c1 = new scope();
                 c1.m();
             }                                        //java 에서 this. 안붙여도 지역에 없는 변수값은 자동으로
         }                                             //전역으로 가서 찾아서 씀.
*/

//         생성자 Constructor
/*
     class calculator{
         int a, b;
         public calculator(int c, int d){                          // 생성자 (class 와 같은 이름. instance 를 생성)
             this.a = c;
             this.b = d;
         }
         public void sum(){
             System.out.println(this.a + this.b);
         }
         public void multi(){
             System.out.println(this.a*this.b);
         }
     }
     public class oopbasic01{
         public static void main(String[] args) {
             calculator c1 = new calculator(10, 20);
             c1.sum();                                 //(class)calculator c1 = new (constructor)calculator(a,b);
             c1.multi();

             calculator c2 = new calculator(20, 40);
             c2.sum();
             c2.multi();
         }
     }
*/
       // 상속
 //calculator 라는 상위 클래스를 subtract method 를 추가한 하위 클래스가 "상속"한다.

/*
class calculator{
    int a, b;

    public void set(int c, int d){
        this.a = c;
        this.b = d;
    }
    public void sum(){
        System.out.println(this.a + this.b);
    }
    public void multi(){
        System.out.println(this.a*this.b);
    }
}

//하위 class 추가
class upgraded_calculator extends calculator{
    public void subtract(){
        System.out.println(this.a - this.b);
    }

}
public class oopbasic01{
    public static void main(String[] args) {
        upgraded_calculator c1 = new upgraded_calculator();
        c1.set(10,20);
        c1.sum();
        c1.multi();
        c1.subtract();

        upgraded_calculator c2 = new upgraded_calculator();
        c2.set(20,40);
        c2.sum();
        c2.multi();
        c2.subtract();
    }
}
*/                                  //상속자 있는 상위 class 에 extend 할때 오류났다. 보충 필요
/*
// 상속 두번 해보자.
class calculator{
    int a, b;

    public void set(int c, int d){
        this.a = c;
        this.b = d;
    }
    public void sum(){
        System.out.println(this.a + this.b);
    }
    public void multi(){
        System.out.println(this.a*this.b);
    }
}

//하위 class 추가
class upgraded_calculator extends calculator{
    public void subtract(){
        System.out.println(this.a - this.b);
    }

}
//하위 class 하나 더 추가 -> 하위 class를 상속하는 더 하위 class
class calculator2 extends upgraded_calculator{
    public void avg(){
        System.out.println((this.a+this.b)/2);
    }


}
public class oopbasic01{
    public static void main(String[] args) {
        calculator2 c1 = new calculator2();
        c1.set(10,20);
        c1.sum();
        c1.multi();
        c1.subtract();
        c1.avg();

        calculator2 c2 = new calculator2();
        c2.set(20,40);
        c2.sum();
        c2.multi();
        c2.subtract();
        c2.avg();
    }
}
*/
/*     //public class 자체를 main 에서 스스로 instance 로 만드는 것 가능
      public class oopbasic01{
          public static void main(String[] args) {
              oopbasic01 c1 = new oopbasic01();
          }
     }
*/
/*            //생성자가 있을 때
      public class oopbasic01{
          public oopbasic01(){}
          public oopbasic01(int a){}          //기본 생성자가 아님. parameter 갖는 생성자.
                                              // 인자값을 줘야 하는 생성자. -> 밑에서는 인자값이 없으므로 error
                                              // 그러므로 명시적으로 기본생성자(parameter 없는)를 선언해주면
                                              // instance 는 거기로 들어가며 정의됨.
                                              // 밑에서 인자값을 주면 int a 라는 parameter 로 들어가며 정의됨.
    public static void main(String[] args) {
        oopbasic01 c1 = new oopbasic01();
    }
}

*/
        //생성자 있을때 상속
/*
class calculator{
                                 //super class 에 생성자 만들면 -> 상속할때 ERROR 발생
                                          // "기본생성자" 가 없기 때문. 명시적으로 선언해주면 된다.
    int a, b;
    public void sum(){
        System.out.println(this.a + this.b);
    }
    public void multi(){
        System.out.println(this.a*this.b);
    }
}
class calculator2 extends calculator{
    public calculator2(int left, int right){         //sub class 에서 생성자만들어야 함
        this.a = left;                               //instance 정의할때도 sub class 로 정의하잖아
        this.b = right;
    }
    public void subtract(){
        System.out.println(this.a - this.b);
    }
}
public class oopbasic01{
    public static void main(String[] args) {
        calculator2 c1 = new calculator2(10, 20);
        c1.sum();
        c1.multi();
        c1.subtract();

        calculator2 c2 = new calculator2(20, 40);
        c2.sum();
        c2.multi();
        c2.subtract();
    }
}
*/
       //super(int a, int b); < 로 super class 생성자 땡겨쓰기
/*
class calculator{
int a, b;
public calculator(int c, int d){
    this.a = c;
    this.b = d;
}
public void sum(){
        System.out.println(this.a + this.b);
        }
public void multi(){
        System.out.println(this.a*this.b);
        }
        }
class calculator2 extends calculator{
    public calculator2(int i, int f){
        super(i, f);
    }
    public void subtract(){
        System.out.println(this.a - this.b);
    }
}
public class oopbasic01{
    public static void main(String[] args) {
        calculator2 c1 = new calculator2(10, 20);
        c1.sum();
        c1.multi();
        c1.subtract();

        calculator2 c2 = new calculator2(20, 40);
        c2.sum();
        c2.multi();
        c2.subtract();
    }
}
*/

// 생성자 - 상속 결론
// 1. super class 에서 생성자 만들고, sub class 에서 super 로 땡겨쓰거나,
// 2. super class 에서는 기본생성자만 주고(안만들고), sub class 에서 생성자 만들어 쓰기

       // overriding - 생성자 있건없건 된다.
/*
class calculator{
    int a, b;
    public calculator(int c, int d){
        this.a = c;
        this.b = d;
    }
    public void sum(){
        System.out.println(this.a + this.b);
    }
    public void multi(){
        System.out.println(this.a*this.b);
    }
}
class calculator2 extends calculator{
    public calculator2(int i, int f){
        super(i, f);
    }
    public void sum(){                                              // overriding
        System.out.println("결과는"+ (this.a + this.b) + "입니다.");

    }
    public void subtract(){
        System.out.println(this.a - this.b);
    }
}
public class oopbasic01{
    public static void main(String[] args) {
        calculator2 c1 = new calculator2(10, 20);
        c1.sum();
        c1.multi();
        c1.subtract();

        calculator2 c2 = new calculator2(20, 40);
        c2.sum();
        c2.multi();
        c2.subtract();
    }
}
*/
         //print 로 된걸 return 으로 overriding 하고 싶을때는 그냥 둘다 return 으로 해야한다.
         // 한쪽만 print 로 하면 error 난다.
         // 그럼 사실상 그냥 super 에만 method 선언하고 그대로 상속 하면 되겠지만,
         // 굳이 sub 에서 overriding 을 하자면, super.method 이용해서 중복 없애주면 된다.
/*
          class calculator{
           int a, b;
           public calculator(int c, int d){
               this.a = c;
               this.b = d;
           }
           public int sum(){
               return (this.a + this.b);

           }
           public void multi(){
               System.out.println(this.a*this.b);
           }
       }
class calculator2 extends calculator{
    public calculator2(int i, int f){
        super(i, f);
    }
    public int sum(){
        return (super.sum());
    }

    public void subtract(){
        System.out.println(this.a - this.b);
    }
}
public class oopbasic01{
    public static void main(String[] args) {
        calculator2 c1 = new calculator2(10, 20);
        c1.sum();
        c1.multi();
        c1.subtract();

        calculator2 c2 = new calculator2(20, 40);
        c2.sum();
        c2.multi();
        c2.subtract();
    }
}
*/
/*
    class cal{
        int a, b;
        int c = 0;              // sum 에서는 this.c 더해야하므로 a,b만 있을 때 c 값을 전역변수에서 0 으로 선언해둔다.
                                // 그냥 int c; 로만 해도 null 로 봐서 빼고 결과값이 나오긴 한다.
    public void set(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void set(int a, int b, int c){
        this.a = a;                                 //여기 두줄 중복
        this.b = b;                                 //this.set(a,b); 로 교환 가능
        this.c = c;                                 //교환 해놔야 위에거에 종속되서 수정용이해짐
    }

    public void sum(){
        System.out.println(this.a+this.b+this.c);
    }
    }
    public class oopbasic01{
        public static void main(String[] args) {
            cal c1 = new cal();
            c1.set(10, 20);
            c1.sum();

            c1.set(10, 20, 30);
            c1.sum();
        }
    }
*/



