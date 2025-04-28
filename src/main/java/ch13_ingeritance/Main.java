package ch13_ingeritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAnimalName("고양이");
        animal.setAnimalAge(1);
        animal.move();

        Tiger tiger = new Tiger();
        tiger.setAnimalName("호랑이");
        tiger.setAnimalAge(3);
        tiger.move();
        tiger.hunt();
        tiger.setStriped(true);
        // animal.hunt(); <- 사용 불가 부모는 자식클래스 메서드 사용불가
        Human human = new Human();
        human.move();
        human.setAnimalName("김대웅");
        System.out.println(human.getAnimalName());
        human.setAnimalAge(25);
        human.getAnimalAge();
        human.read("자바의 기초");

    }
}
