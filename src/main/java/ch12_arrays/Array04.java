package ch12_arrays;

import java.util.Scanner;

public class Array04 {
    public void printName(String[] names){
        for (int i = 0; i<names.length; i++){
            System.out.print(names[i]+" / ");
        }
    }

    public void printName(int[] names){
        for (int i = 0; i<names.length; i++){
            System.out.print(names[i]+" / ");
        }
    }

    public void writeNames(String[] names){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < names.length; i++){
            names[i] = scanner.nextLine();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in );
        Array04 array04 = new Array04();

        System.out.print("몇명 학생 :");
        int numOfStudents = 0;
        numOfStudents = scanner.nextInt();
        String [] names = new String[numOfStudents];
        array04.writeNames(names);

        array04.printName(names);
        String[] strArr01 = {"dd","ss"};
        array04.printName(strArr01);
        int[] intArr01  = {3,5,6};
        array04.printName(intArr01);
    }

}
