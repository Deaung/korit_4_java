package ch18_static;

import lombok.Getter;

@Getter
public class Product {


    // 필드 선언
    // static 변수
    @Getter
    private static int count = 0;

    // 인스턴스

    private int instanceCount = 0;

    public Product() {
        System.out.println("Product 클래스의 인스턴스가 생성되었습니다.");
        count++;
        instanceCount++;
    }
}