package ch09_classes;

import java.util.Scanner;

public class ClassAMain {
    public static void main(String[] args) {
//        ClassA classA1 = new ClassA();
//        ClassA classA2 = new ClassA();

        // Scanner 와 같은 방식
        // 여태까지 Scanner의 인스턴스 생성중이였음

        // 객체 생성 방법 클래스명 객체명 = new 클래스명();

        // 객체 속성 접근 방법
        // 객체명.속성명
//        classA2.num = 200;
//        classA2.name= "김이";
        //classA2 객체 생성
        //num 200 name 김이 대입 후 출력하기
//        System.out.println(classA2.name+"의 번호는 "+classA2.num+"번 입니다");
//        classA2.callName();
        ClassA classA3 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        System.out.print("번호 입력: ");
        classA3.num = scanner.nextInt();
        System.out.print("이름 입력: ");
        classA3.name = scanner.next();
        System.out.print("점수 입력: ");
        classA3.score = scanner.nextDouble();

        classA3.displayProfile();




    }
}
