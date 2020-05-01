package example.doogDoor;

public class Remote {
    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButton() {
        if (dogDoor.isOpen()) dogDoor.close();
        else {
            dogDoor.open();
        };
    }
}
