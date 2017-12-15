


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        move();
        while(nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        for (int x = 0; x < beepers; x++) {
            putBeeper();
        }
        move();
        for (int i = 0; i < beepers * 2; i++) {
            putBeeper();
        }
        while(!facingWest()) {
            turnLeft();
        }
        while(frontIsClear()) {
            move();
        }
        while(!facingEast()) {
            turnLeft();
        }
    }
}
