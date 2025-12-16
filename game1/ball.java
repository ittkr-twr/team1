import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ball()
    {
        getImage().scale(30,30);
        
    }
        int px=0;
        int py=-2;
        
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation(x+px,y+py);
        
 
        Actor actor = getOneIntersectingObject( barrier.class );
        if( actor != null ){
            getWorld().removeObject( actor );
            py=py*-1;
        }
        
        checkEdge();
    }   
    
    private void checkEdge()
    {
        if(getX() <= 0 || getX() >= getWorld().getWidth() -1)
        {
            px=px*-1;
        }
        
        if(getY() <= 0)
        {
            py=py*-1;
        }
        
        if(getY() >= getWorld().getHeight() -1)
        {
            getWorld().removeObject( this );
        }
    }
}
