package ch07_loops;
/*
    공백 관련
 */
public class Loop08 {
    public static void main(String[] args) {
        //# 1 풀이
//        for (int i = 0; i<6;i++){
//            for(int j = 5; j > i;j--){
//                System.out.print("  ");
//            }
//            for (int k =0; k<i;k++){
//                System.out.print("🍥");
//            }
//            System.out.println();
//        }
        // # 2 풀이
        for (int i = 0; i<6; i++){
            for (int j = 0; j<6-i; j++){
                System.out.print("  ");
            }
            for(int k = i; k>0; k--){
                System.out.print("⭐");
            }
            System.out.println();
        }

    }
}
