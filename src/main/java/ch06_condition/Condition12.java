package ch06_condition;

import java.util.Scanner;

/*
    Condition 07 파일 확인시
    점수를 입력받아 등급을 산출했었음
    이를 응용하여 중첩 if문 + switch문 형태로 프로그램 작성

    사용자에게 score 입력 받아 사용
    changedScore = 9~10 =>A
    changedScore = 8 =>B
    changedScore = 7 =>C
    changedScore = 6 =>d
    changedScore = 5,4,3,2,1 =>F

    changedScore = score/10

 */
public class Condition12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int score = scanner.nextInt();
        int changedScore = score/10;
        String grade = "";

        if(changedScore>10 || changedScore<0){
            System.out.println("입력 오류");
        }else {
            switch (changedScore){
                case 10,9:
                    grade = "A학점";
                    break;
                case 8:
                    grade = "B학점";
                    break;
                case 7:
                    grade = "C학점";
                    break;
                case 6:
                    grade = "D학점";
                    break;
                default:
                    grade = "F학점";
            }
        }
        System.out.println("점수는 "+score+"점 이고, 학점은 "+grade+"입니다.");




    }
}
