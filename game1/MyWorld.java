import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    private int defenseNum = 21;
    public MyWorld()
    {    
        super(600, 400, 1); 

        addObject( new gole(), 300, 25 );
        addObject( new barrier(), 300, 40);
        for(int i=0; i<3; i++) {
            for(int j=0; j<7; j++) {
                addObject(new Defense(), 80 + 70*j, 80 + i*60);
            }
        }
        addObject(new Rafael(), 300, 400);
        addObject( new ball(), 300, 300);
        setActOrder(gole.class, Rafael.class, barrier.class, Defense.class, ball.class);
    }
    
    public void decrementDefenseNum() {
        defenseNum--;
        
        if (defenseNum <= 0) {
            removeObjects(getObjects(barrier.class));
        }
    }

}