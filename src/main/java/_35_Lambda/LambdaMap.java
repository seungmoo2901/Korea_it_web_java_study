package _35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//1. 스캐너 객체 선언, 입력 받아서 저장할 Map선언(String, Integer)
//2. 상품을 입력할 갯수를 count로 입력받기(nextInt)
//3. count만큼 반복해서 상품명(키)와 가격(값)으로 입력받고 map에 추가
public class LambdaMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();

        System.out.print("상품 갯수: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("상품명: ");
            String name = scanner.next();

            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            productMap.put(name, price);
        }

        System.out.println("[상품 목록]");
        productMap.forEach((name, price) -> System.out.println("상품명: " + name + ", 가격: " + price));
    }
}

