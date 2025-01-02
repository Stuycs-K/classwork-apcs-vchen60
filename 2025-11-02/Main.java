public class Main {
public static void main(String[] args) {
  int x = Integer.parseInt(args[0]);
  System.out.println(fibonacci(x));//shortest in 10 sec is 46, also the largest we can do, 47 overflows
  //largest we can go
}

public static int fibonacci(int n) {
  if(n<2) {
    return n;
  }
  return fibonacci(n-1)+fibonacci(n-2);
}


}
