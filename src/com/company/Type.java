package com.company;

import org.jetbrains.annotations.Contract;

public enum Type {
    TYPE1, TYPE2;

    @Override
    public String toString() {
        switch (this) {
            case TYPE1: return "type1";
            case TYPE2: return "type2";
        }
        return  null;

    }
}
