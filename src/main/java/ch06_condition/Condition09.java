package ch06_condition;

import java.util.Scanner;

public class Condition09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 논리연산자 사용
        System.out.print("연도 입력: ");
        int year = scanner.nextInt();
        String leapYear = "";

        if ((year % 4 == 0&& year%100 ==0)||(year%400==0)){
            leapYear = "윤년";
        } else {
            leapYear = "윤년아님";
        }
        System.out.println(year+"년은 "+leapYear);
    }
}
