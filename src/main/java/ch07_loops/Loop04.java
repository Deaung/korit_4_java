package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우 명확한 횟수가 고정되어있을 때 사용하는 반복문

    형식 :
        for(시작값 ; 종료값; 증감값){
            반복 실행
        }
 */
public class Loop04 {
    public static void main(String[] args) {
//        int sum=0;
//        for (int i=0; i<101; i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        // 1부터 100까지 중 홀수 합 구하는 for 문

//        int sum = 0;
//        for (int i = 0; i < 101; i++){
//            if (i%2==1){
//                sum+=i;
//            }
//        }
//        System.out.println(sum);
//        int sum = 0;
//        for (int i=1; i<101; i+=2){
//            sum +=i;
//        }
//        System.out.println(sum);

        /*
            숫자 입력받아 1부터 n까지 더하는 반복문

            1부터 몇까지 더하겠습니까?>>> 10
            합은 55입니다,
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하겠습니까?>>");
        int num = scanner.nextInt();
        int sumNum = 0;

        for (int i = 0; i <= num; i++){
            sumNum+=i;
        }
        System.out.println("1부터 "+num+"까지의 합은 "+sumNum+"입니다.");

    }
}
