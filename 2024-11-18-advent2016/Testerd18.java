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
      char[][] d2array = new char[400000][str.length()];
      for(int i = 0; i < str.length();i++) {
        d2array[0][i] = str.charAt(i);
      }
      for(int i = 1; i < 400000; i++) {
        for(int j = 0; j < str.length(); j++) {
          if(j==0) {

              if(d2array[i-1][j+1]=='^') {
                d2array[i][j]='^';
              }
              else {
                d2array[i][j]='.';
              }
          }


          else if(j==str.length()-1) {
            if(d2array[i-1][j-1]=='^') {
              d2array[i][j]='^';
            }
            else {
              d2array[i][j]='.';
            }
          }


          else {
            // if(d2array[i-1][j-1]=='.') {
            //   if(d2array[i-1][j+1]=='.') {
            //     d2array[i][j] = '^';
            //   }
            //   else {
            //     d2array[i][j]='.';
            //   }
            // }

            // else if(d2array[i-1][j+1]=='.') {
            //   if(d2array[i-1][j-1]=='.') {
            //     d2array[i][j] = '^';
            //   }
            //   else {
            //     d2array[i][j]='.';
            //   }
            // }
            // else {
            //   d2array[i][j]='^';
            // }

            
            if(d2array[i-1][j]==d2array[i-1][j+1]&&d2array[i-1][j]!=d2array[i-1][j-1]) {
              d2array[i][j] = '^';
            }

            else if(d2array[i-1][j]==d2array[i-1][j-1]&&d2array[i-1][j]!=d2array[i-1][j+1]) {
              d2array[i][j] = '^';
            }
            
            else {
              d2array[i][j] = '.';
            }
          }
        }
      }
      for(int i = 0; i < 400000; i++) {
        for(int j = 0; j < str.length(); j++) {
          if(d2array[i][j]=='.') {
            sum++;
          }
        }}
        return sum;
  }

   

    }
