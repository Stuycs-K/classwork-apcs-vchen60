import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

  public static void main(String[] args) {
    //2 Opening a file requires a try/catch
    try {
      File file = new File("ReadFile.java");//1
      Scanner sc = new Scanner(file);
      //CODE THAT SCANS THE FILE.
      while(sc.hasNext()){
        // if(sc.next().equals("{")) {
        //   System.out.println("aaa");
        // }

        System.out.println(sc.nextLine());
sc.nextLine();
      }
      sc.close();//releases the file from your program

    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      return; //you can return from a void function just don't put a value.
    }
  }
}
