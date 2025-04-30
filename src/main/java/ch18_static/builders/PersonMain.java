package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        //Person 클래스 인스턴스인 person1 만든다고 가정
        // 이름= 김일/ 나이= 21 / 주소 - 서울특별시 종로구
        // Person person1 = new Person("김일", 21 , "서울특별시 종로구");
        // 라고 작성했었는데 AllArgsConstructor 가 없다면
        // 각각 다 setter 사용해서 작성했어야 함
        Person person = new Person.Builder()
                .name("김일")
                .age(21)
                .address("서울특별시 종로구")
                .build();

    }
}
