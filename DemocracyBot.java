
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void fixBallots() {
        testForBeeper();
    }
    public void testForBeeper() {
        for (int x = 0; x < 5; x++) {
            move();
            if (nextToABeeper()) {
                fillRooms();
            } else {
                clearRooms();
            }
            move();
            
        }
        turnOff();
    }
    public void clearRooms() {
        turnLeft();
        move();
        if (nextToABeeper()) {
            pickBeeper();
            if (nextToABeeper()) {
                pickBeeper();
            } 
        }
        while (!facingSouth()) {
            turnLeft();
        }
        move();
        move();
        if (nextToABeeper()) {
            pickBeeper();
            if (nextToABeeper()) {
                pickBeeper();
            }
        }
        while (!facingNorth()) {
            turnLeft();
        }
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void fillRooms() {
        turnLeft();
        move();
        if (!nextToABeeper()){
            putBeeper();
        } else {
            while (!facingSouth()) {
                turnLeft();
           }
        }
        move();
        move();
        if (!nextToABeeper()){
            putBeeper();
        } else {
            while (!facingNorth()) {
                turnLeft();
          }   
        }
        move();
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

