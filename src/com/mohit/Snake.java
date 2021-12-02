package com.mohit;

public class Snake extends BoardEntity{
    public Snake(int start, int end) {
        super(start, end);
    }

    @Override
    public String getEncounterMessage(){
        return "You have been stung by a Snake!";
    }

    @Override
    public String getString(){
        return "S(" + this.getEnd() + ")";
    }
}
