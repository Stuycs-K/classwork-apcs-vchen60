import java.io.*;
import java.util.*;

public class Testerd21 {
    public static void main(String[] args) {
        
        String filename = "inputTri.txt"; // Make sure this file exists!

        try {
            String[] yyy = letters(filename);
            System.out.println(Arrays.toString(yyy));
            String[] zzz = lettersRev(filename);
            System.out.println(Arrays.toString(zzz));
        } catch (IOException e) {
            System.out.println("Error!");
        }
        
    }

    //PROBLEM 1!!!
    public static String[] letters(String filename) throws FileNotFoundException{
        String[] listt = new String[]{"a","b","c","d","e","f","g","h"};
        File file = new File("inputTri.txt");
          Scanner inScan = new Scanner(file);
          while(inScan.hasNextLine()){ 
            String x = inScan.nextLine();
            String[] split = x.split(" ");
            if(split[0].equals("swap")) {
                if (split[1].equals("position")) {
                    int pos1 = Integer.parseInt(split[2]);
                    int pos2 = Integer.parseInt(split[5]);
                    String temp = listt[pos1];
                    listt[pos1] = listt[pos2];
                    listt[pos2] = temp;
                } 
                
                else {
                    String letter1 = split[2];
                    String letter2 = split[5];
                    int pos1 = Arrays.asList(listt).indexOf(letter1);
                    int pos2 = Arrays.asList(listt).indexOf(letter2);
                    String temp = listt[pos1];
                    listt[pos1] = listt[pos2];
                    listt[pos2] = temp;
                }
            }
            if(split[0].equals("move")) {
                int start = Integer.parseInt(split[2]);
                int end = Integer.parseInt(split[5]);
                String letter = listt[start];
                if (start < end) {
                    for (int i = start; i < end; i++) {
                        listt[i] = listt[i + 1];
                    }
                } 
                
                else {
                    for (int i = start; i > end; i--) {
                        listt[i] = listt[i - 1];
                    }
                }
                listt[end] = letter;
            }
            if(split[0].equals("reverse")) {
                String aa = split[2];
                String bb = split[4];
                int a = Integer.parseInt(aa);
                int b = Integer.parseInt(bb);
                for(int i = a; i <= (b+a)/2; i++) {
                    String j = listt[(b+a)-i];
                    String k = listt[i];
                    listt[i]=j;
                    listt[(b+a)-i]=k;
                }
            }
            if (split[0].equals("rotate")) {
                if (split[1].equals("left")) {//userotLeft
                    int steps = Integer.parseInt(split[2]) % listt.length;
                    listt = rotLeft(listt, steps);
                } 
                
                else if (split[1].equals("right")) {//userotRight

                    int steps = Integer.parseInt(split[2]) % listt.length;
                    listt = rotRight(listt, steps);
                } 
                
                else{//based case

                    String letter = split[6];
                    int index = Arrays.asList(listt).indexOf(letter);
                    int steps = 1 + index;
                    if (index >= 4) {
                        steps++;
                    }

                    steps %= listt.length;
                    listt = rotRight(listt, steps);
                
                }}
            }

    inScan.close();
    return listt;}


    public static String[] rotLeft(String[] array,int steps) {
//rot based on modulo iff >8 for input!!
        String[] result = new String[array.length];
        for (int i = 0;i < array.length;i++) {
            result[i] = array[(i + steps) % array.length];
        }
        return result;
    }



    public static String[] rotRight(String[] array,int steps) {//notetoself adaptrotLeft test 2
        String[] result = new String[array.length];
        for (int i = 0;i < array.length;i++) {
            result[i] = array[(i - steps + array.length) % array.length];
        }
        return result;
    }



    //PROBLEM 2!!!
    public static String[] lettersRev(String filename) throws IOException {

        //NOTE TO SLEF: REVERSE BOTH THE FILE AND THE MOVES!!
         //NOTE TO SLEF: REVERSE BOTH THE FILE AND THE MOVES!!
          //NOTE TO SLEF: REVERSE BOTH THE FILE AND THE MOVES!!
           //NOTE TO SLEF: REVERSE BOTH THE FILE AND THE MOVES!!
            //NOTE TO SLEF: REVERSE BOTH THE FILE AND THE MOVES!!

        String[] listt = new String[]{"f", "b", "g", "d", "c", "e", "a", "h"};
        List<String> lines = readFileInReverse(filename);
        for (int r = 0; r < lines.size(); r++) {
            String x = lines.get(r);
            String[] split = x.split(" ");
            
            if (split[0].equals("swap")) {
                if (split[1].equals("position")) {
                    int pos1 = Integer.parseInt(split[2]);
                    int pos2 = Integer.parseInt(split[5]);

                    String temp = listt[pos1];
                    listt[pos1] = listt[pos2];listt[pos2] = temp;
                } 
                
                else {
                    String letter1 = split[2];
                    String letter2 = split[5];

                    int pos1 = Arrays.asList(listt).indexOf(letter1);
                    int pos2 = Arrays.asList(listt).indexOf(letter2);
                    String temp = listt[pos1];
                    listt[pos1] = listt[pos2];
                    listt[pos2] = temp;
                }
            }
            
            if (split[0].equals("move")) {
                // Reverse move
                int start = Integer.parseInt(split[5]);
                int end = Integer.parseInt(split[2]);
                String letter = listt[start];
                if (start < end) {
                    for (int i = start; i < end; i++) {
                        listt[i] = listt[i + 1];
                    }
                } 
                
                else {
                    for (int i = start; i > end; i--) {
                        listt[i] = listt[i - 1];
                    }
                }
                listt[end] = letter;
            }
            
            if (split[0].equals("reverse")) {
                int a = Integer.parseInt(split[2]);
                int b = Integer.parseInt(split[4]);
                // Reverse the range
                for (int i = a; i <= (b + a) / 2; i++) {
                    String temp = listt[i];
                    listt[i] = listt[b - (i - a)];
                    listt[b - (i - a)] = temp;
                }
            }
            
            if (split[0].equals("rotate")) {
                if (split[1].equals("left")) {//userot!Left
                    int steps = Integer.parseInt(split[2]) % listt.length;
                    listt = rotRight(listt, steps);
                }    
                else if (split[1].equals("right")) {//userot!Right
                    int steps = Integer.parseInt(split[2]) % listt.length;
                    listt = rotLeft(listt, steps);
                } 
                
                else {//based case
 
                    String letter = split[6];
                    int index = Arrays.asList(listt).indexOf(letter);
                    int steps;
                    if (index % 2 == 1 || index == 0) {
                        steps = (index + 1) / 2;} 
                    
                    else {
                        steps = (index / 2 + 5) % listt.length;
                    }
                    steps %= listt.length;
                    listt = rotLeft(listt, steps);
        }}
        
            }        return listt;
    }    
    public static List<String> readFileInReverse(String filename) throws IOException {
        ArrayList<String> lines = new ArrayList<String>();
        

        try {
        BufferedReader br = new BufferedReader(new FileReader(filename));
          String line;
          while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        }
        finally {
        Collections.reverse(lines); return lines;
    
    }}



}
