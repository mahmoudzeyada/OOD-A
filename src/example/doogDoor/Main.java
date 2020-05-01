package example.doogDoor;

public class Main {
    public static void main(String [] args) {
        DogDoor dogDoor = new DogDoor();
        dogDoor.setAllowedBarks(new Bark("wofff"));
        dogDoor.setAllowedBarks(new Bark("rrrrwofff"));
        dogDoor.setAllowedBarks(new Bark("woooooof"));
        dogDoor.setAllowedBarks(new Bark("rowlf"));
        Remote remote = new Remote(dogDoor);
        BarkRecognizer recognizer = new BarkRecognizer(dogDoor);
        
        System.out.println("the dog is barking wants to go outside");
        recognizer.recognize(new Bark("rowlf"));
        System.out.println("the dog is out");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("all is done ..............");
        System.out.println("the dog is stuck outside");
        System.out.println("other dog is barking");
        recognizer.recognize(new Bark("wiiii"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        System.out.println("\n the dog start to parking");
        recognizer.recognize(new Bark("rowlf"));
        System.out.println("\n the dog comes to the home");
    }
}
