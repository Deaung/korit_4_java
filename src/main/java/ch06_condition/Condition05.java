package ch06_condition;

import java.util.Scanner;

public class Condition05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String grade;
        System.out.print("점수 입력: ");
        score = scanner.nextInt();

        if (score > 90){
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
