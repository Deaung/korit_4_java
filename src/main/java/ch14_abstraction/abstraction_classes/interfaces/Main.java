package ch14_abstraction.abstraction_classes.interfaces;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController =
                new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(),new VolumeUpButton()
        );
        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
//        tvRemoteController.onUpChannelUpButton();
//
//        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeDownButton();
//
//        tvRemoteController.onUpVolumeUpButton();
        tvRemoteController.onPressedVolumeUpButton();
    }
}
