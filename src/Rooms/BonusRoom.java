package Rooms;

import Game.Runner;
import People.Person;

public class BonusRoom extends Room
{
    public BonusRoom(int x, int y)
    {
        super(x, y);
    }
    @Override
    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the bonus room! Three points for you.");
    }
}