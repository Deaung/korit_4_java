package ch08_methods;

import java.util.Scanner;

public class Method02 {

    public static  void introduce(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 입력");
        String name = scanner.nextLine();
        System.out.print("주소");
        String address = scanner.nextLine();
        System.out.println("이름은"+name +"입니다." );
        System.out.println(address+"에 살고있스빈다");
    }
    /*
        출석부 만들기
        메서드 명 : registerStudent()
        return : void

        실행 예시
        학번 입력 >>> ~~
        이름 입력 >>> ~~

        학번 : ~~
        이름 : ~~

        main 에서 학생 수 입력 받을 예정

        학생 수 입력

        학번 입력
        이름 입력
        학번 출력
        이름 출력
     */
    public static void registerStudent(){
        Scanner scanner = new Scanner(System.in);
        int stuNum;
        String stuName;
        System.out.print("학번 입력>>");
        stuNum = scanner.nextInt();

        System.out.print("이름 입력>>");
        stuName = scanner.next();

        System.out.println("학번 : "+stuNum);
        System.out.println("이름 : "+stuName);
    }


    public static void registerStudent2(int repeat){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<repeat; i++){

            int stuNum;
            String stuName;

            System.out.print("학번?");
            stuNum = scanner.nextInt();

            System.out.print("이름?");
            stuName = scanner.next();

            System.out.println("학번 : "+stuNum);
            System.out.println("이름 : "+stuName);
        }

    }
    public static void registerStudent3(int repeat){
        for (int i = 0; i<repeat; i++){
            registerStudent();
        }
    }

    public static void main(String[] args) {
//        introduce();
        Scanner scanner =new Scanner(System.in);
//        System.out.print("학생 수 입력>>");
//        int studentNum = scanner.nextInt();
//        for (int i=0; i < studentNum; i++){
//            registerStudent();
//        }
//        registerStudent2(3);
        registerStudent3(3);
    }

}
