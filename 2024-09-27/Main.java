import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] j = new int[]{1,2,3,4,5,6,7,8};
    int[] a = MyArrays.returnCopy(j);
    a[7] = 100000;
    System.out.println(j); //test address
    System.out.println(Arrays.toString(j)); //test values inside
    System.out.println(a); //test address
    System.out.println(Arrays.toString(a)); //test values inside; should be different
    // confirms that the function doesn't duplicate value, so following test cases will just check for identicalness

    int[] k = new int[]{};
    int[] l = new int[]{1010101010101}
    int[] m = new int[]{3,6,9,12,15};
    int[] n = new int[]{5,6,7,8,9,0};

    System.out.println(Arrays.toString(MyArrays.returnCopy(k)));
    System.out.println(Arrays.toString(MyArrays.returnCopy(l)));
    System.out.println(Arrays.toString(MyArrays.returnCopy(m)));
    System.out.println(Arrays.toString(MyArrays.returnCopy(n)));

    
  }
}
