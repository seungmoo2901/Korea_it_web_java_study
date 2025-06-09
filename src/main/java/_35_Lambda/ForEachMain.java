package _35_Lambda;

import java.util.Arrays;
import java.util.List;

public class ForEachMain {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("사과","참외","배");

//        for (String fruit : fruits){
//            System.out.println(fruit);
//        }

        fruits.forEach(s -> System.out.println(s));

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        for (Integer number : numbers){
//            System.out.println(number * 2);
//        }
        numbers.forEach(number -> System.out.println(number * 2));
    }
}
