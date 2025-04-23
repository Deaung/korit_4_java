package ch06_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {
        // Condition05 에서의 식을 봤을때 100초과 0미만의 점수가 입력가능
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.print("점수 입력: ");
        score = scanner.nextInt();

//        문제 상황 해결 못하는 방식
//        if (score > 90){
//            grade = "A 학점";
//        } else if (score > 80) {
//            grade = "B 학점";
//        } else if (score > 70) {
//            grade = "C 학점";
//        } else if (score > 60) {
//            grade = "D 학점";
//        } else if (score <=59 ){
//            grade = "F 학점";
//        } else if (score > 100){
//            System.out.println("불가능한 점수");
//        } else if (score < 0){
//            System.out.println("불가능한 점수");
//            grade = "X";
//        }
        if (score > 100){
            grade="x";
        } else if (score <0){
            grade="x";
        } else if (score > 90){
            grade = "A 학점";
        } else if (score > 80) {
            grade = "B 학점";
        } else if (score > 70) {
            grade = "C 학점";
        } else if (score > 60) {
            grade = "D 학점";
        } else {
            grade = "F 학점";
        }

        System.out.println("당신의 점수는 "+score+"점 이고, 학점은 "+grade+"입니다.");
    }
}
