package ch08_methods;

import java.util.Scanner;

public class Method04 {
    public static void calculateBmi(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("키(cm)를 입력:");
        double height = scanner.nextDouble()/100;
//        double calcHeight = height/100;
        System.out.print("몸무게(kg) 입력 :");
        double weight = scanner.nextDouble();

        double bmi = weight / (height*height);

        String result = "";

        if(bmi>25){
            result = "비만";
        }else if (bmi>23){
            result = "과체중";
        }else if (bmi>18.5){
            result = "정상";
        }else {
            result = "저체중";
        }

        System.out.println("Bmi 지수는"+bmi+"이고,"+result+"입니다.");
    }
    public static void main(String[] args) {
        calculateBmi();
    }
}
