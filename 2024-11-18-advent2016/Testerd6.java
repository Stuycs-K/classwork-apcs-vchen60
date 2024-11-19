import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Testerd4 {
    public static void main(String[] args) {


      System.out.println(codeA("inputTri.txt"));
      codeB("inputTri.txt");

    }

    public static int codeA(String filename) {
      int[] a = new int[26];
      int[] b = new int[26];
      int[] c = new int[26];
      int[] d = new int[26];
      int[] e = new int[26];
      int[] f = new int[26];
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);

          while(sc.hasNext()) {
              String line = sc.nextLine();
        }
          }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }
  }

  public static int codeB(String filename) {

      try {

        }

  catch (FileNotFoundException ex) {
    //File not found what should you do?
    System.out.println("File not found");
    return -1; //you can return from a void function just don't put a value.
  }
}

    }
