package GuitarExample;

public enum Builder {
    Builder1, Builder2;

    @Override
    public String toString() {
        switch (this) {
            case Builder1: return "builder1";
            case Builder2: return  "builder2";
        }
        return  null;
    }
}
