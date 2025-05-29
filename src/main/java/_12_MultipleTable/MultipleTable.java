package _12_MultipleTable;

public class MultipleTable {
    public static void main(String[] args) {
        //1~9단까지 출력
        // 1x3 = 3

        for (int i = 1; i <= 9; i++) { //앞단
            for (int j = 1; j <= 9; j++) { //뒷단
                System.out.println(i + "x" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
