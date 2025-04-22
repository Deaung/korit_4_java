package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            .next(): String 데이터 받을 때 띄어쓰기 인정 안함
            .nextLine() : String 데이터 받을때 띄어쓰기 인정하고 enter 기준으로 데이터 입력

            예시)
            이름 입력하세요>>> 이름
            나이 입력하세요>>> 나이
            주소 입력하세요>>> 주소

            안녕하세요, 제 이름은 (이름) 입니다. (주소)에 살고 있습니다.
            10년 후 나이는 (나이)+10 살 입니다.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요>>>");
        String name = scanner.next();

        System.out.print("나이를 입력하세요>>>");
        int age = scanner.nextInt();
        scanner.nextLine();
        int age10 = age+10;

        System.out.print("주소를 입력하세요>>>");
        String address = scanner.nextLine();


        System.out.println("안녕하세요, 제 이름은 " +name+ " 입니다. " +address+ "에 살고 있습니다.");
        System.out.println("10년 후 나이는 "+ age10 +"살 입니다.");




    }
}
