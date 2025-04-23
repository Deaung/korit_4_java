package ch06_condition;

import java.util.Scanner;

/*
    삼항연산
        정의 : 조건식을 평가하여 true / false에 따라 두가지 표현식중 하나를 선택적 실행

        형식:
        조건식 ? 표현식1 : 표현식2;

        조건식 : true/false 평가 가능한식
        표현식1 : true일 경우 실행
        표현식2 : false일 경우 실행
 */
public class Condition10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        int max;
//        int max2;
//
//        max = (a>b)? a : b;
//        System.out.println(max);
//
//        if(a>b){
//            max2 = a;
//        }else {
//            max2 = b;
//        }
//        System.out.println(max2);

        //이상의 개념을 윤년에 응용
        Scanner scanner = new Scanner(System.in);
        System.out.println("년도 입력: ");
        int year = scanner.nextInt();

//        boolean isLeapYear = ((year%4 == 0 && year % 100 != 0)||year%400==0);
//        String result = isLeapYear ? "윤년":"윤년아님";
//        System.out.println(year+result);

        // 음수 연도 거르기
//        String result2= "";
//        if (year <0 ){
//            result2 = "불가능한 연도";
//        }else {
//            result2 = isLeapYear ? "윤년":"윤년아님";
//        }
//        System.out.println(year+"년은 "+result2);
        // 중첩 삼항 연산자
        String result3 = year <= 0 ? "불가능한 연도"
                : ((year % 4 ==0 && year %100 != 0)||(year%400==0))
                ? "윤년"
                : "윤년아님";
        System.out.println(year+"년은 "+result3);


    }
}
