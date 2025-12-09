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
        Defense d = new Defense();
        addObject(d, 300, 50);

        addObject( new gole(), 300, 25 );
        
<<<<<<< HEAD
        addObject( new barrier(), 300, 40);
        
        addObject( new ball(), 300, 300);
=======

>>>>>>> 3e89871b22ba58e0c81c1b5694e3e250bfd6b6dc

    }
    
    
}