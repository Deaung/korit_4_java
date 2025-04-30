package ch19_generic;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date(); // Java 내장 클래스로 객체 생성

        ResponseData<String> responseData = new ResponseData<>("날짜 저장 성공 ", now.toString());
        //<T> 는 클래스를 받기 때문에 기본자료형 불가
        ResponseData<Integer> responseData1 = new ResponseData<>("나이저장 성공 ",38);
        ResponseData<Date> responseData2 = new ResponseData<>("날씨 객체 저장 성공 ",now);

        System.out.println(responseData);
        System.out.println(responseData1);
        System.out.println(responseData2);
    }
}
