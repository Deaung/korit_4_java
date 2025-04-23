package ch06_condition;

import java.util.Scanner;

/*
    중첩 if 문
        if 문 내에 if 문 연속 작성될 수 있음

        형식 :
            if(조건식 1){
                실행문1
                if(조건식1a){
                실행문 1a
                } else if(1b){
                실행문 1b
                } else{
                실행문 1c
                }
            }else if(조건식2){
               실행문2
                if(조건식2a){
                실행문 2a
                } else if(2b){
                실행문 2b
                } else{
                실행문 2c
                }
            }else{
                실행문3
                if(조건식3a){
                실행문3a
                }
            }
 */
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.print("점수 입력:");
        score = scanner.nextInt();

        if (score >100 || score < 0){
            System.out.println("불가능한 점수 입력");
            grade = "x";
        } else {
            if (score > 89){
                grade = "A 학점";
            } else if (score > 79) {
                grade = "B 학점";
            } else if (score > 69) {
                grade = "C 학점";
            } else if (score > 59) {
                grade = "D 학점";
            } else {
                grade = "F 학점";
            }
        }
        System.out.println("당신의 점수는 "+score+"점 이고, 학점은 "+grade+"입니다.");

    }
}
