import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean open;
    private String allowedBark;

    public DogDoor() {
        this.open = false;
    }

    public void open() {
        open = true;
        System.out.println("The dog door opens");

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        open = false;
        System.out.println("The dog door closes");
    }

    public boolean isOpen() {
        return open;
    }

    public void setAllowedBark(String bark) {
        this.allowedBark = bark;
    }

    public String getAllowedBark() {
        return allowedBark;
    }
}