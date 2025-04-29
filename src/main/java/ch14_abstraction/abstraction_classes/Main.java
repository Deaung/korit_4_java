package ch14_abstraction.abstraction_classes;

public class Main {
    public static void main(String[] args) {
        // PhoneFactory 객체 생성
        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.setName("스마트폰 공장");    // 부모 메서드 사용
        phoneFactory.produce("아이폰17");  // 재정의된 메서드 추상메서드
        phoneFactory.manage();                  // 재정의된 메서드 추상메서드
        phoneFactory.displayInfo();             // 부모 메서드

        Factory factory = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 ["+ model +"] 을 생성합니다.");
            }

            @Override
            public void manage() {
                System.out.println("가전제품 공장을 관리합니다.");
            }
        }; // 추상 메서드를 메인 단계에서 구현, 그리고 객체 생성을 한 상태
        // 그렇다면 일반적인 클래스를 기준으로 봤을 때 메서드를 정의한 부분까지 작성한거라 볼 수 있음
        factory.setName("가전제품 공장");
        factory.produce("백색가전");
        /*
            이상의 개념은 추상클래스 개념에서 벗어남
            java에서 도입된 익명 클래스 라는 개념
            재사용 후 한번 사용후 지울 예정이변
         */
        PhoneFactory phoneFactory1  = new PhoneFactory();
        phoneFactory1.setName("스마트폰 공장");

        TabletFactory tabletFactory = new TabletFactory();
        tabletFactory.produce("아이패드 미니 6세대");
        tabletFactory.setName("태블릿 공장");
        tabletFactory.manage();
        tabletFactory.upgrade("아이패드 미니 7세대");

    }
}
