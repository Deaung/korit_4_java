package ch14_abstraction.abstraction_classes.interfaces;

public class PowerButton extends Button{
    private boolean status;

    @Override
    public void onPressed() {
        if (status){
            status = true;
            System.out.println("전원 종료");
        }else {
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
}
