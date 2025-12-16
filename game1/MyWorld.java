import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
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



        setActOrder(Rafael.class,gole.class, barrier.class, Defense.class);

    }

}