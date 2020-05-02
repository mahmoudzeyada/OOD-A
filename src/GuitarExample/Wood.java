package GuitarExample;

public enum Wood {
    Wood1, Wood2;

    @Override
    public String toString() {
        switch (this) {
            case Wood1: return "wood1";
            case Wood2: return  "wood2";
        }
        return  null;
    }
}
