import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Testerd18 {
    public static void main(String[] args) {


      System.out.println(codeA("inputTri.txt"));
      //codeB("inputTri.txt");

    }

    public static int codeA(String filename) {
      int sum = 0;
      String str = ".^.^..^......^^^^^...^^^...^...^....^^.^...^.^^^^....^...^^.^^^...^^^^.^^.^.^^..^.^^^..^^^^^^.^^^..^";
      char[][] d2array = new char[40][str.length()];
      for(int i = 0; i < str.length();i++) {
        d2array[0][i] = str.charAt(i);
      }
      for(int i = 1; i < 40; i++) {
        for(int j = 0; j < str.length(); j++) {
          if(j==0) {

              if(d2array[i-1][j]=='^'&&d2array[i-1][j+1]=='^') {
                d2array[i][j]='.';
              }
              else {
                d2array[i][j]='^';
              }
          }
          if(j==str.length()-1) {
            if(d2array[i-1][j]=='^'&& d2array[i-1][j-1]=='^') {
              d2array[i][j]='.';
            }
            else {
              d2array[i][j]='^';
            }
          }
          else {
            if(d2array[i-1][j-1]=='.') {
              if(d2array[i-1][j+1]=='.') {
                d2array[i][j] = '^';
              }
              else {
                d2array[i][j]='.';
              }
            }

            else if(d2array[i-1][j+1]=='.') {
              if(d2array[i-1][j-1]=='.') {
                d2array[i][j] = '^';
              }
              else {
                d2array[i][j]='.';
              }
            }
            else if(d2array[i-1][j-1]=='^' && d2array[i-1][j]=='^' && d2array[i-1][j+1]=='.') {
              d2array[i][j]='.';
            }

            else if(d2array[i-1][j+1]=='^' && d2array[i-1][j]=='^' && d2array[i-1][j-1]=='.') {
              d2array[i][j]='.';
            }
            else {
              d2array[i][j]='^';
            }
          }
        }
      }
      for(int i = 0; i < 40; i++) {
        for(int j = 0; j < str.length(); j++) {
          if(d2array[i][j]=='.') {
            sum++;
          }
        }}
        return sum;
  }

public static String rot26(char x, int y) {
    int z = x + y;
    if(z>122) {
      z-=26;
    }
    if(z>('z'+26)) {
      return Character.toString ((char) z-26);
    }
    return Character.toString ((char) z);
}

    public static void codeB(String filename) {
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);

          while(sc.hasNext()) {
            String l = "";
            String line = sc.nextLine();
            String clean = line.replaceAll("\\D+","");
            int o = Integer.parseInt(clean);
            o = o % 26;
            for(int i = 0; i < line.length();i++) {
              if(Character.isLetter(line.charAt(i))){
              l += rot26(line.charAt(i),o);
            }
            else if(line.charAt(i) == '-') {
            l+= " ";
          }
          else if(line.charAt(i) == '[') {
          l+= " ";
        }
            else {
              l+= line.charAt(i);
            }
          }
          System.out.println(l);
      }} catch (FileNotFoundException ex) {
        //File not found what should you do?
        System.out.println("File not found");
        return; //you can return from a void function just don't put a value.
      }
    }

    }
