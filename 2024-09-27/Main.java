public class Main {
  public static void main(String[] args) {
    System.out.println()
    int[] j = new int[]{1,2,3,4,56,7,8};
    int[] a = MyArrays.returnCopy(int[] j);
    j[3] = 100000;
    System.out.println(j);
    System.out.println(j.toString());
    System.out.println(a);
    System.out.println(a.toString());
  }
}
