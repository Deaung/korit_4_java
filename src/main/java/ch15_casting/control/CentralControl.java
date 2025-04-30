package ch15_casting.control;
// LED 클래스 / Mouse 클래스 생성  메서드 구현부 적절히 완성
public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    // Main 에서 확인결과 바로 element가 있는 배열을 집어넣지는 못함
    // Power 의 자식클래스의 인스턴스 들을 집어넣는 메서드 정의

    public void addDevice(Power device){
        // 왜 매개변수 자료형이 Power 인지도 생각
        // Computer/ LED / Mouse 에 해당하는 객체들을 신경쓰지 않고 넣기 위해
        // 어차피 암시적 업캐스팅 되기 때문에
        int emptyIndex = checkEmpty();

        if (emptyIndex == -1){
            System.out.println(" 더 이상 장치 연결 할 수 없음 ");
            return;
        }
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName()+ " 장치가 연결 되었습니다");
        /*
            객체명.getClass() - 주소값 없이 출력
            객체명.getClass().getSimpleName() = 패키지명 , 주소값 없이 클래스명 만 반환
            특히 바로위 라인의 경우 메서드 체이닝 이라는 표현으로 사용됨
         */
    }

    private int checkEmpty(){ //비어있는 index number 반환하기위한 메서드
        // 배열 반복문으로 돌려서 null 값 빠져나오는 것 return
        // 이상의 경우 가장 빨리 만나게 될 null 의 index number가 반환
        for (int i= 0; i< deviceArray.length; i++){
            if (deviceArray[i] == null){
                return i;
            }
        }

        return -1;
        /*
            Java 에서는 index 넘버에는 음수값이 없기 때문에
            실패를 나타낼 때 -1 사용하는 경우 있음
            그런데 0 과 너무 가깝기 때문에 -100 을 사용하던가 return 값으로 나올수 없는 음수 지정하는 경우 있음
            나중에 addDevice() 메서드에 if(checkEmpty() == -12312) 이런식으로 쓰는거보다 -1이 보기좋음
         */
    }
    public void powerOn(){
            // deviceArray 배열 내 있는 각 element 들은 Power 서브클래스의 인스턴스에 해당
            // .on()/.off() 전부 가지고 있을 것이고 instanceof 사용 안해도 됨
        for (Power device : deviceArray){
            if (device == null){
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            device.on();
        }
    }
    public void powerOff(){

        for (int i = 0; i < deviceArray.length; i++){
            if (deviceArray[i] == null){
                System.out.println("장치가 등록되지 않은 슬롯입니다.");
                continue;
            }
            deviceArray[i].off();
        }
    }



}