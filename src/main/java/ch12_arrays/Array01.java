package ch12_arrays;

public class Array01 {
    public static void main(String[] args) {
        // 배열 선언 방식
        //1. 자료형[] 배열명 = {값1,값2,...값n};
        int [] arr1 = {1,2,3,4,5};
        // 값 1,... 값n : element/ elem1 = 0;

        // 2. 빈 배열 선언 하고 추후 값을 대입
        String [] arr2 = new String[4]; // 방 네개짜리 빈 배열
        arr2[0]="김영";
        arr2[1]="김일";
        arr2[2]="김이";
        arr2[3]="김삼";

        System.out.println(arr1);
        System.out.println(arr2); // 생각한대로 출력 안됨

        // 배열의 elements 출력 방법
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        // []안의 수만 바꾸면 될듯

        for (int i = 0; i < 4 ; i++){
            System.out.print(arr2[i] + " ");
        }

        // 역순으로 출력하려면??
        for ( int i = arr1.length -1 ; i > -1 ; i--){
            System.out.print(arr1[i]);
        }

        // arr1 에 각 값에 2씩 더하고 싶다면??
        System.out.println();
        for (int i = 0 ; i < arr1.length ; i++){
            arr1[i] = arr1[i] + 2;
            System.out.println(arr1[i]);
        }
        System.out.println("-----");
        System.out.println(arr1.length);
        System.out.print(arr2.length);
        // 배열명.length   ->  int 값 리턴
        // 객체명.속성명 과 동일

        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+"/");
        }
        //md 파일에 정리한 대로라면 String은 참조변수이고 참조변수를 모아 다시 배열 만들었다는 점


    }
}
