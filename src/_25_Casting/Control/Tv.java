package _25_Casting.Control;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("Tv전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("Tv전원을 끕니다.");
    }

    public void changeChannel() {
        System.out.println("TV의 채널을 돌립니다.");
    }
}
