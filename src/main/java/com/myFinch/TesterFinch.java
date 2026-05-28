package com.myFinch;

public class TesterFinch {
    public static void main(String[] args) {
        
        FinalFinch bird = new FinalFinch("A");
        
        bird.setMove("F", 90, 100);
        bird.doubleLeftTurn();
        bird.setMove("F", 90, 100);
        bird.doubleRightTurn();
        bird.setMove("F", 90, 100);
        bird.doubleLeftTurn();
        bird.setMove("F", 90, 100);
        bird.doubleRightTurn();
        bird.setMove("F", 120, 100);
        
        
    }
}