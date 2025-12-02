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

<<<<<<< HEAD
        Defense d = new Defense();
        addObject(d, 300, 50);
=======
>>>>>>> 7bdd0919c0f353674126cbc7669b43b254747c1f
        addObject( new gole(), 300, 25 );

    }
    
    
}