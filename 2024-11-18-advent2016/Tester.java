import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Tester {
    public static void main(String[] args) {

      System.out.println(distanceA("inputTri.txt"));
    System.out.println(distanceB("inputTri.txt"));

    }

    public static int distanceA(String filename) {
      int Lsum = 0;
      int Rsum = 0;

      try {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      int heading = 0;


      while(sc.hasNext()) {
      String a = sc.next();
      char direction = a.charAt(0);
      a=a.replaceAll(",", "");
      int b = Integer.parseInt(a.substring(1));
      if(direction=='R') {
        heading = (heading + 1) % 4;
      }
      else {
        heading = (heading - 1 + 4) % 4;
      }
      if(heading%4 == 0) {
        Lsum+=b;
      }
      if(heading%4 == 1) {
        Rsum+=b;
      }
      if(heading%4 == 2) {
        Lsum-=b;
      }
      if(heading%4 == 3) {
        Rsum-=b;
      }
      
    }
      sc.close();//releases the file from your program
    return Math.abs(Lsum)+Math.abs(Rsum);
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }

    }
    public static int distanceB(String filename) {
        int Lsum = 0;
        int Rsum = 0;
  
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);
          ArrayList xList = new ArrayList<String>();
          ArrayList yList = new ArrayList<String>();
          
        //CODE THAT SCANS THE FILE.
        int heading = 0;
  
  
        while(sc.hasNext()) {
        String a = sc.next();
        char direction = a.charAt(0);
        a=a.replaceAll(",", "");
        int b = Integer.parseInt(a.substring(1));
        if(direction=='R') {
          heading = (heading + 1) % 4;
        }
        else {
          heading = (heading - 1 + 4) % 4;
        }

        for (int i = 0; i < b; i++) {
            // Update coordinates based on the current heading
            if (heading == 0) { // North
                Rsum++;
            } else if (heading == 1) { // East
                Lsum++;
            } else if (heading == 2) { // South
                Rsum--;
            } else if (heading == 3) { // West
                Lsum--;
            }

            // Check if this position has already been visited
            for(int j = 0; j < xList.size(); j++) {
                if(((int) xList.get(j))==Lsum && ((int)yList.get(j))==Rsum) {
                                 return Math.abs(Lsum)+Math.abs(Rsum);
                         }
            }

            // Add the current position to the lists
            xList.add(Lsum);
            yList.add(Rsum);
        }
    }

        }
  catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return -1; //you can return from a void function just don't put a value.
      }
      return -1;
    }
      

}