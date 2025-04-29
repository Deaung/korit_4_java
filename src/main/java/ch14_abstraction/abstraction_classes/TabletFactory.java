package ch14_abstraction.abstraction_classes;
/*
 Factory 상속
 오류 해결
 해당 클래스 고유 메서드인 upgrade 정의
 메인으로 이동하여 tabletFactory 객체 생성 후 애플 태블릿 공장으로 이름 붙일것
 produce(),manage 메서드 태블링 공장에 맞게 수정
 produce()호출
 manage()호출
 upgrade 호출

 */
public class TabletFactory extends Factory{

    @Override
    public void produce(String model) {
        System.out.println("["+model+"] 태블릿 생성");
    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장 관리");
    }
    public void upgrade(String upgrade){
        System.out.println(upgrade+"로 업그레이드합니다.");
    }
}
