package example.doogDoor;

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark) {
        for (Bark allowedBark : dogDoor.getAllowedBarks()) {
            if (allowedBark.equals(bark)) {
                System.out.println("BarkRecognizer recognize the dog barking" + bark.toString());
                this.dogDoor.open();
                return;
            }
        }
        return;
        
    }
}
