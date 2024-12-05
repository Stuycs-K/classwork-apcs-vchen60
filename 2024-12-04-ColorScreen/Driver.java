/*
 * 
 * INSTRUCTIONS
 */

 /*
  * Pull your classwork repo in case you updated it elsewhere.
Make a folder in classwork: 2024-12-04-ColorScreen/
Copy the Text class from above.
Make a Driver.java file that does the tasks below. Create methods to help you achieve your goals, don't just write a large main!
Create an 80x30 border of color (can be multiple, including different foreground/background) around your screen. It should be only 1 character thick.
Make an array of 3 random integers, range from 0-99 inclusive
Display the 3 integers evenly spaced (approximately) on the row below the top border.
Depending on the values of the integers, print them in the following colors:
under 25: bright red
over 75: bright green
otherwise: default to white (I am assuming your terminal background is black.)
On the line below your random numbers, draw a horizontal separator (you can match your border's color, but use a differnet character.
After you draw everything (including the next set of instructions), move your cursor to line 31 before your program exits, otherwise your terminal will draw over your screen.
Extra: Draw something in the middle of your screen (before you move your cursor to the end of course!)
Complete this as homework.
  */
public class Driver {
    //mods
    public static final int BRIGHT = 1;
    public static final int DARK = 2;
    public static final int ITALICS = 3;
    //COLORS
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;


    //CONTROLS
    public static final String CLEAR_SCREEN = "\033[2J";
    public static final String HIDE_CURSOR = "\033[?25l";
    public static final String SHOW_CURSOR = "\033[?25h";
    
    //use this to go back to normal terminal before exiting.
    public static final String RESET = "\033[0m"+SHOW_CURSOR;
    
    //use this to convert from color to background (30 to 37 becomes 40 to 47)
    public static int background(int color){
      return color + 10;
    }
    
    //terminal specific character to move the cursor to a location
    //top left is 1,1
    //row is y (higher numbers go down)
    //column is x
    public static void go(int row,int col){
        System.out.print("\033[" + row + ";" + col + "H");
    }
    
    //Overloarded color commands (give 1 or more colors/modifiers)
    public static void color(int m){
      System.out.print("\033[;" + m + "m");
    }
    public static void color(int m1, int m2){
      System.out.print("\033["+ m1 + ";" + m2 + "m");
    }
    public static void color(int m1, int m2, int m3){
      System.out.print("\033["+ m1 + ";" + m2 + ";" + m3 + "m");
    }
    public static void color(int m1, int m2, int m3, int m4){
      System.out.print("\033["+ m1 + ";" + m2 + ";" + m3 + ";"+m4+"m");
    }
    
    //And don't forget you can easily delay the printing if needed:
    public static void wait(int millis){
      try {
        Thread.sleep(millis);
      }
        catch (InterruptedException e) {
      }
    }
    
    //erase(black bakground)
    public static void erase(int r, int c, int size){
      go(r,c);
      System.out.print("\033[0m");
      for(int i = 0; i < size; i++){
        System.out.print(" ");
      }
    }
    
    public static void main(String[] args){
        int[] randomArr = new int[3];
        for(int i = 0; i < 3; i++) {
            //note2self
            //generate 0-99 implies 100 as upperlim.
            randomArr[i] =(int)(100*Math.random());
        }

        System.out.print(CLEAR_SCREEN);
        go(0,0);
        int wide = 80; //80 x 30 width
        int len = 30; //80 x 30 length specificatin
        color(background(BLUE));

        for(int i = 0; i < wide; i++){System.out.print(" ");

        }

        for(int j = 1; j < len; j++) {

            System.out.println(" ");
        }

        //INTEGER WORK next sec

        /*
         * 
         * 
         * next section!
         * 
         * 
         */
        color(WHITE);
        go(2, 20);
        //insert 1st number

        if(randomArr[0] < 25) {
            color(RED);
        }
        if(randomArr[0]>75) {
            color(GREEN);
        }
        System.out.println(randomArr[0]);

        color(WHITE);
        if(randomArr[1] < 25) {
            color(RED);
        }
        if(randomArr[1]>75) {
            color(GREEN);
        }
        go(2,40);
        System.out.println(randomArr[1]);
        
        
        go(2,60);

        color(WHITE);
        if(randomArr[2] < 25) {
            color(RED);
        }
        if(randomArr[2]>75) {
            color(GREEN);
        }
        System.out.println(randomArr[2]);

        color(BLUE);
        go(3, 2);
        for(int i = 1; i < wide; i++){
            if(i%2==0) {
                System.out.print("-");
                }
                else {
                   System.out.print("+");
                }
        }

        color(WHITE);
        color(background(BLUE));
        go(len, 0);

        /*
         * 
         * 
         * next sec
         * 
         * 
         * 
         */

         //PRINT REST
         //for(int i = 2; i < wid; j++) {
        for(int i = 0; i < wide; i++){
            System.out.print(" ");
        }

        //for(int j = 1; j < len; j++) {
        for(int j = 1; j <= len; j++) {

            go(j, wide + 1);

            System.out.println(" ");
        }

        //revert!
        go(31,1);
        color(background(BLACK));
        System.out.println(" ");
    }
}