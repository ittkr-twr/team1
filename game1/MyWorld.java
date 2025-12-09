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
        
=======

>>>>>>> a837c7d73ddb1b5276fb6948a352777c84da3e9f
        addObject( new barrier(), 300, 40);
        
        addObject( new ball(), 300, 300);


    }
    
    
}