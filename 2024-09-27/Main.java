import java.util.*;
public class Main {
  public static void main(String[] args) {
    /*
    TESTING returnCopy
    */

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

    /*
    TESTING concatArray
    */

    int[] j1 = new int[]{1,2,3,4,5,6,7,8};
    int[] j2 = new int[]{9,10,11};
    int[] firstTest = MyArrays.concatArray(j1,j2);
    System.out.println(j1); //test address
    System.out.println(j2); //test address
    System.out.println(firstTest); //test address
    System.out.println(Arrays.toString(a)); //test values inside

    int[] k = new int[]{};
    int[] l = new int[]{1010101010101}
    int[] m = new int[]{3,6,9,12,15};
    int[] n = new int[]{5,6,7,8,9,0};
    int[] o = new int[]{};
    int[] k1 = new int[]{};
    int[] l1 = new int[]{1010101010101,2}
    int[] m1 = new int[]{};
    int[] n1 = new int[]{18,21,24,27};
    int[] o1 = new int[]{777,888,999};

    System.out.println(Arrays.toString(MyArrays.concatArray(k1,k)));
    System.out.println(Arrays.toString(MyArrays.concatArray(l1,l)));
    System.out.println(Arrays.toString(MyArrays.concatArray(m1,m)));
    System.out.println(Arrays.toString(MyArrays.concatArray(n1,n)));
    System.out.println(Arrays.toString(MyArrays.concatArray(o1,o)));
  }
}
