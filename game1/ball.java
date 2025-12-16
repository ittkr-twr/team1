import greenfoot.*;

public class ball extends Actor
{
    private int speed = 2;

    public ball()
    {
        getImage().scale(30,30);
        setRotation(270);
    }

    public void act() 
    {
        move(speed);

        if (isTouching(gole.class)) {
            getWorld().showText("CLEAR!", 300, 200);
            Greenfoot.stop();
        }
    }
    
    }

