package _22_Inheritance;

//Animal 상속
//부모 생성자 호출해서 객체 생성과 동시에 속성값 넣을 수 있도록 생성자 만들고
//getter setter
//getAnimalName => 제 이름은 ___ 입니다.
//getAnimalAge => 사람이 두발로 걷습니다.
//read(String bookName) => ___이 책이름을 읽습니다

//Main에서 객체 생성
public class Human extends Animal{

    public Human(String animalName, int animalAge) {
        super(animalName,animalAge);
    }

    @Override
    public String getAnimalName(){
       return "제이름은 " + super.getAnimalName() + "입니다.";
    }

    public int getAnimalAge(){
        System.out.println("제 나이는 "+ super.getAnimalAge()+ "살이고, 내년에는 " + (super.getAnimalAge()+1)+"살입니다.");
        return super.getAnimalAge();
    }
    @Override
    public void move(){
        System.out.println("사람이 두발로 걷습니다.");
    }
    public void read(String bookName){

        System.out.println(super.getAnimalName() + "가" + bookName+ "을 읽습니다.");
    }
}
