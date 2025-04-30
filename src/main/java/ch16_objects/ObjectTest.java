package ch16_objects;
/*
    필드 전부 private
    name
    address

    기본생성자 매개변수 생성자
 */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest() {
        System.out.println("기본생성자 생성");
    }


    public ObjectTest(String name) {
        System.out.println("name 매개변수로 생성");
        this.name = name;
    }


    public ObjectTest(String name, String address) {
        System.out.println("name,address 매개변수 로 객체 생성");
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void displayInfo(){
        System.out.println("이름: "+this.name);
        System.out.println("주소: "+this.address);
    }

//    public ObjectTest(String address) {
//        System.out.println("address 매개변수로 생성");
//        this.name = name;
//    }
    /*
        위 코드 오류 이유
        매개 변수와 field 는 서로 다른 개념
            상황 예시
            ObjectTest object1 = new ObjectTest("이름")
            ObjectTest object2 = new ObjectTest("주소")
            매개변수가 같기 때문에 사용불가
     */

    // Object 클래스의 메서드들을 override


//    @Override
//    public String toString() {
//        return
//                "이름='" + name + '\'' +
//                ", 주소='" + address + '\'';
//    }
//

    @Override
    public String toString() {
        return super.toString();
    }
}
