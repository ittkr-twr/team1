import greenfoot.*;
public class ball extends Actor
{
    public ball()
    {
        getImage().scale(30,30);
        setRotation(270);
    }
    int px= Math.random() < 0.5 ? 3 : -3;
    int py=-3;
    int waitTimer = 99;
    boolean justBouncedFromHantei = false;
    
    public void act() 
    {
        if (waitTimer > 0) {
            waitTimer--;
            int count = waitTimer / 33 + 1; 
            getWorld().showText("Start: " + count, 300, 200);
            return;
        }
        getWorld().showText("", 300, 200);
        if (isTouching(gole.class)) {
            Greenfoot.setWorld(new Clear());
            Greenfoot.playSound("clear.mp3");
            Greenfoot.stop();
        }
        int x = getX();
        int y = getY();
        
        Actor actor2 = getOneIntersectingObject( Hantei.class );
        if( actor2 != null && !justBouncedFromHantei ){
            py=Math.abs(py) * -1;
            Greenfoot.playSound("kick.mp3");
            justBouncedFromHantei = true;
        } else if( actor2 == null ){
            justBouncedFromHantei = false;
        }
        
        Actor actor3 = getOneIntersectingObject( Defense.class );
        if( actor3 != null ){
            Greenfoot.playSound("attack.mp3");
            setLocation( getX(), getY() - py );
            if( isTouching( Defense.class ) ){ 
                px = px * -1; 
                setLocation( getX(), getY() + py );
            } else {
                setLocation( getX(), getY() + py );
                py = py * -1; 
            }
            getWorld().removeObject( actor3 );
            ((MyWorld) getWorld()).decrementDefenseNum();
        }
        Actor actor4 = getOneIntersectingObject( barrier.class );
        if( actor4 != null ){
            setLocation( getX(), getY() - py );
            if( isTouching( barrier.class ) ){ 
                px = px * -1; 
                setLocation( getX(), getY() + py );
            } else {
                setLocation( getX(), getY() + py );
                py = py * -1; 
            }
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
            getWorld().showText("Gameover", 300, 200);
            getWorld().removeObject( this );
        }
    }
}