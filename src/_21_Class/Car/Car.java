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
