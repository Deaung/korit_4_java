package ch06_condition;

import java.util.Scanner;

/*
    윤년 계산기
    윤년(leap year) 은 특정 조건을 만족하는 년을 의미

    판단하는 규칙은
    1.연도가 4로 나누어 떨어지는 해는 윤년일 수도 있음
    2. 그러나 100으로 나누어 떨어지면 윤년아님
    3. 100으로 나누어 떨어지긴 하지만 400으로도 나누어 떨어지면 윤년

    ex)
    2020년은 4로 나누어 떨어지므로 윤년
    1900년은 100으로 나누어 떨어지므로 윤년 아님/400으로 안됨
    2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기에 윤년
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.print("연도를 입력");
        year = scanner.nextInt();



//            if (year % 400 == 0){
//                System.out.println(year+"년은 윤년");
//            } else if (year % 100 == 0){
//                System.out.println(year+"년은 윤년아님");
//            } else if (year % 4 == 0) {
//                System.out.println(year+"년은 윤년");
//            } else {
//                System.out.println(year+"년은 윤년아님");
//            }

        String leapYear = "";

        if (year % 400 == 0){
            leapYear = "윤년";
        } else if (year % 100 == 0){
            leapYear = "윤년아님";
        } else if (year % 4 == 0) {
            leapYear = "윤년";
        } else {
            leapYear = "윤년아님";
        }

        System.out.println(year+"년은"+leapYear);



    }
}
