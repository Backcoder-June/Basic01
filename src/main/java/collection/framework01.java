package collection;

//collections Framework

//1. ArrayList
import java.util.ArrayList;    // ArrayList 패키지 가져오기
import java.util.HashSet;
import java.util.Iterator;

public class framework01 {
    public static void main(String[] args) {
/*
        ArrayList al = new ArrayList();      // class 처럼 instance 화 해서 사용한다.
        al.add("Apple");             // .add 로 elements 를 추가해서 사용 .add(Object) - 모든 data Type
        al.add("Banana");
        al.add("Carrot");

        for (int a=0; a<al.size(); a++) {       // .size() 메소드를 이용한다. (=총 elements 개수)
           // System.out.println(al.get(a));      // .get() 메소드로 출력한다. 이렇게 바로 뽑기는 문제가 없다.
            String Fruit = (String)al.get(a);     // 하지만 이렇게 변수로 만들어 출력할때는 data Type 에 유의해야한다.
            System.out.println(Fruit);           // ArrayList 는 기본적으로 모든 type 을 수용할 수 있는 Object type 이다.
                                                 // Object(부모) 가 String(자식) 행세를 할 수 없으므로, 강제 형변환이 필요하다.
        }
        }     //하지만 이것보다 generic 을 활용하는게 더 바람직 하다.

    }
*/
/*           //ArrayList 제한 - generic
ArrayList<String> al = new ArrayList<String>(); // ArrayList 의 generic 을 String 으로 제한
al.add("Apple");
al.add("Banana");
al.add("Carrot");

for(int a = 0; a<al.size(); a++){
    String Fruit = al.get(a);        //al.get() 의 값이 String 이므로 형변환이 필요 없다.
    System.out.println(Fruit);
}
*/

// HashSet - Set 에서 가장 많이쓰이는 class (Set => 집합 개념)
//import java.util.HashSet;
/*
HashSet<Integer> A = new HashSet<Integer>();  // instance 만드는 게 collections 의 기본. 여기서 ArrayList 로 바로 바꾸기 가능
A.add(1);
A.add(2);                   // Set 은 집합 개념이므로, 중복값은 무시. 고유값만 인장 / List 는 중복도 순서대로 다 받음
A.add(2); //무시             // Set - index (x)  / List - index (o)

A.add(2); //무시
A.add(2); //무시
A.add(3);

HashSet<Integer> B = new HashSet<Integer>();
B.add(2);
B.add(3);
B.add(4);

HashSet<Integer> C = new HashSet<Integer>();
C.add(2);
C.add(3);

// .containsAll(); <- 부분집합
        System.out.println(A.containsAll(B));         // false 4 없다
        System.out.println(A.containsAll(C));         // true

/* .iterator();  <- for each 처럼, 하나하나 뽑아내기

        Iterator fe = (Iterator) A.iterator();  //Iterator - interface 이면서 datatype / .iterator() 메소드 / 형변환
        while (fe.hasNext()){                   // Iterator 의 메소드 1. .hasNext() 2. .next() 3. .iterator()
            System.out.println(fe.next());}
*/



// .addAll(); <- 합집합
/*
A.addAll(B);
        Iterator fe = (Iterator) A.iterator();
        while (fe.hasNext()){
            System.out.println(fe.next());}
*/
// .retainAll(); <- 교집합
/*
A.retainAll(B);
        Iterator fd = (Iterator) A.iterator();
        while (fd.hasNext()){
            System.out.println("교집합"+fd.next());}
*/

// .removeAll(); <- 차집합
/*
        A.removeAll(B);
        Iterator ff = (Iterator) A.iterator();
        while (ff.hasNext()){
            System.out.println("차집합"+ff.next());}
*/

//






          }}
