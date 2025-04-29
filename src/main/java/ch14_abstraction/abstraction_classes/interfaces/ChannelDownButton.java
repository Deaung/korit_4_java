package ch14_abstraction.abstraction_classes.interfaces;

public class ChannelDownButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("채널 한 칸 내립니다");
    }

    @Override
    public String onDown() {
        return "채널을 계속"+super.onDown();
    }
}
