package _36_StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamApiExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> product = Arrays.asList(
                "애플 아이폰 15 Pro",
                "애플 맥북 프로 M3",
                "애플 아이패드 에어5 세대",
                "삼성 갤럭시 S24울트라",
                "삼성 갤럭시 Z 플립 5",
                "삼성 갤럭시탭 S9",
                "엘지 울트라기어 게이밍 모니터"
        );
        System.out.println("브랜드를 입력하세요: ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("apple")) {
            input = "애플";
        }
        if (input.equalsIgnoreCase("samsung")) {
            input = "삼성";
        }
        if (input.equalsIgnoreCase("lg")) {
            input = "엘지";
        }

        String keyword = input;

        List<String> result = product.stream()
                .filter(p -> p.contains(keyword))
                .toList();

        System.out.println(keyword + "브랜드 상품 목록: ");

        if(result.isEmpty()){
            System.out.println("해당 브랜드의 상품이 없습니다.");
        } else {
            result.forEach(System.out::println);
        }
    }
}


