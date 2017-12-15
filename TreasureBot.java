
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public int number = 0;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void findTreasure() {
        countBeepers();
    }
    public void countBeepers() {
        while (nextToABeeper()) {
            pickBeeper();
            number ++;
        }
        direction();
        while (!nextToABeeper()) {
            move();
        }
        countBeepers();
    }
    public void direction() {
        if (number == 1) {
            while (!facingNorth()){
                turnLeft();
            }
        } 
        if (number == 2) {
            while (!facingEast()) {
                turnLeft();
            }
        } 
        if (number == 3) {
            while (!facingSouth()) {
                turnLeft();
            }
        } 
        if (number == 4) {
            while (!facingWest()) {
                turnLeft();
            }
        } 
        if (number == 5) {
            turnOff();
        }
        number = 0;
    }
}

