package _25_Casting.Control;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터 전원을 끕니다.");
    }

    public void compute() {
        System.out.println("컴퓨터가 연산을 합니다.");
    }
}
