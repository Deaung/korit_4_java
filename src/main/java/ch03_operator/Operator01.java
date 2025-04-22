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
//        int i = 10;

        // '=' 이거 배울 예정
        /*
            대입 연산자 = : = 오른쪽의 데이터를 = 왼쪽에 있는 변수에 대입한다는 의미
                          변수와 데이터가 동일하다는 수학적 의미가 아님
//         */
//        int i2 = 20;
//        i2 = i2 +30; // 같다고 표시하고 싶다면 '==' 를 사용

        // 일반 연산자
        /*
            +: 덧셈
            -: 뺄셈
            /: 나누기
            *: 곱셈
            %: 나머지
         */
//        int a = 5;
//        int b = 2;
//        double result = (double) a/b;
//
//        System.out.println(result);
//        System.out.println(a%b);

        /*
            복합대입 연산자
            1) +=
            2) -=
            3) /=
            4) *=

         */
//        int num1 = 1;
//        System.out.println(num1);
//
//        num1 += 2;  //num1 = num1 + 2; 라는 뜻
//        System.out.println(num1);
//        num1 -= 1;
//        System.out.println(num1);
//        num1 *= 10;
//        System.out.println(num1);
//        num1 /= 5;
//        System.out.println(num1);

//        int j = 10;
//        System.out.println(j);
//        System.out.println(j++); // 변수명 ++ : 코드 실행 후 j에 1더함
//        System.out.println(j);  // 이전 코드에서 1 더해진 상태이기 때문에 11 출력
//        System.out.println(++j); //++ 적용 후 j 출력 12 가 출력됨
//        System.out.println(j); // 12 출력
//        System.out.println(j--); // j 출력 실행 후 -- 적용
//        System.out.println(j); // 이전코드에서 -- 적용되었기 때문에 11 출력
//        System.out.println(--j);// --적용 후 j 출력이기 때문에 10 출력

        int age = 10;
        System.out.println("나이는 "+ age + "살 입니다.");
        System.out.println("나이는 "+ (age + 1) + "살 입니다.");
        //


    }
}
