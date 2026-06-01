package com.myFinch;

public class TesterFinch {
    public static void main(String[] args) {
        
        FinalFinch bird = new FinalFinch("A");
        
        bird.setMove("F", 60, 100);
        bird.doubleLeftTurn();
        bird.setMove("F", 60, 100);
        bird.doubleRightTurn();
        bird.setMove("F", 60, 100);
        bird.doubleLeftTurn();
        bird.setMove("F", 60, 100);
        bird.doubleRightTurn();
        bird.longMoveRight();
        bird.setMove("F", 100, 100);
        bird.doubleLeftTurn();
        bird.setMove("F", 100, 100);
        bird.setTurn("R", 90, 100);
        bird.longMoveRight();
        bird.longMoveRight();
        bird.setMove("F", 80, 100);
        bird.setTurn("R", 90, 100);
        bird.shortMoveRight();
        bird.shortMoveRight();
        bird.doubleRightTurn();
        bird.setMove("F", 30, 100);
    }
}