package ch13_ingeritance;
/*
    super 키워드의 두가지 사용 방식
    1. super(): 부모 클래스의 생성자를 호출하는 키워드 / 기본생성자라면 ()내부에 아무 값이 없고
        매개변수 생성자라면 () 내부 매개변수 있음
    2. super.메서드명(): 부모클래스의 메서드 호출하는 키워드
 */
public class Tiger extends Animal{ // (자식)클래스명 extends (부모)
    private boolean striped;
    public Tiger() {
    }
    public Tiger(String animalName, int animalAge, boolean striped) {
        super(animalName, animalAge); // 부모 필드 부르는 생성자 키워드 super()
        this.striped = striped;     // 자식고유 필드 참조하는 기존 코드 방식
    }



    public boolean isStriped() {
        return striped;
    }

    public void setStriped(boolean striped) {
        this.striped = striped;
    }

    // 부모의 필드 사용 가능
    // 자식 클래스 만의 고유한 필드 가질수 있음


    @Override
    public void move() {
        super.move();   //md 파일에서 작성한 super 키워드
        // super는 부모 클래스의 객체를 의미
        // 즉 이상의 코드는 부모클래스인 Animal 클래스의 move() 메서드를 호출한다는 의미
        System.out.println("호랑이가 네 발로 걷습니다");
        // 재정의를 위해 실행문 추가
    }
    public void hunt(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
