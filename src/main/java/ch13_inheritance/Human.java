package ch13_inheritance;
/*
    1. Animal 클래스 상속 받기
    2. 기본생성자 이용하여 main 에서 human1 객체 생성하기
        기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다 호출
    3. setter 활용하여 animalName에 이름. 나이 입력
    4. getter 재정의 하여 getAnimalName
        안녕하세요. 제 이름은 ___ 입니다 로 출력하기
    5. getter 재정의 하여 getAnimalAge
        올해 제 나이는 n 살입니다 내년에는 n+1 살이 됩니다
    6. move() 메서드 재정의 하여
        사람이 두발로 걷습니다 라고 출력 하기
    7. Human 클래스의고유 메서드인 read() 메서드 call2 유형으로 정의
        human1.read("자바의 기초") 라고 출력시
        이름+ 자바의 기초 읽는 중입니다 라고 출력하기

 */
public class Human extends Animal{
    public Human() {
        System.out.println("기본생성자를 통해 Human 클래스의 인스턴스가 생성되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다.");
    }

    @Override
    public String getAnimalName() {
        return "안녕하세요. 제 이름은"+super.getAnimalName()+"입니다.";
    }

    @Override
    public int getAnimalAge() {
        System.out.println("올해 제 나이는"+super.getAnimalAge()+"입니다. 내년에는"+(super.getAnimalAge()+1)+"살이 됩니다");
        return super.getAnimalAge();
    }

    public void read(String book){
        System.out.println(super.getAnimalName()+"이 "+book+"를 읽는 중입니다.");
    }

}
