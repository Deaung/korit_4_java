package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        Constructor constructor1 = new Constructor();
        System.out.println(constructor1.num);

        Constructor constructor2 = new Constructor(21);
        System.out.println(constructor2.num);

        Constructor constructor3 = new Constructor("김삼");
        constructor3.num= 23;

        Constructor constructor4 = new Constructor(24,"r;aepdmd");
    }
}
