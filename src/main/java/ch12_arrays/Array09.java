package ch12_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Array09 {
    public static void main(String[] args) {
        // 배열 정렬
        Integer[] nums  = {8,5,4,1,6,7,10,2,9,3};

        System.out.println(Arrays.toString(nums));
        //오름 차순으로 정렬
        Arrays.sort(nums); // 배열의 오름차순 정렬
        // 원본 배열인 nums를 다 바꿔버렸다는 의미로 해석 가능
        System.out.println(Arrays.toString(nums));
        for (int num : nums){
            System.out.print(num+"  ");
        }
        // 내림차순
        Arrays.sort(nums, Comparator.reverseOrder());
        System.out.println(Arrays.toString(nums));

        // int != Integer
        // int는 기본자료형에 해당, primitive type
        // Integer 는 정수 관련한 field 및 method  들 모아둔 class 에 해당
        // char 자료형들의 특징을 모아 field/method 들 정의 해둔것이 String 이라는 class

    }
}
