package ch04_scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.print("이름을 입력하세요:");
//        String name = scanner.nextLine();
//        System.out.println(name);

        /*
            System.out.println(); 의 경우 실행 후 개행이 이루어짐(줄 바꿈)

            System.out.print(); 사용시 개행 안이루어짐
         */

//        System.out.print("올해는 몇 년도 인가요??");
//        int year = scanner.nextInt();
//        scanner.nextLine();
//        System.out.print("이름은??");
//        String name = scanner.nextLine();
//        System.out.println(year+"년도");
//        System.out.println("이름"+ name);

        /*
            nextLine() vs. next~~()
            nextLine()은 띄어쓰기 허용하고 enter키 누른것을 기준으로 데이터를 대입
            나머지 들은 띄어쓰기 허용하지 않고 사용됨

            이상을 이유로 next~~()를 먼저 사용후 nextLine()사용시 문제 발생

            next~~() 다음 enter 입력시 다음줄의 nextLine()이 enter가 입력된 것으로 보고
            아무런 값도 받지 않은 상태로 넘어가는 현상 발생

            문제 상황을 해결하기 위한 방법 :
            nextLine()이 미리 enter 입력을 받아들여 name 이 아무런 값도 받지 않은채 출력됨

            -> enter를 받아주는 것이 있으면 됨

            선언된 변수의 자료형에 따라 scanner.next~~(); 가 자동생성됨
         */

//       double doubleNum = scanner.nextDouble();
//        String univ = scanner.next();
//        System.out.println(univ);
        // String 자료형 사용시 .next(); .nextLine();사용 가능 Line만 띄어쓰기 가능

//        System.out.println("키를 입력");
//        double height = scanner.nextDouble();
//        System.out.println(height);

        /*
            나이 입력
            저는 올해 ~~살입니다
            내년에는 ~~살 입니다
         */
//        System.out.print("나이를 입력하세요 >>> ");
//        int age = scanner.nextInt();
//        System.out.println("저는 올해 " + age + "살 입니다");
//        System.out.println("내년에는 " + (age+1) + "살 입니다.");

        System.out.print("점수를 입력하세요>>>");
        double score = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("이름을 입력하세요>>>");
        String name = scanner.nextLine();//.next();로 작성시 위의 scanner.nextLine();이 필요없음
        System.out.println(name+" 학생의 점수는"+score+"점 입니다.");

    }
}
