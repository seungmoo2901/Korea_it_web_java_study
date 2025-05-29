package _28_Static.Person;

public class Person {

    public static int population = 0;
    public String name;

    public Person(String name){
        System.out.println("현재 인구수:" + population);
        this.name = name;
        population++;
        System.out.println("객체가 생성됨");
    }
    public void sayHello(){
        System.out.println("안녕하세요, 저는 " + name + "입니다.");
    }
    public static void showPopulation(){
        System.out.println("전체 인구수: " + population);
    }
}
