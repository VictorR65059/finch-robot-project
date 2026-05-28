package com.myFinch;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    
    public FinalFinch(String device) {
        super(device);
    }

    public void navigateMaze() {
        bird.setMove(direction: "F", distance: 10, speed: 50);
    }

}
