package _28_Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(KoreaItStudent.static_curriculum);
        KoreaItStudent koreaItStudent = new KoreaItStudent("이승무",26);
        System.out.println(koreaItStudent.getStatic());

        //클래스수준 에서 변수를 정의하거나 메서드를 선언할때 사용
        //static으로 선언된 변수나 메서드는 클래스의 인스턴스에 속하지 않음
        //클래스 자체에 속하게 됨
        //이는 인스턴스를 생성하지 않고 접근이 가능하다
        //이런점에서 인스턴스 변수나 메소드와 차이가 있다.
        //특징
        //클래스 수준의 변수 및 메소드 - static 변수와 메소드는 클래스 로드 시 메모리에 할당
        //공유 - 모든 인스턴스가 동일한 static 변수에 접근, 따라서 데이터를 공유하거나 상태를 저장
    }
}
