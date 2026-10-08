/**
 * Task 4: Multiple Interfaces
 * A SmartPhone implements Camera, MusicPlayer, and GpsNavigator at the same time.
 */
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic(String song);
}

interface GpsNavigator {
    void navigateTo(String place);
}

class SmartPhone implements Camera, MusicPlayer, GpsNavigator {
    private final String model;

    SmartPhone(String model) {
        this.model = model;
    }

    @Override
    public void takePhoto() {
        System.out.println(model + ": photo captured.");
    }

    @Override
    public void playMusic(String song) {
        System.out.println(model + ": now playing \"" + song + "\".");
    }

    @Override
    public void navigateTo(String place) {
        System.out.println(model + ": starting navigation to " + place + ".");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("Pixel");
        phone.takePhoto();
        phone.playMusic("Believer");
        phone.navigateTo("Denver Union Station");

        // The same object can be referenced through any of its interfaces
        Camera camera = phone;
        MusicPlayer player = phone;
        camera.takePhoto();
        player.playMusic("Imagine");
    }
}
