package ch10_setter_getter;

public class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println(
                "기본생성자 통해 Person 클래스의 인스턴스 생성 되었습니다.");
    }
    public Person(String name){
        this.name = name;
    }
    public Person(int age){
        this.age= age;
    }
    public  Person(String name, int age){
        this.name = name;
        this.age= age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {


        this.name = name;
        System.out.println("이름이 입력되었습니다: "+name);
    }

    public int getAge() {
        return age;
    }
// setAge 기준으로 수치가 잘못된 값은 매개변수로 못들어오도록 수정 예정
    public void setAge(int age) {

        if (age < 0 || age > 200) {
            System.out.println("불가능한 나이 입력입니다. 현재 나이 : "+this.age);
            return;
        }
        System.out.println("나이가 입력되었습니다.");
        System.out.println("변경 전 나이 : "+this.age);
        System.out.println("변경 후 나이: " +age);
        this.age = age;
    }

    public void showInfo(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
    }

}
