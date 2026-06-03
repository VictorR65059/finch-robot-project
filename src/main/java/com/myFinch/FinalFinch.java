package com.myFinch;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {

    public static final int FULL_SPEED = 100;
    public static final int COMPLETE_TURN = 90;
    
    public FinalFinch(String device) {
        super(device);
    }

    public void doubleLeftTurn() {
        setTurn("L", COMPLETE_TURN, FULL_SPEED);
        setMove("F", 23, 50);
        setTurn("L", COMPLETE_TURN, FULL_SPEED);
    }

    public void doubleRightTurn() {
        setTurn("R", COMPLETE_TURN, FULL_SPEED);
        setMove("F", 23, 50);
        setTurn("R", COMPLETE_TURN, FULL_SPEED);
    }

    public void longMoveRight() {
        setMove("F", 90, FULL_SPEED);
        setTurn("R", COMPLETE_TURN, FULL_SPEED);
    }

    public void shortMoveRight() {
        setMove("F", 60, FULL_SPEED);
        setTurn("R", COMPLETE_TURN, FULL_SPEED);
    }

    public void beginningSection() {
        setMove("F", 60, 100);
        doubleLeftTurn();
        setMove("F", 60, 100);
        doubleRightTurn();
        setMove("F", 60, 100);
        doubleLeftTurn();
        setMove("F", 60, 100);
        doubleRightTurn();
    }

    public void middleSection() {
        longMoveRight();
        setMove("F", 100, 100);
        doubleLeftTurn();
        setMove("F", 100, 100);
        setTurn("R", 90, 100);
    }

    public void endSection() {
        longMoveRight();
        longMoveRight();
        setMove("F", 80, 100);
        setTurn("R", 90, 100);
        shortMoveRight();
        shortMoveRight();
        doubleRightTurn();
        setMove("F", 30, 100);
    }

    public void navigateMaze() {
        beginningSection();
        middleSection();
        endSection();
    }

}
