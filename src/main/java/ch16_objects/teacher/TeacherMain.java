package ch16_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("안근수","코리아IT");
        Teacher teacher1  = new Teacher("안근수","코리아IT");

        boolean result1 = teacher.equals(teacher1);
        System.out.println();

    }
}
