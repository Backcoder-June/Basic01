package collection;

//collections Framework        - 알고리즘 , data structure(자료구조) 와 함께 사용된다.

import java.util.*;
import java.util.ArrayList;    // ArrayList 패키지 가져오기
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
//import java.util.Collection; < 전체 import 가능
import java.util.Collection;
import java.util.Map;
import java.util.Collections;
import java.util.Set;

//1. ArrayList
//public class framework01 {
  //  public static void main(String[] args) {
/*
        ArrayList al = new ArrayList();      // class 처럼 instance 화 해서 사용한다.
        al.add("Apple");             // .add 로 elements 를 추가해서 사용 .add(Object) - 모든 data Type
        al.add("Banana");
        al.add("Carrot");
        al.remove("Banana");        //해당 element 만 제거
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

/* .iterator();  <- for each 처럼, 하나하나 출력해주는 method

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

// Map  - HashMAp (대표)
// key 값(중복 x)  => 해당 value 값 return (중복 o )
// key 값이 중복으로 주어질 경우, 새로 만든 최신 key 값만 인정. 즉, 최신 key 값의 value 으로 교체됨. (마치 overriding 처럼)
// key 값 , value 값 두개를 가지므로 -> generic 도 <A, B>  / .put( key, value ) / .get(key) => return value
/*
HashMap<String, Integer> A = new HashMap<String, Integer>();

A.put("one", 1);
A.put("two", 2);
A.put("hundred", 100);

        System.out.println(A.get("one"));
        System.out.println(A.get("hundred"));
//    iteratorUsngForEach(A);
//    iteratorUsingIterator(A);
    }

*/
// For each / iterator 으로 Map 의 key값, value 값을 하나하나 출력하기
// method 1. iteratorUsingForEach        2. iteratorUsingIterator

/*
static void iteratorUsngForEach(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();       //entrySet() 메소드를 map 에 사용하면
                                                          //Map.Entry<A,B> 맵 의 참가자 들을 Set 집합의 data type 으로 설정
                                                          //그 Set 을 entries 에 담는다.
        for (Map.Entry<String, Integer> entry : entries){             // Map 참가자들이 entries 에 해당하는 동안
            System.out.println(entry.getKey() + ":" +entry.getValue() );  //getKey 와 getValue 를 이용해 값을 출력한다
        }

 */
/*
static void iteratorUsingIterator(HashMap map){
           Set<Map.Entry<String, Integer>> entries = map.entrySet();    //마찬가지로 entrySet() 메소드 이용 entries 에 담고
          Iterator<Map.Entry<String, Integer>> i = entries.iterator();  // iterator() 메소드로 출력한 값들을 (entries)
                                                                      //Iterator data type 으로 i 에 담는다
          while (i.hasNext()){Map.Entry<String, Integer> entry = i.next();    // i 를 hasNext 와 next 로 출력한다.
              System.out.println(entry.getKey() + ":" + entry.getValue()); }  // getKey , getValue 메소드 이용
*/

        // .sort(); => 정렬하기
        // collections - class 의 메소드다 (import)
        // 메소드들이 다 static 이으로, 인스턴스화 필요 없다.
        // Comparable dataType , 즉 비교 가능한 형식의 data type 이어야만 sort 가능하다.
        // public static<T extends Comparable<? super T>> void sort(List <T> list){}
        // List 타입의 data type 만 sort 가능하다
/*
class computer implements Comparable {                   // .sort 사용하려면 필수조건
    int number;
    String owner;

    computer(int number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public int compareTo(Object o) {                       // Comparable 인터페이스를 implements 하면
        return this.number - ((computer) o).number;        // 필수적으로 compareTo 를 구현해야함
    }                                                   // A.compareTo(B) => 양수 > / 음수 < / 0 =
                                                        // this.number = A
                                                        // ((computer) o) = Object o  <= 괄호로 두번 묶어준다 (일단 알아두자)
    public String toString() {                       //overriding 해서 써먹을 method 로 정의.
        return number + "" + owner;
    }
}
public class framework01 {
    public static void main(String[] args) {                  //ArrayList al = new ArrayList();  기본형
        List<computer> comp = new ArrayList<computer>();      // 객체 computer 를 Data type 으로 쓸 수 있다.
        comp.add(new computer(500, "June"));    // 객체 computer 를 ArrayList 로 만듬
        comp.add(new computer(200, "Tom"));    // 객체를 .add 할때는 "new 객체()" 로 해줘야 하네.
        comp.add(new computer(1000, "Luna"));

        System.out.println(comp.toString());              // 정렬 안됨

        Collections.sort(comp);

        Iterator i = comp.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(comp.toString());             //정렬 된 값으로 출력
    }
}
*/









