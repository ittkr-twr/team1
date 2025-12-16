import greenfoot.*;

public class ball extends Actor
{


    public ball()
    {
        getImage().scale(30,30);
        setRotation(270);
    }

    int px=0;
    int py=-4;

    public void act() 
    {
        if (isTouching(gole.class)) {
            getWorld().showText("CLEAR!", 300, 200);
            Greenfoot.stop();
        }
        
        int x = getX();
        int y = getY();
        

        Actor actor1 = getOneIntersectingObject( barrier.class );
        if( actor1 != null ){
            getWorld().removeObject( actor1 );
            py=py*-1;
        }

        Actor actor2 = getOneIntersectingObject( Hantei.class );
        if( actor2 != null ){
            if( getY() >= 325 )
            {
                py=py*-1;
            }
            
            if( Greenfoot.isKeyDown( "right" ) ){
                px=4;
            }
            if( Greenfoot.isKeyDown( "left" ) ){
                px=-4;
            }
            if( getY() < 325)
            {
                px=px*-1;
            }
        }

        Actor actor3 = getOneIntersectingObject( Defense.class );
        if( actor3 != null ){
            getWorld().removeObject( actor3 );
            py=py*-1;
        }
        
        setLocation(x+px,y+py);

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
