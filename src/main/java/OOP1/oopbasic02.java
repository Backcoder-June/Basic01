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