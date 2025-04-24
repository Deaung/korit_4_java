package ch09_classes;

public class ClassA {
    int num;
    String name;
    double score;
    public void displayProfile(){
        System.out.println("[ 실행결과 ]");
        System.out.println
                (num + " 학번인 학생의 이름은 "+name+" 이고, 점수는"+score+"입니다");
    }

    public void callName(){
        System.out.println(name + "을 부릅니다");
    }
}
