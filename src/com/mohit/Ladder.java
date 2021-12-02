package com.mohit;

public class Ladder extends BoardEntity{
    public Ladder(int start, int end) {
        super(start, end);
    }

    public String getEncounterMessage(){
        return "You have found a ladder!";
    }

    public String getString(){
        return "L(" + this.getEnd() + ")";
    }
}
