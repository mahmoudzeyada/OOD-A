package GuitarExample;

public enum Style {
  Style1, Style2;
  
  @Override
  public String toString() {
    switch(this) {
      case Style1: return "style1";
      case Style2: return "style2";
    }
    return null;
  }
}