package _27_Bean;

//Bean
//하나의 객체설계 규칙 (명세,가이드라인)
//멤버변수들은 private => 캡슐화
//기본 생성자
//getter / setter => 외부 접근을 위해
public class UserEntity {
    private  int userId;
    private String username;
    private  int age;
    private String email;

    public UserEntity() {

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "userEntity(" +
                "userID= "+ userId +
                ", username= " + username +
                ", age= " + age +
                ", email= " + email +")";
    }
}
