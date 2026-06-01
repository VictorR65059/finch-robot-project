package com.myFinch;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    
    public FinalFinch(String device) {
        super(device);
    }

    public void doubleLeftTurn() {
        setTurn("L", 90, 100);
        setMove("F", 23, 50);
        setTurn("L", 90, 100);
    }

    public void doubleRightTurn() {
        setTurn("R", 90, 100);
        setMove("F", 23, 50);
        setTurn("R", 90, 100);
    }

    public void longMoveRight() {
        setMove("F", 90, 100);
        setTurn("R", 90, 100);
    }

    public void shortMoveRight() {
        setMove("F", 60, 100);
        setTurn("R", 90, 100);
    }

}
