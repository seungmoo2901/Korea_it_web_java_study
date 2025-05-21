package _18_Overloading;

public class Overloading {
    public static int getPower(int number){
        return number * number;
    }

    public static int getPower(double doubleNum){
        int number = (int) doubleNum;
        return number * number;
    }
    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static String printInfo(String info){
        return info;
    }

    public static int printInfo(int age){
        return age;
    }

    public static int add(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static double add(double a,double b){
        double sum = a + b;
        return sum;
    }

    public static int add(String a,String b){
        int A = Integer.parseInt(a);
        int B = Integer.parseInt(b);
        return A+B;
    }

    public static void main(String[] args) {
        //메소드 오버로딩
        //같은 이름의 메소드를 여러 개 선언
        //매개변수(파라미터)의 타입이 달라야한다 또는 갯수가 달라야한다.
        System.out.println(getPower(3));
        System.out.println(getPower(2.3));
        System.out.println(getPower("4"));
        System.out.println(getPower(2,4));
        System.out.println(printInfo("이름:이승무"));
        System.out.println(printInfo(26));

        //문제
        //메소드 이름 printInfo()
        //문자열 이름만 전달 => 이름을 출력
        //문자열 이름, 정수 나이 전달 => 이름 나이 출력
        //문자열 이름, 정수 나이, 문자열 이메일 => 이름 나이 이메일 출력

        //메소드 이름 add()
        //int와 int 덧셈
        //double과 double 덧셈
        // 문자열 숫자와 문자열 숫자 덧셈


    }
}
