package example.boot.web2;

public class HelloDTO {

    private String name; //필드(field)
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // name 프로퍼티(property)
    // getter 메소드
    public String getName() {
        return name;
    }

    // name 프로퍼티(property)
    // setter 메소드
    public void setName(String name) {
        this.name = name;
    }

}
