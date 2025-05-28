package _26_Objects;

import java.util.Objects;

public class Teacher {
    private String name;
    private String schoolName;

    public Teacher(String name){
        this.name = name;
    }

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return  name + "선생님의 근무지는 " + schoolName + "입니다.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,schoolName);
    }
    //name과 schoolName의 값을 기반으로 고유한 숫자(hashCode)를 생성

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Teacher)) return false;
        Teacher teacher = (Teacher) obj;
        return this.name.equals(teacher.name) && this.schoolName.equals(teacher.schoolName);
    }
    //equals에서 같다고 판별된 객체는 같은 해시코드를 가져야한다. 라고 자바공식 규칙
}
