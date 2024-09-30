public class ArrayMethods {
  public static void main(String[] args) {

  }

  //1. Write both your names + emails at the top of the document as a comment.

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrayToString(int[] arr) {
    String result = "[";
    for(int i = 0; i < arr.length; i++) {
      result += arr[i];
      if(i != arr.length-1) {
        result += ", ";
      }
    }
    return result + "]";
  }

  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String result = "]";
    for(int i = 0; i < ary.length; i++) {
      result += '[';
      int rrr = ary[i].length;
      for(int j = 0; j < rrr; j++) {
        result += ary[i][j];
        if(j != rrr-1) {
          result += ", ";
        }
      }
      result += ']';
    }
    return (result + ']');
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]ary){
    int result = 0;
    for(int i = 0; i < ary.length; i++) {
      int rrr = ary[i].length;
      for(int j = 0; j < rrr; j++) {
        result += ary[i][j];
      }
    }
    return result;//use a nested loop to solve this
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    return new int[1][1];
    int r = nums[0].length;
    int s = nums.length;
  }



}
