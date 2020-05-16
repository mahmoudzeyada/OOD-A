package GuitarExample;

public enum InstrumentType {
  Type1, Type2, Type3;
  @Override
  public String toString() {
    switch (this) {
      case Type1:
        return "type1";
      case Type2:
        return "type2";
      case Type3:
        return "type3";
    }
    return null;
  }
}