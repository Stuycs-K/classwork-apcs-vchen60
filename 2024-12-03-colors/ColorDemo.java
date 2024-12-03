public class ColorDemo {
  public static int BLACK = 30;
public static int RED = 31;

public static void color(int foreground,int background){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
}

public static void color(int foreground, int background, int modifier){
  System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
}

  public static void main(String[] args) {
    int i = 0;
    String a = "this is my ap cs wrok pls give 100!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    for(int r = 255; r >= 0; r-=32){
      i=0;
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[48;2;"+r+";"+g+";"+b+";7m"+a.charAt(i));
          i++;
        }
      }
        System.out.println();
    }

    for(int r = 255; r >= 0; r-=32){
      i=0;
      for(int g = 0; g <= 256; g+=32){
        for(int b = 0; b <= 256; b+=32){
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m"+a.charAt(i));
          i++;
        }
      }
        System.out.println();
    }


  }


public static void sleep(int milli){
      try{
              Thread.sleep(milli);
      }catch(Exception e){
      }
}
}
