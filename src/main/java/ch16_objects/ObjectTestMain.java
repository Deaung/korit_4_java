package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest();


        objectTest.setName("김대웅");
        objectTest.setAddress("부산진구 개금");

        objectTest.displayInfo();
        System.out.println(objectTest);

        Teacher teacher = new Teacher("누구누구","무슨무슨");

        System.out.println(teacher);
    }
}
