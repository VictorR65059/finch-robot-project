package com.myFinch;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    
    public FinalFinch(String device) {
        super(device);
    }

    public void doubleLeftTurn() {
        setTurn("L", 90, 100);
        setMove("F", 20, 50);
        setTurn("L", 90, 100);
    }

    public void doubleRightTurn() {
        setTurn("R", 90, 100);
        setMove("F", 20, 50);
        setTurn("R", 90, 100);
    }

}
