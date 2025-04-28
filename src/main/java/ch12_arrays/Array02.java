package ch12_arrays;

public class Array02 {
    public static void main(String[] args) {
        // int 배열 선언 및 초기화
        int[] intArr01 = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        // 이상의 변수 활용 배열내 element의 합 구하기
        for (int i = 0; i < intArr01.length; i++){
            sum += intArr01[i];
        }
        System.out.println(sum);

        int sumEven = 0;

        for (int i = 0; i < intArr01.length; i++){
            if (intArr01[i]%2 == 0){
                sumEven+=intArr01[i];
            }
        }
        System.out.println(sumEven);

        int[] intArr02 = new int[100];
        intArr02[0] = 100;
        intArr02[1] = 100;
        intArr02[2] = 100;
        intArr02[3] = 100;
        // intArr02에 전부 100 대입
        for (int i = 0 ; i<intArr02.length; i++){
            intArr02[i] = 100;
        }
        System.out.println(intArr02[99]);

        //1~100까지 더하기
        for (int i = 0; i < intArr02.length; i++){
            intArr02[i] = i+1;
        }

        int total = 0;
        // 이상의 변수 사용 intArr02의 모든 element 합 구하기
        for (int i = 0; i < intArr02.length; i++){
            total += intArr02[i];
        }
        System.out.println(total);




        int total3 = 0;
        // 이상의 변수 사용 intArr02에서 3으로 나누어 떨어지는 element합 구하기
        for (int i = 0; i < intArr02.length; i++){
            if (intArr02[i]%3 == 0){
                total3 +=intArr02[i];
            }
        }
        System.out.println(total3);
        // 반복문이 반복되고 있음
        total3 = 0;
        total = 0;
        for (int i = 0; i < intArr02.length; i++){
            intArr02[i] = i+2;

            total += intArr02[i];

            if (intArr02[i]%3 == 0){
                total3 +=intArr02[i];
            }
        }
    }
}
