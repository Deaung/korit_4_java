package ch06_condition;
/*
    if-else-if
    형식
    if(조건식1){

    }else if(조건식2){

    }else if(조건식3){

    }else{

    }
 */
public class Condition04 {
    public static void main(String[] args) {
        int point= 0;

        String userGrade = "";
        if (point>80){
            userGrade="VIP";
        }else if (point>60){
            userGrade="GOLD";
        }else if (point>40){
            userGrade="SILVER";
        }else if (point>20) {
            userGrade="BRONZE";
        }else{
            userGrade="NOMAL";
        }
        System.out.println("회원등급 :"+userGrade);
    }
}
