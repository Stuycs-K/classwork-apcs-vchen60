import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] j = new int[]{1,2,3,4,56,7,8};
    int[] a = MyArrays.returnCopy(j);
    a[3] = 100000;
    System.out.println(j);
    System.out.println(Arrays.toString(j));
    System.out.println(a);
    System.out.println(Arrays.toString(a));
  }
}
