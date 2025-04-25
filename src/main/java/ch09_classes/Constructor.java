package ch09_classes;
/*
    생성자
        :객체가 생성될 때 호출되는 '특별한' 메서드
    클래스명 객체명 = new 클래스 명();
    ClassExample example = new ClassExample();
    ClassExample(); <-- 요녀석이 생성자

    특징
        1. 클래스 이름과 생성자 이름이 동일
            (다른 메서드와 달리 대문자로 시작/ 명사일 확ㄹ률 높음)
        2. 리턴 값 없음
        3. 객체 초기화 : 생성자는 객체의 필드 초기화를 당담한다.

        생성자 정의 방식
            1. 기본 생성자 : 매개변수 없은 생성자 (클래스 생성시 default 값으로 생성되어 따로 정의하지 않는 경우 있음
            2. 매개변수 생성자 : 하나 이상의 매개변수 갖는 생성자
*/
public class Constructor {
    int num;
    String name;

    // 기본 생성자 정의하면 해당 형태
    Constructor(){
        System.out.println( "기본생성자를 통해 객체 생성됨");
        System.out.println("NoArgsConstructor");
    }
    Constructor(int num){
        System.out.println("int 매개변수를 필수로 요구하는 생성자 객체 생성" );
        System.out.println("RequiredArgsConstructor");
        this.num = num; // argument로 받은 int 자료형의 데이터를 이 클래스의 필드인 num에 대입한다는 의미
        //this 는 해당 클래스에서 객체 생성하며 ㄴ객체 이름으로 대체되는 임시적 이름
    };
    Constructor(String title){
        this.name = title;
        System.out.println("String 매개변수를 필수로 요구하는 생성자로 객체 생성");
        System.out.println("RequiredArgsConstructor");
    }
    Constructor(int num, String name ){
        this.name = name;
        this.num = num;
    }
    void displayInfo(){
        System.out.println();
    }
}
