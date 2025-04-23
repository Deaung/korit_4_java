package ch07_loops;
/*
    while 반복문
    형식:
    while(조건식){
        반복실행문
        }
        while 뒤에 나오는( 조건식) 을 봤을 때 if 형태와 유사
        while 뒤 조건문이 true 일때 {} 내부의 실행문이 반복 실행 된다는 뜻

        그래서 미리 특정시점에 false가 되도록 설정해야함
        false 지정 안하면 무한이 반복되기에 주의
 */
public class Loop01 {
    public static void main(String[] args) {
//        int i = 0;
//        while (i<100){
////            i++;
////            System.out.println(i);
//            System.out.println(++i);
//        }
//        int j = 0;
//        while (j<101){
//            System.out.println(j);
//            j++;
//              System.out.println(j++);
//        }
        //while 문 또한 중첩 가능
        /*
             while(조건식 1){
                반복 실행문 1a
                while(조건식2){
                    반복실행문2
                }
                반복실행문1b
            }

            while + if 또한 가능
         */

//        while (k<101){
//            sum+=k;
//            k++;
//        }
//        System.out.println(sum);

        // 1부터 100까지 중 짝수 합만 구하는 while반복문 작성
//        int q = 1;
//        int sum2 = 0;
//
//        while (q<101){
//            if (q%2 == 0){
//                sum2+=q;
//            }
//            q++;
//        }
//        System.out.println(sum2);

        // +=2를 활용해서 if 문 없이 가능
        int q2 =2;
        int sum3=0;
        while (q2<101){
            sum3+=q2;
            q2+=2;
        }
        System.out.println(sum3);
    }
}
