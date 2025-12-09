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
    public void act() 
    {
        setRotation(270);
        move(2);
        Actor actor = getOneIntersectingObject( barrier.class );
        if( actor != null ){
            getWorld().removeObject( actor );
        }
    }    
}
