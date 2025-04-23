package ch06_condition;

import java.util.Scanner;

/*
    조건문
    1. if문 : if 다음에 있는 ()내의 조건식이 true일 경우 {}안의 실행문 실행, false면 안함

    형식:
        if(조건식){
            실행문
        }
 */
public class Condition01 {
    public static void main(String[] args) {
//        변수 선언 및 초기화
        int num1 = 10;

        //조건문
        //실행됨
        if(num1 > 0){
            System.out.println("num1은 양수");
        }
        //실행 안됨
        if(num1 > 15){
            System.out.println("num1은 15 초과");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자입력");
        int num2 = scanner.nextInt();
        if (num2 > 0){
            System.out.println("num2는 양수");
        }
    }
}
