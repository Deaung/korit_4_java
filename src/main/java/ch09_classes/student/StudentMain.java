package ch09_classes.student;

public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.studentCode = 2025001;
        student.name = "김일";
        student.score = 4.5;

        Student student1 = new Student(2025002);
        student1.name = "김이";
        student1.score = 100;

        Student student2 = new Student("김삼");
        student2.studentCode=2025003;
        student2.score=95.8;

        Student student3 = new Student(2025004,"김사");
        student3.score = 4.0;

        Student student4 = new Student(2025005,"김오",80.7);


        student.showInfo();
        student1.showInfo();
        student2.showInfo();
        student3.showInfo();
        student4.showInfo();
    }
}
