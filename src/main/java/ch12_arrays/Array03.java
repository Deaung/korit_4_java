package ch12_arrays;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        String[] names = new String[4];

        for (int i = 0; i < names.length ; i++){
            names[i] = scanner.nextLine();
            System.out.println(names[i]);
        }
        for (int i = 0; i<names.length; i++){
            System.out.print(i+1+"번째 학생 출력 : "+names[i]+" ");
        }

    }
}
