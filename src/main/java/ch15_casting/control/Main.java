package ch15_casting.control;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Computer computer = new Computer();
        LED led = new LED();
        Mouse mouse = new Mouse();
        CentralControl centralControl = new CentralControl(new Power[5]);
        // 배열 생성 방법 5개 짜리 사이즈 배열 CentralControl 생성자 argument로
        // 생성자의 argument 로 빈 배열을 집어넣는게 가능하지만 바로 집어넣는거는 안됨`
//        Power[] powers = {computer, led, mouse};
//        CentralControl centralControl1 = new CentralControl(powers);
        // 배열 미리 생성 후 생성한 배열을 argument에 넣는것은 가능했음
        // 미리 배열 생성시에는 Default 값으로 등록되어있다고 봐야하기 때문에 처음 선언한 방식으로 진행

        centralControl.addDevice(computer);
        centralControl.addDevice(led);
        centralControl.addDevice(mouse);
        centralControl.powerOn();
        centralControl.powerOff();

//      System.out.println(centralControl.checkEmpty()); // 결과 1
    }
}
