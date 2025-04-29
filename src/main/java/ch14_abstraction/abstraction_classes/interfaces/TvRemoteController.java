package ch14_abstraction.abstraction_classes.interfaces;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    public void onPressedPowerButton(){
        System.out.print("TV의");
        powerButton.onPressed();
    }
    public void onPressedChannelDownButton(){
        System.out.print("TV의");
        channelDownButton.onPressed();
    }
    public void onDownChannelDownButton(){
        channelDownButton.onDown();
    }
    public void onPressedChannelUpButton(){
        System.out.print("TV의");
        channelUpButton.onPressed();
    }
    public void onUpChannelUpButton(){
        System.out.print("TV의");
        channelUpButton.onUp();
    }
    public void onPressedVolumeDownButton(){
        System.out.print("TV의");
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton(){
        System.out.print("TV의");
        volumeDownButton.onDown();
    }
    public void onPressedVolumeUpButton(){
        System.out.print("TV의");
        volumeUpButton.onPressed();
    }
    public void onUpVolumeUpButton(){
        System.out.print("TV의");
        volumeUpButton.onUp();
    }


}
