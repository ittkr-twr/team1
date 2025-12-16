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
        
        Actor actor2 = getOneIntersectingObject( Defense.class );
        if( actor2 != null ){
            getWorld().removeObject( actor2 );
            py=py*-1;
        }
    }    
}
