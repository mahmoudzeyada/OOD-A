package com.company;

public class GuitarSpec {
    private String model;
    private Type type;
    private Builder builder;
    private Wood backWood, topWood;
    private int numString;

    public GuitarSpec(String model, Type type, Builder builder, Wood backWood, Wood topWood, int numString) {
        this.model = model;
        this.type = type;
        this.builder = builder;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numString = numString;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumString() {
        return numString;
    }
    public boolean match(GuitarSpec otherGuitar) {
        if (type != otherGuitar.getType()) return false;
        if (builder != otherGuitar.getBuilder()) return false;
        if (backWood != otherGuitar.getBackWood()) return false;
        if (topWood != otherGuitar.getTopWood()) return false;
        if(numString != otherGuitar.numString) return false;
        model = model.toLowerCase();
        if ((!model.equals("")) && !(otherGuitar.getModel().equals(model))) return false;
        return true;
    }
}
