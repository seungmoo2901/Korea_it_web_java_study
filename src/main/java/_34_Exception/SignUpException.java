package _34_Exception;

class AgeException extends Exception{
    public AgeException(String message){
        super(message);
        System.out.println("예외가 발생했습니다.");
    }
}
public class SignUpException {
    public static void signup(String name, int age) throws AgeException{
        if(age < 14){
            throw new AgeException("만 14세 미만은 가입할수 없습니다.");
        }
        System.out.println(name + "님 회원가입 완료되었습니다.");
    }

    public static void main(String[] args) {
        String name = "홍길동";
        int age = 15;

        try{
            signup(name,age);
        }catch (AgeException e){
            System.out.println("회원가입 실패: " + e.getMessage());
        }finally {
            System.out.println("회원가입 처리 종료");
        }
    }
}
