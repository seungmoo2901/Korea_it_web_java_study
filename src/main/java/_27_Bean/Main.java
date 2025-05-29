package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntitiy
        //UserId, username, age, email = > private
        //기본 생성자 하나 만들기
        //getter /setter

        //to String 오버라이드해서 정보 모두 출력되도록
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("이승무");
        userEntity.setAge(26);
        userEntity.setEmail("lsm290225@naver.com");

        System.out.println(userEntity);

        UserEntityLombok userEntityLombok = new UserEntityLombok();
        userEntityLombok.setUserId(2);
        userEntityLombok.setUsername("홍길동");
        userEntityLombok.setAge(18);
        userEntityLombok.setEmail("Hong@gmail.com");

        System.out.println(userEntityLombok);
    }
}
