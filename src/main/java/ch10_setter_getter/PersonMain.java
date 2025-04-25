package ch10_setter_getter;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("김일");
        person.setAge(243);
        person.setAge(21);

        person.showInfo();

        Person person1 = new Person("이이",32);
//        person1.name="강이"; Person.java의 속성에 private 지정시 오류 발생
        person1.setName("최이");
//        System.out.println(person1.name);
        System.out.println(person1.getName());

        /*
            call1()   call2() 유형 리턴 없는 대신 콘솔창에 출력하기 위해 메서드 내
            System.out.print() 구현할 필요 있음
            이상의 경우 main 단계에서 메서드 호출을 하기만 하면 콘솔에  출력되지만
            데이터의 가공 어렵다는 단점 있음
         */
        //~~님 반갑습니다 /@@님 반갑습니다
        System.out.println(person1.getName()+" 님 반갑습니다");
        System.out.println(person1.getName()+" 님 반갑습니다");
    }
}
