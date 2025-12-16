import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Rafael extends Actor {
    public Rafael() {
        getImage().scale(100, 150);
    }

    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
            move(4);
        }
        if( Greenfoot.isKeyDown( "left" ) ){
            move(-4);
        }
    }
}
