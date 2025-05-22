package _19_VariableScope;

public class VariableScope {
    public static void method(){
        String str = "abc";
//        System.out.println(name);
    }
    public static void main(String[] args) {
        String name = "이승무";
//        System.out.println(str);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
        {
            int age = 26;
        }
//        System.out.println(age);
    }
}
