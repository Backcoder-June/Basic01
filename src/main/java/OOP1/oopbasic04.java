package OOP1;

//Object 클래스의 method 들

//1. toString - 객체,class 를 String 으로 표현
// overriding 해서 기능 추가해서 사용하길 권장
/*
class calculator{
    int a, b;
    public String toString(){                                 //이미 들어있는거라 따로 정의 안해도 써지지만
        return super.toString() + "\na :" + this.a + ", b :" + this.b;   //이렇게 overriding 하면서 기능을 추가해서 사용가능
    }
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

public class oopbasic04 {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.set(10,20);
        c1.sum();
        c1.avg();
        System.out.println(c1.toString());          // (c1) 으로만 해도 .toString 암시적으로 줘서 작동함

    }
}
*/
// 2. equals -> String / 객체(instance) 가 같은 것인지 비교 ( hashCode() 와 같이 사용한다 )
// equals 는 overriding 하지 않고, 원래의 기능으로만 사용하길 권장
/*
class student{
    String name;
    public student(String name){
        this.name = name;}

    public boolean equals(Object obj){       // equals 를 overriding 해서 '객체' 자체가 아닌, 객체의 '결과값'을 비교하게 만들기
        student a = (student) obj;           // super 가 sub 으로 행세하기 위해서 강제 형변환 필요 (sub 은 super 행세 가능)
        return this.name == a.name;       //this.name 이 (a equals.(b)) 에서 a 이고, a.name 이 b
    }
    }
public class oopbasic04 {
    public static void main(String[] args) {
        student s1 = new student("June");
        student s2 = new student("June");
        System.out.println(s1 == s2);          //객체 자체를 비교
        System.out.println(s1.equals(s2));     // overriding 되서 객체의 결과값인 "June" 을 비교


    }
}
*/

// clone -> 어떤 instance 객체를 똑같이 복제 해주는 기능
/*
class student implements Cloneable{            //Cloneable 이라는 interface 를 implements 해서
                                               // 그 class 가 clone 이 가능한 class 임을 알려주는 구분자 역할 필요
String name;
student(String name){
    this.name = name;}                 // 생성자 instructor

public Object clone() throws CloneNotSupportedException {        // Object class 인 clone 은 Object.lang 패키지에 있다.
return super.clone();}}                                          // clone 은 protected 접근제어자로만 쓸 수 있다.
                                                                 // 그러므로 Object clone 을 같은 패키지로 호출한다
                                                                 // 그와중에 checkedException 이므로 오류처리 필수다

public class oopbasic04{
    public static void main(String[] args) {
        student s1 = new student("June");
        try {
            student s2 = (student) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
*/

// 3. enum ->(enumeration/열거형) 서로 연관된 "상수"들의 집합

// Interface 로 switch 문 예쁘게 만들어보기
/*
interface Fruit{
    int Apple=1, Banana=2, Carrot=3; }
interface Company{
    int Apple=1, Naver=2, Carrot=3; }

public class oopbasic04 {
    public static void main(String[] args) {
        int type = Company.Carrot;
        switch (type){
            case 1 :
                System.out.println("아이폰");
            case 2 :
                System.out.println("네이버블로그");
            case 3 :
                System.out.println("당근이세요?");

                if(Fruit.Carrot == Company.Carrot){
                    System.out.println("이게 같으면 안되는 거거든. 문제가 될 수있어");
                }
        }       //가독성 좋게는 나오지만, interface 들 간에 구분을 해주지 못한다. (class 는 이거 구분가능)
    }
}
*/
/*             //class 로 switch 문 이쁘게 만들어보기
class Fruit{
    public static final Fruit Apple = new Fruit();
    public static final Fruit Carrot = new Fruit();       // public static final == "상수"
    public static final Fruit Banana = new Fruit(); }    // class 정의 없이 단순 instance 만든 것.

class Company{
    public static final Company Carrot = new Company();
    public static final Company Apple = new Company();
    public static final Company Naver = new Company();}

public class oopbasic04 {
    public static void main(String[] args) {
        Fruit type = Fruit.Apple;
        switch (type) {                       // switch 문에 올수있는 변수 값은 숫자, String, enum / 객체는 못온다!
            case Fruit.Apple:                       //class 로 구분했을 때 한계. if문 가능
                System.out.println("사과하세요");
            case Fruit.Banana:
                System.out.println("반하나안반하나");
            case Fruit.Carrot:
                System.out.println("바니바니당근당근");   }
    }
}               //나름 class 간 구분도 되고, 이쁘다. 단점은 switch 문 제한에 걸릴 수 도 있다.
*/

// enum 을 써보자
/*
class Company{
    public static final Company Carrot = new Company();
    public static final Company Apple = new Company();
    public static final Company Naver = new Company();}
    //위의 1."상수선언" + 2."instance 화" 를 자동으로 시켜주는게 enum 이다.
*/
/*
enum Company{Carrot, Apple, Naver}       // 놀랍게도 이게 위랑 같다.
enum Fruit{Carrot, Apple, Banana}

public class oopbasic04 {
    public static void main(String[] args) {
        Company type = Company.Apple;        //약속이다. 익숙해져라


        switch (type){
            case Carrot:
                System.out.println("당근이세요?");break;
            case Apple:
                System.out.println("아이퐁");break;
            case Naver:
                System.out.println("네이버 까페");break;
        }

       // if(Fruit.Carrot==Company.Carrot)      << enum 객체도 class 이기 때문에 이건 compile 조차 안된다. 즉 구분 해줌.

    }
}
 */
  // enum 으로 if 문 만들어보자
/*
enum Tree {Frontend, Backend, Devops, Deeplaerning }
enum Company {Naver, Daum, Coopang}

public class oopbasic04 {
    public static void main(String[] args) {
        Tree type = Tree.Deeplaerning;
        if(type == Tree.Backend){
            System.out.println("Backend - " + Company.Naver);
        } else if(type == Tree.Frontend) {
            System.out.println("Frontend - " + Company.Daum);}
            else if(type == Tree.Devops){
                System.out.println("Devops - " + Company.Coopang);}
            else{System.out.println("Nothing");
            }

        }
    }
*/

 // enum 도 class 처럼 Field(변수), method, 생성자 를 취할수 있다.
 // 또한, 마치 배열처럼 for each 를 통해 값을 하나하나 꺼낼 수 있다. ( .values() 이용 )
/*
enum Fruit {
    Apple("red"), Banana("yellow"), Carrot("orange");

   private String color;               // 변수 밑 작업
   public String bringcolor(){        // method 정의
        return this.color;
   }
    Fruit(String color){                            // enum 인 Fruit 의 parameter 에 변수 color 를 생성자로 준다.
        System.out.println("Constructor " + this);  // 이건 그냥 enum 이 class 정의할 때, instance 를 생성하기 때문에,
        this.color = color;                         //  Fruit Apple = new Fruit(); < 이때 이 생성자가 적용된다는걸 보여주는용.

    }
    }
    public class oopbasic04 {
        public static void main(String[] args) {
            for (Fruit F : Fruit.values()           // enum 은 마치 배열 처럼 for each 를 통해 하나하나 꺼낼수도 있다.
            ) {                                     // 이때 .values() 사용 ㅡ Fruit class 안의 instance, data 들 지칭
                System.out.println(F);

            }

            Fruit type = Fruit.Apple;
            switch (type){
                case Apple:                                        //class 의 instance 에 메소드 불러오기
                    System.out.println("Apple : 57kcal, Color : " + type.bringcolor()); break;  // type 으로도 불러올수있다
                case Banana:
                    System.out.println("Banana : 99kcal, Color : " + Fruit.Banana.bringcolor()); break;
                case Carrot:
                    System.out.println("Carrot : 22kcal, Color : " + Fruit.Carrot.bringcolor()); break;
            }
        }
}
*/

// Reference 참조형 data type  VS  기본형 data type (복제)
/*
class A{
    public int ID;
    A(int ID){
        this.ID = ID;}

}


public  class oopbasic04 {


    public static void runvalue(){                 //기본형 data type
        int a = 1;
        int b = a;                 // a=1 을 복제. b 값으로 줌. -> 원본 a=1 의 값을 그대로 유지함
        b = 2 ;                    // 원본 값을 유지하므로, 여기에 무슨 값을 주든 그대로 유지 됨
        System.out.println(a);}
    public static void runrefer(){          // new -> instance 생성 -> A 라는 data type = 참조형 data type
        A a = new A(1);                 //a.ID => 1 을 참조하는 중
        A b = a;                           // b.ID => 1 을 참조하는 중
        b.ID = 2;                          // 근데 이후에 b.ID => 2를 참조하라고 명시적으로 수정 => 바뀜 O
    // A b = new A(2);                     // 하지만, 이렇게 새로운 instance 를 생성하면서 b.ID =>2 참조 시킬때는
                                           // a 와 b 가 각자 새로운 instance 를 참조하게 되므로 영향을 못미침
        System.out.println(a.ID);}

    public static void main(String[] args) {
        runrefer();
        runvalue();
    }
}
 */

// 메소드 에 대해서도 마찬가지다
/*
class A{
    int ID;
    A(int ID){
        this.ID = ID;
    }
}

public class oopbasic04 {
    public static void Basictype(int b){
        b = 2 ;}
    public static void runBasictype(){
        int a = 1;
        Basictype(a);               // 기본 dataType - a=1 복제 b=a=1 원본값 유지
        System.out.println(a);}

    public static void refertype(A b){
        b = new A(2);}
    public static void runrefertype(){
        A a = new A(1);             // a.ID => 1 참조중.
        refertype(a);                   // a.ID => 2로 참조했으나 새로운 instance 에서 각자 한거라 영향 X
        System.out.println(a.ID);}

    public static void refer2(A b){
        b.ID = 2;}
    public static void runrefer2(){
        A a = new A(1);             // a.ID => 1 참조중
        refer2(a);                      // a.ID => 2 참조중 (같은 instance - 수정 들어감)
        System.out.println(a.ID);
    }

    public static void main(String[] args) {
        runBasictype();
        runrefertype();
        runrefer2();
    }
}
*/

// Generic -> class 내부에서 사용할 data type 을 나중에 instance 를 생성할 때, 확정 하는 것
// 1. instance 별로 필요한 data type 으로 바꾸어 class 를 사용할 수 있게 함으로서 코드 중복 방지
// 2. Type safety - 용도와 맞지않는 data type 이 들어가지 않도록 안전보장
// generic 은 reference 참조형 date type 만 가능 (기본형 X) -> wrapper class 이용
/*
class studentinfo{
    public int grade;
    studentinfo(int grade){this.grade = grade;}
}

class person<T, S>{                        //generic 여러개 , 로 가능
    public T info;
    public S id;
    person(T info, S id){
        this.info = info;
        this.id = id;
    }
    public <U> void printinfo(U info){         //method 도 generic 사용 가능
        System.out.println("info");         // 접근제어자 <generic> return type 순서
    }
}

public class oopbasic04 {
    public static void main(String[] args) {
        studentinfo s1 = new studentinfo(1); // 이거 안만들고 s1 자리에 new studentinfo(1) 바로줘도 된다.
        Integer id = new Integer(2);        //Integer - wrapper class (그냥 바로 2 로 줘도 된다.)
                                           //(generic 은 기본생성자 못오므로 wrapper class 이용)
        person<studentinfo, Integer> p1 = new person<studentinfo, Integer>(s1, id);
        person p2 = new person(s1, id);  // s1 과 id 를 정의하면서, 거기서 data type 을 사실상 알려준 것이기 때문에
                        //generic 의 생략  => 인자값으로 s1, id 를 넣으면 generic 을 명시하지 않아도 java 가 자동으로 인식한다.
        System.out.println(p1.info.grade);
        System.out.println(p1.id.intValue());      //intValue() <- 기본 data type 으로 가져오는 method
        p1.<studentinfo>printinfo(s1);           // method 출력. generic 생략 가능
    }
}
*/

// generic 의 제한 - 내가 원하는 class 의 자식들만 data type 으로 올 수 있도록 => "extends"
/*
abstract class superinfo{                    //abstract 말고도 가능, interface 도 가능 => implements
    public abstract int getlevel();}
class studentinfo extends superinfo{
    public int rank;
    studentinfo(int rank){
        this.rank = rank;}

    @Override
    public int getlevel() {                    //abstract 구체화
        return this.rank;}
}

class person<T extends superinfo>{            // generic 의 extends - 구별 (generic 은 interface 여도 extends 로 한다)
    public T info;                             // 그 자식 class 들 까지만 data type 으로 "제한"
    person(T info){                             // 외에 다른 data type 못온다
        this.info = info;

        info.getlevel();          // T 가 studentinfo 까지 extends 하고 있으므로 student info 의 메소드인 getlevel 호출가능
    }

}

public class oopbasic04 {
    public static void main(String[] args) {
        studentinfo s1 = new studentinfo(2);     // 이거 정의안하고 생성자있으니까 바로 인자값 넣어서 가능

        person<studentinfo> p1 = new person<studentinfo>(new studentinfo(2));
        person p2 = new person(s1);     //생략 가능
        // person<String> p3 = new person<String>("문자열");     // String 은 superinfo 의 자식이 아니다 - error
        System.out.println(p1.info.rank);
        System.out.println(p1.info.getlevel());        //method 값 가져오기

    }
}
*/

