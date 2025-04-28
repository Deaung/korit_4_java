package ch12_arrays;

import java.util.Arrays;

public class Array10 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        int num = 0;
        // 이상의 2차 배열에 1~ 100 까지 수 넣기
        //Arrays.deepToString(nums); 통해 출력
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = ++num;
            }
        }
        System.out.println(Arrays.deepToString(nums));

        // 향상된 for문
        for( int[] numbers : nums ) {
            for( int number : numbers ) {
                System.out.print(number + " / ");
            }
        }

        System.out.println(Arrays.deepToString(nums));


    }

}
