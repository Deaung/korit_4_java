package ch14_abstraction.abstraction_classes.interfaces;

public interface Press {
    String NAME = "button";
//    interface 이기 때문에 변수 앞 접근 지정자 적용 안함
    // 되는거
    void onPressed();
}
