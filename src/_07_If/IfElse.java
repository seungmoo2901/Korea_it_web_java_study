package _07_If;

public class IfElse {
    public static void main(String[] args) {
        //else 는 조건이 거짓이면 실행되는 코드블럭

        //키가 12이상 이어야 탑승가능
        int height = 120;
        if (height >= 120){
            System.out.println("탑승 가능");
        }else {
            System.out.println("탑승 불가능");
        }
    }
}
