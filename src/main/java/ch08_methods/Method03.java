package ch08_methods;

import java.util.Scanner;

public class Method03 {

    public static void main(String[] args) {

        calculateAvgScore();

    }
    public static void calculateAvgScore(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avgScore = 0;

        int numOfSubs =0;

        System.out.print("과목 갯수 : ");
        numOfSubs = scanner.nextInt();

        for (int i = 0; i<numOfSubs; i++) {
            System.out.println((i + 1 )+ " 과목의 점수");
            sum += scanner.nextDouble();

        }

        avgScore = sum / numOfSubs;
        System.out.println("총합:"+sum+"점 이며, 평균은"+avgScore+"입니다.");
    }

}
