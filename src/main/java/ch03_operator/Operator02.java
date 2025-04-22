package ch03_operator;
/*
    논리 연산자
    true(1) / false (0) : 컴퓨터가 읽을 수 있는 숫자
    boolean : true / false 구분하는 자료형

    AND(&&) : 곱 연산 T x T = T / TxF = F / FxF = F  둘다 true면 true
    OR(||) : 합 연산 T + T = T / T+ F= T / F + F =F 둘중 하나라도 true 면 true
    NOT(!) true값 false, false 값 true
 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = false;
        System.out.println("----- && 연산자 -----");
        boolean result1 = flag1 && flag1;
        System.out.println("T x T = " + result1);
        boolean result2 = flag1 && flag2;
        System.out.println("T x F = " + result2);
        boolean result3 = flag2 && flag2;
        System.out.println("F x F = " + result3);

        System.out.println("----- || 연산자 -----");
        boolean result4 = flag1 || flag1;
        System.out.println("T + T = " + result4);
        boolean result5 = flag1 || flag2;
        System.out.println("T + F = " + result5);
        boolean result6 = flag2 || flag2;
        System.out.println("F + F = " + result6);

        boolean result7 = (flag1 || flag2) && flag2;
        System.out.println(result7);// false

        boolean result8 = flag1 && flag2 && flag2;
        System.out.println(result8);//false

        boolean result9 = 10 % 3 == 0;
        System.out.println(result9);


    }
}
