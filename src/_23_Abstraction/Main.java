package _23_Abstraction;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory("애플");
        phoneFactory.setName("삼성");
        phoneFactory.produce("아이폰16");
        phoneFactory.manage();
        phoneFactory.displayInfo();

        Factory factory = new Factory("애플") {
            @Override
            public void produce(String model) {
                System.out.println(getName()+"잠깐 만들어진 익명클래스가 무언가를 생산한다.");
            }

            @Override
            public void manage() {
                System.out.println(getName()+"잠깐 만들어진 익명클래스가 공장을 관리합니다.");
            }
        };
        factory.manage();
        factory.produce("스마트폰");
        //익명클래스 => 추상 클래스의 객체처럼 보이지만 자식클래스를 즉석에서 임시로 만들어서
        //객체를 생성한 것
        //재사용하지 않고 한 번만 쓰고 버릴거라면 익명클래스 사용
        //즉 임시로 만들ㅇ진 이름없는 자식클래스 = 익명클래스
        //그러므로 추상클래스의 객체가 만들어진것이 아니기때문에 추상클래스의 개념에 위배되는것이 아님
    }
}
