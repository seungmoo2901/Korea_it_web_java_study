package _24_Interface;

public class Main {
    public static void main(String[] args) {
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(),
                new ChannelUpButton(),
                new ChannelDownButton(),
                new VolumeUpButton(),
                new VolumeDownButton()
        );
            tvRemoteController.onPressedPowerButton();
            tvRemoteController.onPressedPowerButton();
            tvRemoteController.onUpChannelUpButton();
            tvRemoteController.onPressedChannelUpButton();
            tvRemoteController.onDownChannelDownButton();
            tvRemoteController.onPressedChannelDownButton();
            tvRemoteController.onUpVolumeUpButton();
            tvRemoteController.onPressedVolumeUpButton();
            tvRemoteController.onDownVolumeDownButton();
            tvRemoteController.onPressedVolumeDownButton();

    }
}
