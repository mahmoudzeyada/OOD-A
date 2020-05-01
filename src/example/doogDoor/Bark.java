package example.doogDoor;

public class Bark {
  private String sound;

  public Bark(String sound) {
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }
  
  public Boolean equals(Bark bark) {
    return bark.sound == sound;
  }
}