import greenfoot.*;

public class ball extends Actor
{
    private int speed = 2;

    public ball()
    {
        getImage().scale(30,30);
        setRotation(270);
    }

    int px=0;
    int py=-2;

    public void act() 
    {
        if (isTouching(gole.class)) {
            getWorld().showText("CLEAR!", 300, 200);
            Greenfoot.stop();
        }
        
        int x = getX();
        int y = getY();
        setLocation(x+px,y+py);

        Actor actor = getOneIntersectingObject( barrier.class );
        if( actor != null ){
            getWorld().removeObject( actor );
            py=py*-1;
        }

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
            getWorld().showText("Gameover", 300, 200);
            getWorld().removeObject( this );
        }
    }
}    
