package ch14_abstraction.abstraction_classes.interfaces;

public class VolumeUpButton extends Button{
    @Override
    public void onPressed() {
        System.out.print("음량 한칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "음량을 계속 " +super.onUp();
    }
}
