package ch18_static.singleton.products;

public class ProductView {

    // 자료형 ProductView 변수명 instance/ 보통 싱글톤 변수 예제가 instance
    private static ProductView instance;

    private ProductView() {
        int counter = 1;    // 지역변수
        System.out.println(counter+ " 번 째 객체가 생성되었음");
        counter++;
    }
    // 정적 메서드 정의
    public static ProductView getInstance(){
        if (instance == null){          // 현재 인스턴스가 없다명 해당 존 라
            instance= new ProductView();//Productview 의 객체가 생성
                                        //객체를 창
        }
        return instance;
    }

}
