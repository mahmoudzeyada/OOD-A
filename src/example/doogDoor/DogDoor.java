package example.doogDoor;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
public class DogDoor {
    private boolean open;
    private List<Bark> allowedBarks = new LinkedList<Bark>();
    
    public DogDoor() {
        open = false;
    }

    public void open() {
        open = true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void  close() {
        open = false;
    }

    public boolean isOpen() {
        return open;
    }
    
    public List<Bark> getAllowedBarks() {
        return allowedBarks;
    }

    public void setAllowedBarks(Bark bark) {
        this.allowedBarks.add(bark);
    }
}
