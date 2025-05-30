package _29_Builder;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member.Builder()
                .name("이승무")
                .age(26)
                .email("lsm290225@naver.com")
                .build();
    }
    //빌더 방식을 이용했을때 이점
    //1. 가독성이 높아짐
    //2. 매개변수의 순서를 지키지 않아도 된다
    //3. 유지보수성 향상 => 필드추가 변경에 용이
}
