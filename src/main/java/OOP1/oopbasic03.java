package OOP1;




//Exception 예외 - 예외처리
// try - catch => 예외발생 의심코드에 사용!
/*
class cal {
    int a, b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }


    public void divide() {
        try {
            System.out.println("계산 결과는");
            System.out.println(this.a / this.b);
            System.out.println("입니다");
        } catch (Exception e) {
            System.out.println("오류발생" + e.getMessage());
        }
    }
}

public class oopbasic03{
    public static void main(String[] args) {
        cal c1 = new cal();
        c1.set(10, 0);
        c1.divide();
    }
}
*/
// catch(Exception e){ 예외 처리방법들 3개 }
// e.getMessage() / e.toString() / e.printStackTrace()
/*
class cal {
    int a, b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void divide() {
        try {
            System.out.println("계산 결과는");
            System.out.println(this.a / this.b);
            System.out.println("입니다");
        } catch (Exception e){
            System.out.println("\n오류\n" + e.getMessage());
            System.out.println("\n자세한오류\n" + e.toString());
            System.out.println("\n자세한오류및위치");
            e.printStackTrace();                      //얘는 print 가 있어서 자체적으로 sout 됨. 나머지는 sout로 뽑아주고.
        }
    }
}
public class oopbasic03{
    public static void main(String[] args) {
        cal c1 = new cal();
        c1.set(10, 0);
        c1.divide();
    }
}
*/
// Array - 객체 class 로 사용하기 (참고)
/*
class A{
    public int[] arr = new int[3];      //class 에서 배열 선언할때 int[] arr = { a, b, c }; 이렇게 나열식으로 하면 바로 되는데
    public A() {                        // 하나하나 선언할때는 그냥하면 안되고 -> "생성자"로서 값을 줘야 함!
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
        public void z(int a, int b){         //class 에서는 method 로 뽑아서 써야하므로 -> index 를 가르킬 method 생성
        System.out.println(arr[a]);
        System.out.println(arr[b]);}         // 그 method 는 index 값을 받아 sout 로 arr[index] 를 통해 값 뽑는다.
}
public class oopbasic03 {
    public static void main(String[] args) {
        A c1 = new A();
        c1.z(0,2);
    }
}
*/
// Exception => 오류처리 => try catch
// catch 여러번 사용하기
// 마지막 Exception 한 번 더줘서 else if 처럼 사용하기 ("알수없는 오류")
/*
class A{
    public int[] arr = new int[3];
    public A() {
        arr[0] = 0;
        arr[1] = 10;
        arr[2] = 20;
    }
    public void z(int a, int b){
        try{
        System.out.println(arr[a]/arr[b]);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("index오류\n"+e.getMessage());}
        catch (ArithmeticException e){
            System.out.println("산술오류\n"+e.getMessage());}
        catch (Exception e){
            System.out.println("알수없는 오류");
        }

        }
}
public class oopbasic03 {
    public static void main(String[] args) {
        A c1 = new A();
        c1.z(100,2);
        c1.z(1,0);

    }
}
*/
/* 대표적 Exception 들
1. ArrayIndexOutOfBoundsException
- Array 에서 Index 가 범위를 벗어난 값을 호출할때 ( 위에 배열에서 c1.z(5, 2); <- index 2까지밖에없음 )

2. ArithmeticException
 - 산술연산 오류 (나누기 분모가 0)

3. IllegalArgumentException
 - 인자값이 그 메소드에서는 적합하지 않은 경우 (나누기 인데 분모 argument 가 0)

4. IllegalStateException
 - 어떤 메소드를 호출했을때, 그것이 현재 동작할수 있는 상황을 충족시키지 못한 경우 (나누기 메소드 인데, 분모가 0인 상황)

5. NullPointerException
 - parameter 가 null 인 경우
*/
// finally{} => try catch 에서 exception 발생 했던 안했던, 무조건 실행되는 로직
// try catch 다 끝나고 마지막에 나와야함
/* try{}
catch(){}
catch(){}
finally{System.out.println("disconnect");}
=> Exception 처리 끝난 후, DB 와 Application 접속을 끊어서 DB 유지보수
 */

// API문서 - throw(Exception 예측)가 있는 객체는 => try-catch 같은 예외처리가 강제 된다.

// 사용자 개념
// class C 는 B 의 메소드 run 을 사용하는 사용자 이다.
// main 은 C 의 메소드 go 를 사용하는 사용자 이다.
// B <- C <- main
/*
class B{
    void run(){}
}
class C{
    void go(){
        B b1 = new B();
        b1.run();
    } }

public class oopbasic03{
    public static void main(String[] args) {
        C c1 = new C();
        c1.go();
    }
}
*/

//이러한 사용자 관계일 때, 사용자 class 에게 "throws" 를 통해 오류처리 의무를 넘길 수 있다.

/*
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.*; << 전체

class B{
    void run() throws FileNotFoundException, IOException {}
}
class C{
    void go() throws FileNotFoundException, IOException{
        B b1 = new B();
        b1.run();
    } }

public class oopbasic03 {
    public static void main(String[] args) {
        C c1 = new C();
        try {c1.go();}
        catch (FileNotFoundException e) {}
        catch (IOException e) {}               //go 라는 하나의 메소드로 묶였기 때문에 하나하나 해줄 필요 없이
    }                                          //조상인 IO가 FNFE 를 포함하므로 IO 만 해줘도 된다.
}

*/

// Exception 만들기 - API 가 주는 예외 말고, 내가 직접 주기전에 만들 수 있다. - throw new Exception
 // 메소드(){ if(b == 0){throw new Exception("Message")}
 //          System.out.println(this.a + this.b);       }
/*
class calculator{
    int a, b;
    public void set(int a, int b){
   //if(b==0){throw new IllegalArgumentException("잘못된 인자")}  //여기다 주면 전역에 적용이라 sum 에도 적용. 부적절
        this.a = a;
        this.b = b;
    }

    public void sum(){
        System.out.println(this.a + this.b);
    }
    public void divide(){
     if(b==0){throw new ArithmeticException("산술오류");}
        System.out.println(this.a/this.b);
    }
}

public class oopbasic03 {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.set(10,0);
        c1.sum();
        c1.divide();
        try{                                             //위에서 줬기 때문에, 여긴 try 안해도 되지만
        c1.divide();}                                   //위에걸로만 하면 exception 표시 길게 되니까
        catch (ArithmeticException e){                  //여기서 getMessage 로 위에 message 를 가져온다.
            e.getMessage();}

    }
}
*/

// checked Exception   VS   unchecked exception
//   Runtime 안가짐             Runtime 가짐
//   예외처리 필수 O             예외처리 필수 X
// 처리안하면 아예 안됨        되긴함. 나중에 고쳐서 쓰면됨
// IO, FileNotFound        Arithmetic, ArrayIndexOutOfBounds

// checked -> 예외처리 필수 O -> 1. try catch 2. throws

// 사용자정의 Exception 만들기
// (기본적으로 java 제공 표준Exception 을 사용하길 권장)
// 특별하게 필요한 Exception 기능이 있을때, 만들어서 쓴다.
/*

// class RuntimeException{
// RuntimeException()
// RuntimeException(String message)   이런게 기본으로 깔려있는거지 -> 상속

class divideException extends RuntimeException{
    int a, b;
    divideException(){        //기본생성자 (지워지니까)
        super();              //RuntimeException 의 기본생성자를 super 로 가져오는 것
    }
    divideException(String message){         //필요한 생성자
        super(message);}
    divideException(String message, int a, int b){    //추가 기능 생성
        super(message);
        this.a = a;
        this.b = b; }
}
class calculator {
    int a, b;

    public void set(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void sum() {
        System.out.println(this.a + this.b);
    }

    public void divide() {
        if (b == 0) {
            throw new divideException("분모가 0이요", this.a, this.b);}  //인자값으로 message, int a, b  를 넣어둠

        System.out.println(this.a / this.b);
    }
}

public class oopbasic03 {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        c1.set(10,0);
        c1.sum();
        try {
            c1.divide();}
        catch (divideException e) {
            System.out.println(e.getMessage());
            System.out.println(e.a);
            System.out.println(e.b);         // Exception 이 발생했을 때 의 a,b 값이라는 추가 정보를
        }                                    // Exception 정보로 제공할 수 있다.
        }                                    // 사용자정의 Exception 의 효용
  }
*/

