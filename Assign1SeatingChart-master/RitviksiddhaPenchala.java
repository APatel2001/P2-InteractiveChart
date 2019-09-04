import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;

/**
 * Write a description of class TestStudent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RitviksiddhaPenchala extends Student
{
   /**
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     * lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
     */
    public RitviksiddhaPenchala(String f, String l, int r, int s) {
        firstName=f;
        lastName=l;
        myRow=r;
        mySeat=s;
        portraitFile=f.toLowerCase()+l.toLowerCase()+".jpg";    // Make sure to name your image files firstlast.jpg, all lowercase!!!
        standingFile=firstName.toLowerCase()+ lastName.toLowerCase()+"-standing.jpg";
        soundFile=f.toLowerCase()+l.toLowerCase()+".wav";  // Make sure to name your sound files firstlast.wav, all lowercase!!!
        setImage(portraitFile);
        sitting=true;
    }
    public RitviksiddhaPenchala(int r, int s) {
        firstName="Ritviksiddha";
        lastName="Penchala";
        myRow=r;
        mySeat=s;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile="bad_pic_of_rit.jpg";
       standingFile="kilgoretrout-standing.jpg";
        soundFile="kilgoretrout.wav";
        setImage(portraitFile);
        sitting=true;
    }
    /**
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
     */
    public RitviksiddhaPenchala() {
        firstName="Ritviksiddha";
        lastName="Penchala";
        myRow=3;
        mySeat=5;
       // imgFile=firstName.toLowerCase()+ lastName.toLowerCase()+".jpg";
       portraitFile="bad_pic_of_rit.jpg";
       //standingFile="trash_walk.PNG";
        soundFile="ritviksiddhapenchala.wav";
        setImage(portraitFile);
        sitting=true;
       numStudents ++;
       System.out.println(numStudents);
    }
    
     /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            if (sitting){
                sitting=false;
                //setImage(standingFile);
                System.out.println(""); // Print a blank line to create space between any student output.
                getName();
                sayName(soundFile);
            
                myHobby("I like to eat!!");
            // Create a "special method for your class and put the call here.  You can twirl your image, resize it, move it around, change transparancy, or a 
            // combination of all of those types of actions, or more. Make sure to save the original image if you manipulate it, so that you can put it back.
            // Call the sitDown() method to move back  to your seat
            
                circleClass();  // Kilgore Trount's special method... Please write one of your own. You can use this, but please modify it and be creative.
            }
            else {
                answerQuestion();
                sitDown();
            }
                    
        }
    } 
    
    /**
     * Prints the first and last name to the console
     */
    public void getName(){
        System.out.println("My name is " + firstName + " " + lastName);
    }
    /**
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void answerQuestion(){
        String q=Greenfoot.ask("What would you like to know?");
        boolean answered = false;
        boolean concept_check_complete = false;
        while(!answered){
            if (q.contains("hard")){
                concept_check_complete = false;
                q=Greenfoot.ask("I thought that concepts like abstract classes, sort algorithms, and search algorithms. Ask me something about these concepts...");
                while(!concept_check_complete){
                    if(q.contains("abstract")){
                        q=Greenfoot.ask("An abstract class is classes that cannot be instantiated. They are used as a way to share code when multiple of its subclasses are likely to share code. What would you like to know?");
                        concept_check_complete = true;
                    } else if(q.contains("sort")){
                        q=Greenfoot.ask("Sort algorithms go through a data set and organize it (sort it) into a format the search algorithm can understand later. What would you like to know?");
                        concept_check_complete = true;
                    } else if(q.contains("search")){
                        q=Greenfoot.ask("Search algorithms are a way of looking through large, sorted data sets to find a specific value. Things like search engines or databases use this. What would you like to know?");
                        concept_check_complete = true;
                    } else{
                        q = Greenfoot.ask("I don't think that was one of the concepts I listed. Could you ask a question about abstract classes, sort algorithms, or search algorithms?");
                    }
                }
            } else if(q.contains("language")){
                q=Greenfoot.ask("I use JavaScript most frequently, but Java was the first language I learne when I first started coding years ago. What would you like to know?");
            } else if(q.contains("hobbies")){
                q=Greenfoot.ask("My hobbies include coding, playing videogames, robotics, reading, watching TV, and listening to music. What would you like to know?");
            }else {
              q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
            }
             if (q.equals("yes")){
                Greenfoot.delay(10);
                sitDown();
                answered=true;
            } else if(q.equals("no")){
                q = Greenfoot.ask("What would you like to know?");
            }
        }
    }
    /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You can write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
       
       Greenfoot.delay(5);
       
       int[][] positions = new int[15][15];
       for(int x =0; x<positions.length; x++){
           for(int y = 0; y < positions[x].length; y++){
               positions[x][y] = (int)(Math.random() * ((1000 - 50) + 1)) + 1;
            }
        }
        
        GreenfootImage rit_img = getImage();
        for(int i = 0; i<50; i++){
            int x = (int)(Math.random() * ((10 - 1) + 1)) + 1;
            int y = (int)(Math.random() * ((6 - 1) + 1)) + 1;
            setLocation(x,y);
            Greenfoot.delay(5);
            rit_img.scale(positions[x][y], positions[y][x]);
            rit_img.setTransparency((int)(Math.random() * ((255 - 1) + 1)) + 1);
        }
         rit_img.setTransparency(255);

    }
     public void myHobby(String s) {
         System.out.println(s);
}    
}
