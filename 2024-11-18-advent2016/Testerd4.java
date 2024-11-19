import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Testerd4 {
    public static void main(String[] args) {


      System.out.println(codeA("inputTri.txt"));
      codeB("inputTri.txt");

    }

    public static int codeA(String filename) {
      int[] arr = new int[26];  // Array to store frequency of characters (a-z)
        String result = "";

      //CODE THAT SCANS THE FILE.
        int sum = 0;
        try {
          File file = new File(filename);
          Scanner sc = new Scanner(file);

          while(sc.hasNext()) {
            String l = "";
            String line = sc.nextLine();
            int i = 0;
            while (i < line.length()) {
              char c = line.charAt(i);
              if (Character.isLetter(c)) {
                  int index = c - 'a';
                  arr[index]++;
              }
              if(c=='[') {
                break;
              }
              i++;
          }
          for(int j = 0; j < 5; j++) {
            int max = 0;
          for(int ii = 0; ii < 26; ii++) {
            if(arr[ii]>arr[max]) {
              max = ii;
            }
          }
          arr[max]=0;
          String x = Character.toString ((char) max+97);
          l+=x;
          }
          if(l.equals(line.substring(line.length()-6,line.length()-1))) {
            String clean = line.replaceAll("\\D+","");
            int o = Integer.parseInt(clean);

            sum+=o;
          }
          for(int im = 0; im < 26; im++) {
            arr[im] = 0;
          }
      }
      sc.close();  // Close scanner

      return sum;  // Return the result



          }

    catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return -1; //you can return from a void function just don't put a value.
    }
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
