package ch03_operator;
/*
    camel case - Java 변수 표기법
    snake case - Java 에서는 잘 안씀
    Pascal case - 첫 문자 대문자이고 나머지 소문자로 가다가,
                  두 번째 단어 첫 문자는 다시 대문자 작성
                  ex)OperatorTest
 */
public class Operator01 {
    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int i = 10;

        // '=' 이거 배울 예정
        /*
            대입 연산자 = : = 오른쪽의 데이터를 = 왼쪽에 있는 변수에 대입한다는 의미
                          변수와 데이터가 동일하다는 수학적 의미가 아님
         */
        int i2 = 20;
        i2 = i2 +30; // 같다고 표시하고 싶다면 '==' 를 사용

        // 일반 연산자
        /*
            +: 덧셈
            -: 뺄셈
            /: 나누기
            *: 곱셈
            %: 나머지
         */
        int a = 5;
        int b = 2;
        double result = (double) a/b;

        System.out.println(result);
        System.out.println(a%b);
    }
}
