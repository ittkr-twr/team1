import greenfoot.*;

public class Rafael extends Actor
{
    private int speed = 5;
    
    Hantei hantei = null;
    
    public Rafael()
    {
        getImage().scale(100, 150);
    }

    public void act() 
    {
        moveLeftRight();
        
        if(hantei == null){
            hantei = new Hantei();
            hantei.getImage().scale( 50, 120 );
            hantei.getImage().setTransparency(0);
            getWorld().addObject(hantei,0,0);
        }
        hantei.setLocation(getX(),getY());
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
