package ch02_variable;
/*
    주석(comment) : JAVA 프로그램의 경우 폴더 및 파일의 전체 코드를 컴파일링 하는데,
    거기서 오류가 하나라도 발생하면 프로그램 실행 안됨
    하지만 주석처리한 부분은 컴퓨터가 인식 안해서 오류 발생 안함

    주석은 컴퓨터가 읽는것이 아닌 사람이 읽어서 정보 얻는것에 의의가 있음

    1) 한줄 주석 : //
    2) 다중 주석 : / + * +enter
    3) 사후 주석 : 주석 처리부분 드래그 후 ctrl+/
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
//        System.out.println(안녕하세요);
        System.out.println(1);              //결과 1
        System.out.println("1");            //1
        System.out.println(1+2);            //3
        System.out.println("1+2");          //1+2
        System.out.println("1"+"2");        //12
        System.out.println("1"+2);          //12

        // 이상과 같은 방식의 코드 대입을 하드코딩이라고 함
        // 명령무에 데이터(변수에 저장되지 않은 데이터 리터럴) 를 바로 집어넣는것
        // 데이터를 변수에 대입하고 변수를 통해 명령 내리는 것 권장됨.

        /*
            변수 (variable) : 데이터를 담는  바구니 -> 이름표 달아야함
            변수선언 방법 :
                 자료형 변수명 = 데이터;
         */

        int scoreEnglish = 100;
        System.out.println(scoreEnglish);

        String introduction = "안녕하세요. 저는";
        System.out.println(introduction+ "잘부탁드립니다.");

        // 변수의 의미에 주목해 보면 데이터  값 바뀔수 있음
        scoreEnglish = 90;
        System.out.println(scoreEnglish);

        /*
            자료형
                1. 논리 자료형 boolean 변수 : true, false
         */
        // 자료형 변수명 = 데이터; <- 변수의 선언ㄴ 밎 초기화
        boolean checkFlag1 = false;
        // 변수에 재 대입
        checkFlag1 = true;
        boolean checkFlag2;
        checkFlag2 = true;

        checkFlag2= false;

        // 문자열 자료형 변수 char

        char name1 ='김';
        char name2 ='대';
        char name3 ='웅';

        //char는 문자/ string 은 문자열
        System.out.println(name1+name2+name3); //151512
        System.out.println(""+name1+name2+name3); // 안안안

        /*
            이상의 코드에서 알수 있는 점은 컴퓨터의 동작을 하나하나 지정을 해줘야 한다는 점
            문자와 문자열은 다른 개념인데 문자 하나를 더할경우 문자가 아닌 문자열로 인식되어 원하는 방식으로 출력 안됨

            그렇게 때문에 () 안에 ""를 넣어줌으로 전체적으로 문자열로 인식시켰음

            sout()에서 가장 먼저 나온 자료형 따라감
         */
        System.out.println("123"+1);
        System.out.println(123+"1");

        // 정수 자료형 int
        int width1 = 100;
        int width2 = 200;

        System.out.println(width1+width2); // 숫자끼리는 연산이 가능

        String width3 = "300";
        String width4 = "400";

        System.out.println(width3+width4); // 문자열은 연산 안되고 나열함 순서에 따라 다르게 나옴
        System.out.println(width4+width3);

        // 실수 자료형 변수 double
        double pi = 3.1415926;
//        int pi2 = 3.14;
        // 사칙연산 (+ - / *)
        // pi 변수 이용하여 원 반지름 43인 원의 둘레 및 넓이 구하세요

        // 원의 둘레 공식 : 지름 * pi
        // 원의 너비 공식 : 반지름 제곱 * pi

        System.out.println(43 * 2 * pi);
        System.out.println(43 * 43 * pi);

        /*
            Java 에서의 변수 표기 방식 :
                1. 카멜 표기법(camel case)
                    : 첫 문자 소문자 시작/ 복수 단어로 이루어진 경우
                    두번째 단어 첫번째 문자만 대문자
                2. 특수문자 지양
                    :
         */

        // 문자열 자료형 String
        // 주의 : 이거만 대문자 인데 자중에 머리아픈 일 생길 예정
        String name = "김대웅";
        String major = "자동차 정비";
        String currentJob = "무직";
        String previousJob = "정비사";

        System.out.println(name);
        System.out.println(major);
        System.out.println(currentJob);
        System.out.println(previousJob);
        // 가능

        System.out.println(
                "안녕하세요 " + name + "라고 합니다." + major +
                        " 를 전공했고 예전직업은 " + previousJob + " " +
                        "현재는 " + currentJob + " 입니다"
                );//이거도 가능

        String name4 = "김대웅";
        String major4 = "자동차 정비";
        String mbti4 = "모릅니다";
        int age4 = 25;

        System.out.println(
                "저는 코리아 IT 아카데미 4월 국비 과정을 수강하고있는 " + name4 +
                        "입니다. 나이는 " + age4 + "살이고, 제 전공은 " + major4 +
                        "이며 mbti는 " + mbti4 + " 열심히 하겠습니다."
                );
        // ch03_operator 패키지 생성 Operator01 클래스 생성 main 메서드 적용

    }
}
