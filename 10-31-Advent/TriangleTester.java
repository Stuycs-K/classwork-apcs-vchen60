import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class TriangleTester {
    public static void main(String[] args) {
      String text = "This is a sample\nOf how to read\ntext!";

      // creates a Scanner object to read throug the String
      Scanner input = new Scanner(text);

      //you don't want a for loop here unless you know the size of the data set

      while(input.hasNext()){
        System.out.println(input.next());
      }

      Scanner sc1 = new Scanner("This is a bunch of words");

      while(sc1.hasNext()){
        System.out.println(sc1.next());
      }

      Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");

      while(sc2.hasNextDouble()){
        System.out.println(sc2.nextDouble());
      }

      //System.out.println(countTrianglesA("inputTri.txt"));


    }

    public static int countTrianglesA(String filename) {
      int sum = 0;

      try {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
      //CODE THAT SCANS THE FILE.


      while(sc.hasNextLine()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      if(!((a+b>=c)||(c+b>=a)||(a+c>=b))) {
        sum++;
      }
    }
      sc.close();//releases the file from your program
    return sum;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }

    }
  }
