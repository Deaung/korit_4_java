package ch06_condition;
/*
    if - else 문: if 다음의 조건식이 true일 경우 {}내의 실행문 실행되지만
    false일 경우 else 이후의 {}내의 실행문 실행

    if(조건식){
        실행문
    } else{
        실행문 2
    }
 */
public class Condition02 {
    public static void main(String[] args) {
        int num1 = 0;
        if (num1 > 0){
            System.out.println("num1은 양수");
        } else {
            System.out.println("num1은 0 혹은 음수");
        }
    }
}
