package ch07_loops;
/*
    for(int i= 0; i<10; i++){
        (반복 실행문 1-a)
        for(int j = 0; j<10; j++){
        실행문 2
        }
        (반복 실행문 1-b)
        for(int k = 0; k<10; k++){
        실행문 3
        }
        (반복 실행문 1-c)
    }
 */

public class Loop06 {
    public static void main(String[] args) {
        for (int i= 0; i<5; i++){
            for (int j = 0; j<i; j++){
                System.out.print("*");// 한줄에 여러번 찍힐 수 있기 때문에 ln없이
            }
            System.out.println(); // 개행 일어나는 1차 for문
        }
    }
}
