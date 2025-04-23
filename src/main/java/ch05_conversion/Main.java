package ch05_conversion;

public class Main {
    public static void main(String[] args) {
        //1. upcasting(업캐스팅) : 더 큰 용량의 자료형으로 변환하는것

        char cast1 = 'A';
        System.out.println("원형 : " + cast1);
        //업 캐스팅 방법 #1
        // 형변환을 위해서는 '(바꿀 타입)변수명'으로 작성
        System.out.println("변형 : " +(int)cast1); // 65 출력

        char cast2 = 'a';
        System.out.println("원형 : " + cast2);
        System.out.println("변형 : " +(int)cast2); // 97 출력 대문자,소문자 a는 외워두는게 좋음

        // 업캐스팅방법2
        char cast3 = 'b';

        int casted3 = cast3;
        System.out.println("원형 :"+cast3);
        System.out.println("변형 :"+casted3 );

        // 다운캐스팅
        int cast4 = 99;
        int cast5 = 100;
        char casted4 = (char)cast4;
        char casted5 = (char)cast5;
        System.out.println("원형 : "+cast4+cast5);
        System.out.println("변형 : "+casted4+casted5);
        /*
            이후 수업에서 적용될 개념인데 업캐스팅의 경우 메모리 용량이 커지기만 하면 되니
            기존데이터의 변형이 일어나지 않아 암시적으로 가능
            하지만, 다운캐스팅 의 경우 데이터 축소 과정에서 손실이 발생할 수 있기 때문에 명시해야지만 변형 가능
         */
    }
}
