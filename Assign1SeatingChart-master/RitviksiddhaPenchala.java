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
       standingFile="trash_walk.PNG";
        soundFile="ritviksiddhapenchala.wav";
        setImage(portraitFile);
        sitting=true;
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
                setImage(standingFile);
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
        String q=Greenfoot.ask("What would you like to know");
        boolean answered = false;
        while(!answered){
            if (q.contains("hard")){
                q=Greenfoot.ask("2D arrays, recursion, and merge sort... May I sit down?");
            
            } else if(q.contains("language")){
                q=Greenfoot.ask("Java... May I sit down?");
            } else {
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
        /*
        setLocation(0,0);
         Greenfoot.delay(10);
         // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }    
              // move Forward
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(10);
        }   
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
          
         // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            Greenfoot.delay(10);
        }      
           Greenfoot.delay(20);
           returnToSeat();
           */
          
          
       
       Greenfoot.delay(5);
       
       int[][] positions = new int[15][15];
       for(int x =0; x<positions.length; x++){
           for(int y = 0; y < positions[x].length; y++){
               positions[x][y] = (int)(Math.random() * ((1000 - 50) + 1)) + 1;
            }
        }
        
        System.out.println(positions);
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
        
        
       
       /*
       for(int i=0; i<10; i++){
           for(int j = 0; j<7; j++){
               setLocation(i,j);
               Greenfoot.delay(1);
           }
       }
       for(int i = 10; i!= 0; i--){
           for(int j = 7; j!=0; j--){
               setLocation(i,j);
               Greenfoot.delay(1);
            }
        }
       returnToSeat();
       */
      
      
    }
     public void myHobby(String s) {
         System.out.println(s);
}    
}