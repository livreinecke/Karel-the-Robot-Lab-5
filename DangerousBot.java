
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    int number = 0;
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void choosePile() {
        countPile();
    }
    public void countPile() {
        while (nextToABeeper()) {
            pickBeeper();
            number ++;
        }
        if (number%2 == 0) {
            countEast();
        } else {
            countWest();
        }
    }
    public void countEast() {
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
    }
    public void countWest() {
        turnLeft();
        move();
        while (nextToABeeper()) {
            pickBeeper();
        }
    }
}

