package _13_BreakContinue;

public class Break {
    public static void main(String[] args) {
        //반복문 - break, continue
        // break - 특정상황(조건)에서 반복문 빠져나옴

        //톤쇼우 웨이팅 50명
        //판매 가능한 갯수 10개
        int wating = 50;
        int max = 10;
        for (int i = 1; i <= wating; i++) { //가게가 운영중
            System.out.println(i + "번 손님 입장");
            if (i == 10){
                System.out.println("재료 소진!");
                break;
            }
        }
        System.out.println("영업 종료");

        int nowNum = 1;
        while (nowNum <= wating){
            System.out.println(nowNum + "번 손님 입장!");
            if (nowNum == max){
                System.out.println("재료 소진");
                break;
            }
            nowNum++;
        }
        System.out.println("영업 종료");
    }
}
