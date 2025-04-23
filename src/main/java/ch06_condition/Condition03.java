package ch06_condition;

import java.util.Scanner;

/*
    if- else if 문 : if - else 와 다르게 else if는 조건식을 요구

    if(조건식 1){
        실행문1
    }else if(조건식 2){
        실행문 2
    }
 */
public class Condition03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;
        final int VIP_POINT = 80; //final 사용시 변수에 재 대입이 불가능함
        final int GOLD_POINT = 60;  // final 작성시 대문자로 사용해서 직관성을 줌
        final int SILVER_POINT = 40;
        final int BRONZE_POINT = 20;

        System.out.print("회원포인트 입력 :");
        point = scanner.nextInt();
        // 조건문
//        if (point>80){
//            System.out.println("vip 회원");
//        }else if (point>60){
//            System.out.println("골드회원");
//        }else if (point>40){
//            System.out.println("실버 회원");
//        }else if (point>20) {
//            System.out.println("브론즈 회원");
//        }else if (point <= 20){
//            System.out.println("일반회원");
//        }

        // 반복되는 부분이 많아서 줄일 예정
        // 등급을 저장하는 변수 하나 선언
        String userGrade = "";
        if (point>80){
            userGrade="VIP";
        }else if (point>60){
            userGrade="GOLD";
        }else if (point>40){
            userGrade="SILVER";
        }else if (point>20) {
            userGrade="BRONZE";
        }else if (point <= 20){
            userGrade="NOMAL";
        }
        System.out.println("회원등급 :"+userGrade);

        // if /else-if/if-else-if 문의 경우 전체가 하나의 세트인 조건문으로 봐야함
    }
}
