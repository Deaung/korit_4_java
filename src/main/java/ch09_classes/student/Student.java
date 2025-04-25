package ch09_classes.student;

public class Student {
    int studentCode;
    String name;
    double score;

    Student(){
        System.out.println("기본생성자로 객체 생성\n");
    }
    Student(int studentCode){
        System.out.println("int 매개변수로 받는 생성자로 객체 생성\n");
        this.studentCode = studentCode;
    }
    Student(String name){
        System.out.println("String 매개변수로 받는 생성자로 객체 생성\n");
        this.name= name;
    }
    Student(int studentCode, String name){
        System.out.println("학번과 이름으로 객체 생성\n");
        this.studentCode = studentCode;
        this.name = name;
    }
    Student(int studentCode, String name, double score){
        System.out.println("학번,이름,점수로 객체 생성\n");
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
    }

    void showInfo(){
        System.out.println("학생 정보\n");
        System.out.println("학번: "+studentCode);
        System.out.println("이름: "+name);
        System.out.println("점수: "+score+"\n");

    }
}
