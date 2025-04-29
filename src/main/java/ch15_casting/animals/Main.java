package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        dog.fetch();

        Animal animal = new Dog();// 방법 1 / A a = new B();

        animal.makeSound(); // 결과값은 Dog 에서 재정의한 내용으로 출력

        Animal animal1 = dog; //방법 2// 위에서 생성한 dog 객체를 animal1에 대입

        animal1.makeSound(); // 마찬가지로 Dog 에서 정의한 내용으로 출력됨

        // instanceof 관련
        boolean result1 = animal1 instanceof Animal;
        System.out.println(result1);    // true
        boolean result2 = animal1 instanceof Dog;
        System.out.println(result2);    // true
        // instanceof의 결과값이 true : 확인하고자 하는 object가 해당 클래싀의 인스턴스 이거나 '하위클래스'의 인스턴스 일때
        boolean result3 = dog instanceof Dog;
        System.out.println(result3);    //true
        boolean result4 = dog instanceof Animal;
        System.out.println(result4);    //true

        System.out.println();
        Animal animal2 = new Animal();
        boolean result5 = animal2 instanceof Animal;
        System.out.println(result5);    // true
        boolean result6 = animal2 instanceof Dog;
        System.out.println(result6);    // false

        System.out.println("↑ 업캐스팅 관련");
        System.out.println("↓ 다운캐스팅 관련");

        /*
            업캐스팅은 암시적으로 이루어짐 = 코드보고 아 업캐스팅 일어났구나 하고 생각

            (클래스명) 객체명; 과 같이 다운캐스팅은 명시적으로 이루어짐
            -> (int)2.3; 과 같은 방식으로
         */
        Dog dog1 = (Dog) animal1;
        dog1.fetch();
        dog1.makeSound();

        ((Dog) animal1).fetch(); // 44번 라인있기 때문에 자동완성으로 다운캐스팅 실행
        animal1.makeSound();

        Dog dog2 = (Dog) animal2;
        dog2.makeSound();
        /*
            51번 실행 시 오류 발생
                원인 :
                    애초에 animal2 생성시 new Animal(); 로 생성했기 때문에 다운캐스팅 불가
                즉 다운캐스팅의 조건은
                A a = new B(); 에서 출발

            지금 경우의 수가 animal** 이라는 객체가 있을때 그것이 Animal() 생성자로 생성되었는지
            Dog()로 생성 되었는지에 따라 오류가 발생하는 상황
         */
        Animal animal3 = new Dog();
        System.out.println();
        if (animal3 instanceof Dog){ // 이게 true면 animal3객체는 Animal animal3 = new Dog();
            Dog dog3 = (Dog) animal3; // 다운캐스팅 가능

            dog3.makeSound();
            dog3.fetch();
        }

        System.out.println();
        if (animal2 instanceof Dog){
//            Dog dog2 = (Dog) animal2;

            dog2.fetch();
            dog2.makeSound();
        }else {
            System.out.println("다운캐스팅 불가");
        }


    }
}
