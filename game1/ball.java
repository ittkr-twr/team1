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

        Actor actor1 = getOneIntersectingObject( barrier.class );
        if( actor1 != null ){
            getWorld().removeObject( actor1 );
            py=py*-1;
        }

        Actor actor2 = getOneIntersectingObject( Rafael.class );
        if( actor2 != null ){
            py=py*-1;
            px=px*-1;
            if( Greenfoot.isKeyDown( "right" ) ){
                px=2;
            }
            if( Greenfoot.isKeyDown( "left" ) ){
                px=-2;
            }
        }  
        Actor actor3 = getOneIntersectingObject( Defense.class );
        if( actor3 != null ){
            getWorld().removeObject( actor3 );
            py=py*-1;
        }
    }
}    



