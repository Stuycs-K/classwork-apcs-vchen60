public class MyArrays {
  public static void main(String[] args) {

  }

  public static String arrayToString(int[] arr) {
    String result = "[";
    for(int i = 0; i < arr.length; i++) {
      result += arr[i];
      if(i != arr.length-1) {
        result += ", "
      }
    }
    return result + "]";
  }

  public static int[] returnCopy(int[]ary) {
    int[] newAry = new int[ary.length];
    for(int i = 0; i < ary.length; i++) {
      newAry[i] = ary[i];
    }
    return newAry;
  }

  public static int[] concatArray(int[]ary1,int[]ary2) {
    int[] newAry = new int[ary1.length + ary2.length];
    for(int i = 0; i < ary1.length; i++) {
      newAry[i] = ary1[i];
    }
    for(int j = 0; j < ary2.length; j++) {
      newAry[j+ary1.length] = ary2[j];
    }
    return newAry;
  }
}
