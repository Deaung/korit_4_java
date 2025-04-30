package ch18_static.builders;

public class Person {
    private String name;
    private int age;
    private String address;

    private Person(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        private String name;
        private int age;
        private String address;
        // Builder 패턴 메서드 정의시 필드 이름과 동일하게 작성
        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
