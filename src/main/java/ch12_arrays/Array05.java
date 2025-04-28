package ch12_arrays;

public class Array05 {
    public static void main(String[] args) {
        String[] scores = {"A", "B", "C","D", "F"};

        for (int i = 0 ; i < scores.length-1; i++){
            scores[i]+="+";
            System.out.println("점수 :"+scores[i]);
        }



    }
}
