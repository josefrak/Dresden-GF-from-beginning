import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{

    /**
     * Constructor for objects of class Beach
     * .
     * 
     */
    public Beach()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(15, 10, 60); 
        this.addObject(new Police(), 0, 0);
        //this.addObject(new Police(), 5, 5);
    }
}
