package ch07_loops;
/*
    while(조건식 1){
                반복 실행문 1a
                while(조건식2){
                    반복실행문2
                }
                반복실행문1b
            }
 */
public class Loop02 {
    public static void main(String[] args) {
        //1일차 1교시 입니다~ 1일차 3교시 입니다 / 5일차 3교시 입니다 까지 나오도록

//        int day = 1;
//        while (day < 6){
//            int lesson = 1;
//            while (lesson < 4){
//                System.out.println(day+"일차 "+lesson+"교시");
//                lesson++;
//            }
//            day++;
//        }
        /*
        2단~9단까지
     */

        int dan = 2;
        while (dan <10){
            int base = 1;
            while (base<10){
                System.out.println(dan+"x"+base+"="+ dan*base);
                base++;
            }
            dan++;
        }
    }
}
