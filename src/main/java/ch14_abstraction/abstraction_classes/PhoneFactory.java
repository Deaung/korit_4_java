package ch14_abstraction.abstraction_classes;

public class PhoneFactory extends Factory{



    @Override
    public void produce(String model) {
        System.out.println("[" +model+"] 모델 스마트폰 생성");
    }

    @Override
    public void manage() {
        System.out.println("스마트 폰 공장 관리");
    }
}
