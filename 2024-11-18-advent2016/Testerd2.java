import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Testerd2 {
    public static void main(String[] args) {

      System.out.println(codeA("inputTri.txt"));
      System.out.println(codeB("inputTri.txt"));

    }

    public static String codeA(String filename) {
        
      //CODE THAT SCANS THE FILE.
      int start = 5;
      String x = "";

try{
    File file = new File(filename);
        Scanner sc = new Scanner(file);
      while(sc.hasNext()) {
      String a = sc.nextLine();
      for(int i = 0; i < a.length(); i++) {
        if(a.charAt(i)=='R') {
            if((start != 3) && (start != 6) && (start != 9)) start++;
        }
        if(a.charAt(i)=='L') {
            if((start != 1) && (start != 4) && (start != 7)) start--;
        }
        if(a.charAt(i)=='U') {
            if((start != 3) && (start != 2) && (start != 1)) start-=3;
        }
        if(a.charAt(i)=='D') {
            if((start != 7) && (start != 8) && (start != 9)) start+=3;
        }
      }
      x+=start;
      }
      return x;
    } catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return null; //you can return from a void function just don't put a value.
    }

    }

    public static String codeB(String filename) {
        
        //CODE THAT SCANS THE FILE.
        int start = 5;
        String x = "";
  
  try{
      File file = new File(filename);
          Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
        String a = sc.nextLine();
        for(int i = 0; i < a.length(); i++) {
          if(a.charAt(i)=='R') {
              if((start != 1) && (start != 4) && (start != 9) && (start != 12) && (start != 13)) start++;
          }
          if(a.charAt(i)=='L') {
              if((start != 1) && (start != 2) && (start != 5) && (start != 10) && (start != 13)) start--;
          }
          if(a.charAt(i)=='U') {
              if(start == 3) {
                start -=2;
              }
              if(start == 6 || start == 7 || start == 8 || start == 10 || start == 11 || start == 12 ) {
                start -=4;
              }
              if(start == 13) {
                start -= 2;
              }
          }
          if(a.charAt(i)=='D') {
            if(start == 11) {
                start +=2;
              }
              if(start == 6 || start == 7 || start == 8 || start == 2 || start == 3 || start == 4 ) {
                start +=4;
              }
              if(start == 1) {
                start += 2;
              }
          }
        }
        if(start < 10) {
        x+=start;}
        else if(start == 10) {
            x+="A";
        }
        else if(start == 11) {
            x+="B";
        }
        else if(start == 12) {
            x+="C";
        }
        else if(start == 13) {
            x+="D";
        }
        }
        return x;
      } catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return null; //you can return from a void function just don't put a value.
      }
  
      }
}
/*
    public static int codeB(String filename) {
      
        try {
         
      } catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return -1; //you can return from a void function just don't put a value.
      }
      */
  
      