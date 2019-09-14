import java.util.*;
import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**

 * Write a description of class Classroom here.
 *
 * @author (your name)
 * @version (a version number or a date)




public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    /**
     * Constructor for objects of class Classroom.
     *
     */
    public Classroom()
    {
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130);

        prepare();
    }



    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world. This incorporates the SoumyaKakarlapudi class.
     */
     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.


        /* Example */

        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();

        SoumyaKakarlapudi soumyakakarlapudi = new SoumyaKakarlapudi("Soumya", "Kakarlapudi", 1, 7);
        addObject(soumyakakarlapudi, 1, 7);
        soumyakakarlapudi.sitDown();




        RitviksiddhaPenchala ritvik = new RitviksiddhaPenchala();
        addObject(ritvik, 5, 3);
        ritvik.sitDown();


        LikhitGudisay likhitgudisay = new LikhitGudisay("Likhit", "Gudisay", 1, 4);
        addObject(likhitgudisay, 1, 4);
        likhitgudisay.sitDown();


        VikasUmmadisetty vikasu = new VikasUmmadisetty("Vikas", "Ummadisetty", 4,5);
        addObject(vikasu, 4, 5);
        vikasu.sitDown();

        /*
        while(true) {
            if(vikasummadisetty.animateStart) {
                animation();
            }
            Greenfoot.delay(10);
        }
        */
    }
}
