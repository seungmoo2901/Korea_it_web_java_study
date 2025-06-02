package _31_Generic.Wildcard.UpperWildcard;

public class ExtendsWildcard {
    //<? extends Animal>
    // Dog, Cat, Animal등 Animal을 상속한 모든 타입을 받을 수 있다.
    //상한 경계 와일드카드(상위 클래스 제한)
    //읽기만 됨, 쓰기는 안됨
    //반환타입은 Animal로 취급
    //Animal 또는 Animal을 상속한 타입만 받겠다.
    public static void makeSound(Box<? extends Animal> box){
        Animal animal = box.getItem();
        animal.sound();

//        box.setItem(new Dog());
        // 이유 : Box<? extends Animal>은 정확한 타입이 뭔지 몰라서 쓰기를 제한
    }
}
