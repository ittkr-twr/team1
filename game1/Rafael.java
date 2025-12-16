import greenfoot.*;

public class Rafael extends Actor
{
    private int speed = 5;

    public Rafael()
    {
        getImage().scale(100, 150);
    }

    public void act() 
    {
        moveLeftRight();
    }
    
    private void moveLeftRight()
    {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
        if (getX() < 50) setLocation(50, getY());
        if (getX() > getWorld().getWidth() - 50)
            setLocation(getWorld().getWidth() - 50, getY());
    }
}
