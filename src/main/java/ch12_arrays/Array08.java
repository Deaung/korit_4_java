package ch12_arrays;

import java.util.Arrays;

public class Array08 {
    public static void main(String[] args) {
        String [] students = {"김일","김이","김삼"};

        double[][] scores = {
                {100.0,96.4},
                {64.2,79.3},
                {48.1,99.8},
                {80.2,4.5}
        };

/*
        배열의 출력
        sout 형태로 배열 출력하게 되ㅏ면 참조변수이기 때문에 주소값만 출력됨
        반복문을 ㅌㅇ해 element 불러오기 가능

        Arrays 클래스 사용 정적 메서드.toString(배열명) 을 사용해서 배열 전체 출력 가능

        클래스명.메서드명 으로 호출한다는거 중요

        클래스명.메서드명은 처음
        .toString() 라는 메서드 역시 추후 수업 예정
 */
        //1차배열 출력
        System.out.println(Arrays.toString(students));
        //2차 배열 출력
        System.out.println(Arrays.deepToString(scores));

    }
}
