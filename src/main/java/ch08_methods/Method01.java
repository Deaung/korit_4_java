package ch08_methods;

import java.util.Scanner;

public class Method01 {
    // method 정의하는 영역

//    1. [ x | x ] [입력값 / 출력값]
//    public static void call1(){
//        System.out.println("[ x | x ]");
//        System.out.println("call1타입메서드");
//        System.out.println("수정");
//    }
//    public static void call2(String strExample){
//        System.out.println("[ o | x ]");
//        System.out.println(strExample);
//    }
    public static String call3(){
        System.out.println("[ x | o ]");
        StringBuilder result = new StringBuilder(); // 지역변수 = 메서드 내에서 정의된 변수
        for (int i= 0; i<3; i++){
            result.append("🍤".repeat(i + 1));
            result.append("\n"); // 개행 \f -> 공백 두번/네번
        }
        return result.toString();
    }
    // 자기소개 메서드 정의
    public static String introduce(String name, int age){
        return "제 이름은 "+name+ " 입니다. 나이는"+age+" 살 입니다.\n내년에는 "+ (age+1)+" 살 입니다";
    }
    public static String call4(int year, int month,int date, String day){

        System.out.println("[ o | o ]");
        return year+"년 "+ month + "월 "+ date+"일 "+day+"입니다.";
    }

    public static void main(String[] args) {
        // method 실행(호출)영역
//        call1();
//        call2("집가기"); // 호출단계에서 () 내를 채우는것 argument
        System.out.println(call3()); //출력문이 메서드안에서 정의되지 않아서 메인에서 정의
//        System.out.println(call4(2024,4,24,"목요일"));
//        System.out.println(introduce("김대웅",25));


        Scanner scanner = new Scanner(System.in);
        System.out.print("이름");
        String name = scanner.next();
        System.out.print("나이");
        int age = scanner.nextInt();

        System.out.println(introduce(name,age));

        /*
            함수형 프로그래밍 :
                메서드 1의 return값이 메서드 2의  argument 가 되고 메서드 2 의 return값이 메서드 3의 argument가 되는 방식

                첫 메서드 부터 마지막 메서드까지 흐륾을 통해 프로그램 이어지는 방식

                이상의 예시에서는 .next() 의 결과값과 .nextInt()의 결과값이 .introduce 의 argument1 argument2로 사용됨
         */

    }
}
