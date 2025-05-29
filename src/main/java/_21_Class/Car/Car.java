package _21_Class.Car;

public class Car {
    String carName;
    int carYearModel;
    String carColor;

    //생성자
    Car(){ //기본생성자
        System.out.println("필드가 아무것도 정해지지 않은 껍데기 자동차");
        System.out.println("NoArgsConstructor");
    }

    Car(String carName){ //일반적으로 매개변수명과 일치
        System.out.println("carName의 속성값이 부여된 자동차");
        System.out.println("RequiredArgsConstructor");
        this.carName = carName;
    }
    // this 해당 클래스로 만들어진 객체를 의미
    // this를 왜 써야하는가? => 속성의 이름과 매개변수의 이름이 같을때 명확히 하기 위해서
    // 그렇다면 이름이 다르다면 this는 생략가능
    //만약 carName = carName; 이라면 속성에 자기 자신을 대입하는거라 의미가 없다.
    //하지만 this.carName이라고 명시를 해두면 속성에 매개변수 값 대입이라는 뜻
    Car(String carName, int carYearModel, String carColor){
        System.out.println("모든 속성값이 부여된 자동차");
        System.out.println("AllArgsConstructor");
        this.carName = carName;
        this.carYearModel = carYearModel;
        this.carColor = carColor;
    }

    public void startCar(){
        System.out.println(carName + "이 시동을 겁니다.");
    }

    public void drive(){
        System.out.println(carName + "이 전진합니다.");
    }

    public void stop(){
        System.out.println(carName + "이 정지합니다.");
    }
}
