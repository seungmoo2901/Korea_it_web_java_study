package _31_Generic.Wildcard.LowerBondedWildcard;

public class Main {
    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Maltese> malteseBox = new Box<>();

        SuperWildcard.putDog(animalBox); //OK
        SuperWildcard.putDog(dogBox);

//        SuperWildcard.putDog(malteseBox);
    }
}
