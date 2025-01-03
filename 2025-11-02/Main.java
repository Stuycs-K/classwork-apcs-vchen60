public class Main {
public static void main(String[] args) {
  //int x = Integer.parseInt(args[0]);
  //System.out.println(fibonacci(x));//shortest in 10 sec is 46, also the largest we can do, 47 overflows
  //largest we can go

  makeWords(3,"","abcd");

    makeWords(10,"","01");
}

public static int fibonacci(int n) {
  if(n<2) {
    return n;
  }
  return fibonacci(n-1)+fibonacci(n-2);
}

public static void makeWords(int remaining, String partial, String alphabet) {
  if(remaining == 0) {
    System.out.println(partial);
  }
  else {
    for(int i =0;i<alphabet.length();i++) {
      makeWords(remaining-1, partial+alphabet.charAt(i), alphabet);
    }
  }
}

}
