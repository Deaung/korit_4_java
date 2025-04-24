package ch09_classes;

public class Car {

    String color;
    int maxSpeed;

    public void drive(){
        System.out.println(
                color+" 자동차가 주행중입니다.\n 최고속도는 "+maxSpeed+"입니다.");
    }

    public void brake(){
        System.out.println(color+" 자동차가 멈췄습니다");
    }

    public void displayCarInfo(){
        String result = "";
        if(maxSpeed>100){
            result = "빠릅니다";
        }else{
            result = "평범합니다";
        }
        System.out.println(
                "자동차의 색은 "+color+"이고 \n최고 속도는 "
                        +maxSpeed+"km/h 입니다. 차량속도가 "+result);
    }
}
