package ch14_abstraction.abstraction_classes.interfaces;

public abstract class Button implements Up, Down,Press{

    @Override
    public String onDown(){
        return "내립니다";
    };

    @Override
    public abstract void onPressed();

    @Override
    public String  onUp(){
        return "올립니다.";
    };
}
