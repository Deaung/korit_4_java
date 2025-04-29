package ch14_abstraction.abstraction_classes;

public abstract class Factory {
    //필드선언
    private String name;

    // 메서드 정의
    public abstract void produce(String model);
    public abstract void manage();
    // 메서드 본문 - 구현부
    // abstract  메서드 접근지정자 , 리턴타입 사이에 있음
    // abstract 설정시 클래스도 자동으로 추상으로 바뀜
    // 추상클래스 내부에 일반 메서드 가능
    public void displayInfo(){
        System.out.println("공장 정보 출력\n 공장이름"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
