package OOP1;

//접근제어자 - public / private
/*
class A{
    public String x(){
        return "x";
    }
    private String y(){
        return "y";
    }
    public String z(){
        return y();
    }
}
public class oopbasic02 {
    public static void main(String[] args) {
        A rt = new A();
        System.out.println(rt.x());
        //System.out.println(rt.y());                 // private method 는 해당 class 내에서만 사용가능
        System.out.println(rt.z());                   // public 은 다 가능. public z 메소드를 이용해서 y값을
                                                      // 같은 class 에서 받고 z를 가져온다.
    }
}
*/
/*     // class 안에서만 사용할 method/변수 이고 (조건)
       // 이용자가 임의로 값을 변경하지 못하게 하고싶은 메소드/변수 라면 private 를 쓴다. (보안?)
       // method level 에서 public - 모든 package, class (o)
       // private - only 해당 class(o)   // default - 같은 class, 같은 package (o)
       // protected - 같은 class, 같은 package, + 상속한 다른 package
       // class level 접근제어자는 public(다른 package (o)) / default(해당 package 내에서만)

class calculator{
    private int a, b;
    public void set(int a, int b){
        this.a = a;
        this.b = b; }

    private int sum(){
        return this.a + this.b;}
    public void plus(){
        System.out.println("++"+ sum() + "++");
    }
    public void minus(){
        System.out.println("--"+ sum() + "--");
    }
}
    public class oopbasic02 {
        public static void main(String[] args) {
            calculator c1 = new calculator();
            c1.set(10,20);
            c1.plus();
            c1.minus();
        }
}
*/

   // abstract
//class 안에 abstract method 가 하나라도 있으면 -> class 도 abstract class 가 되야한다.
//abstract method 는 (); 로 끝난다. {} 본체는 올수없다.
//abstract class 는 반드시 (일반 class 로)상속해서만 사용 가능하다.
//abstract method 는 반드시 (상속할때) overriding 을 해서 구체적 {} 본체를 정의해야만 사용 가능하다.
//abstract class 안에는 일반적 method 들도 물론 올 수 있다.
/*
abstract class A{
    public abstract int abs();         //abstract method 특 ();
    public void hi(){
        System.out.println("hi");       //일반 method 올수있음
    }
}
class B extends A{                  //반드시 상속
    public int abs(){               //반드시 overriding (일반 method 로)
        return 2;
    }
}
public class oopbasic02 {
    public static void main(String[] args) {
        B c1 = new B();
        System.out.println(c1.abs());
        c1.hi();
    }
}
*/
            //abstract class 만 만들어드릴게 => 용도에 따라 니가 구체적으로 쓰세요
/*
abstract class cal{
    int a, b;

    public void set(int a, int b){
        this.a = a;
        this.b = b;
    }
    public abstract void sum();
    public abstract void multi();
    public void run(){
        sum();
        multi();
    }

}
class cal2 extends cal{
    public void sum(){
        System.out.println("결과는"+ (this.a+this.b) + "으로 합격");
    }
    public void multi(){
        System.out.println("결과는"+ (this.a*this.b) + "으로 합격");
    }
}
class cal3 extends cal{
    public void sum(){
        System.out.println("불합격"+ (this.a+this.b));
    }
    public void multi(){
        System.out.println("불합격"+(this.a*this.b));
    }
}

public class oopbasic02 {
    public static void main(String[] args) {
        cal2 c1 = new cal2();
        c1.set(20, 40);
        c1.run();

        cal3 c2 = new cal3();
        c2.set(10, 20);
        c2.run();

    }
}
*/

// final - 고정값, 변경/상속/overriding 금지!

/* final class C{}
  class D extends C{}       //Error - final class 는 상속 불가능!

class A{final void fi(){}}
class B extends A{
    void fi(){}            //Error - final method 는 overriding 불가능!
}
*/
/*
class cal {
    static final double PI = 3.14;     // final field - class 내, class 밖에서도 무조건 고정값
}
*/

          // interface (본체x) - implements => interface 안의 method 들 반드시 구체적으로 구현
          // interface 의 member(method, 변수)는 반드시 public
/*
interface i{
    public void z();}

class A implements i{
    public void z(){}
}
*/
/*
interface promise{                           //메소드 3개 쓸거고, 변수 3개 들어갈거야 약속!
    public void set(int a, int b, int c);
    public void sum();
    public void multi();

          }
class cal implements promise{          //cal 만드는 개발자 : 오케이 interface 에 맞춰서 개발중
    int a, b, c;
    public void set(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void sum(){
        System.out.println(this.a + this.b + this.c);
    }
    public void multi(){
        System.out.println(this.a*this.b*this.c);
    }
}

public class oopbasic02{            //cal 사용하는 부분 개발자 : 오케이 cal 설정은 {} 형식만 맞춰두고 사용부분 개발중
    public static void main(String[] args) {
        cal c1 = new cal();
        c1.set(1,2,3);
        c1.sum();
        c1.multi();
    }
}
 */
// 즉, interface 로 형식만 정해서 약속 해두고, 거기에 맞춰 각 개발자의 부분을 동시에 진행하기 위함

//하나의 class 가 여러개 interface 를 implements 할 수 있다
/*
interface i1{public void x();}
interface i2{public void y();}

class cal implements i1, i2{                   // , 로 두개 동시에 implements
    public void x(){}
    public void y(){}                         //각 interface 에 있는 method 모두 구체적으로 구현해야 한다.
}
 */

//interface 끼리 상속 가능
/*
interface i1{public void x();}

interface i2 extends i1{
    public void y();
}
class cal implements i2{
    public void x(){}
    public void y(){}
}
 */

// class 의 다형성 - class를 instance화 시킬 때, 그 instance를 담는 class는 1.자기자신(원래) 2.super class(부모) 도 가능

/*
class A{
    public String x(){return "A";}
}
class B extends A{
    public String x(){return "B";}
    public String y(){return "y";}
}
class C extends A{
    public String x(){return "C";}
}

public class oopbasic02 {
    public static void main(String[] args) {

        A c1 = new B();        //class B 객체를 c1 이라는 instance 로 만들고, 그 instance 는 class A(부모)에 담는다.
        A c2 = new C();
                                         //담는 class A 기준
        System.out.println(c1.x());     //method 있는건 overriding 된 sub class 거로 가져온다.
        //System.out.println(c1.y());   //method 없는건 못가져온다.
        System.out.println(c2.x());
    }
}
*/
// 이렇게 A class 로 묶어줌으로서 => execute 같은 명령어를 공통으로 적용시킬 수 있다. (묶어주기!)
// 필요한 method 를 가진 super class 에 담아서 집중하게 하기
// 그 필요한 method 외에 다른 기능들은 사용하지 못하게 방지 하기

//interface 도 super class 와 마찬가지로, instance화 할 때, 그 instance 를 담는 data type 으로 쓰일 수 있다.
//interface 도 super class 와 마찬가지로 작동한다.

