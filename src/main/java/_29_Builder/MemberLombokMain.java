package _29_Builder;

public class MemberLombokMain {
    public static void main(String[] args) {
        MemberLombok memberLombok = MemberLombok.builder()
                .age(26)
                .email("lsm290225@naver.com")
                .name("이승무")
                .build();
    }
}
