//VINCENT CHEN AND MADELINE CHIN
//vchen60@stuy.edu and mchin60@stuy.edu

public class ArrayMethods {
  public static void main(String[] args) {

    //Rectangular/Square Arrays
    int[][] a = {{1,2}, {3,4}};
    int[][] b = {{100, 200, 300}, {400, 500, 600}};
    int[][] c = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
    //all 3

    //Empty Arrays
    int[][] emptyCase = {};
    int[][] emptyCase2 = {{},{}};
    int[][] emptyCase3 = {{},{},{},{}}; //remember to try for swapRC too!
    //all except SwapRC

    //Ragged Arrays
    int[][] rag1 = {{}, {123}, {1,2,4,8,16}};
    int[][] rag2 = {{}, {10, 20, 30, 40, 50}, {}, {}};
    int[][] rag3 = {{111}, {222, 444}, {111, 333, 555}};
    int[][] rag4 = {{0,1,2},{3,4},{5,6},{7,8,9,10,11}};
    int[][] rag5 = {{7,8,9}};
    //all except SwapRC

    //Specifically swap cases
    int[][] swapper1 = {{2,3,4},{5,6,7},{8,9,10}};
    int[][] swapper2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int[][] swapper3 = {{1,2,3,4,5}}; //single array test
    int[][] swapper4 = {{1000, 2000, 3000, 4000, 5000},
    {60000, 70000, 80000, 90000, 100000},
    {1100000, 1200000, 1300000, 1400000, 1500000}};


    //test cases for 10/1/2024 functions
    int[][] case1 = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
    int[][] case2 = {{}, {1,2,3}};
    int[][] case3 = {{1}, {2}, {3}};

    int[][] replace1 = {{-1,-2,-3}, {-4,-5,-6}, {-7,-8,-9}};
    int[][] replace2 = {{-1}, {-4}, {-7}};
    int[][] replace3 = {{1,2,3}, {4,5,6}, {7,8,9}};
    int[][] replace4 = {{-1,22222,3030303}, {-4,-55555,6666666, 707, -8888}, {9,10,-11, -12}};


    //arrToString test cases
    System.out.println(arrToString(a));
    System.out.println(arrToString(b));
    System.out.println(arrToString(c));

    System.out.println(arrToString(emptyCase));
    System.out.println(arrToString(emptyCase2));
    System.out.println(arrToString(emptyCase3));

    System.out.println(arrToString(rag1));
    System.out.println(arrToString(rag2));
    System.out.println(arrToString(rag3)); //independence!!!
    System.out.println(arrToString(rag4));
    System.out.println(arrToString(rag5));


    //arr2DSum test cases
    System.out.println(arr2DSum(a));
    System.out.println(arr2DSum(b));
    System.out.println(arr2DSum(c));

    System.out.println(arr2DSum(emptyCase));
    System.out.println(arr2DSum(emptyCase2));
    System.out.println(arr2DSum(emptyCase3));

    System.out.println(arr2DSum(rag1));
    System.out.println(arr2DSum(rag2));
    System.out.println(arr2DSum(rag3));
    System.out.println(arr2DSum(rag4));
    System.out.println(arr2DSum(rag5));


    //swapRC cases
    System.out.println(arrToString(swapRC(a)));
    System.out.println(arrToString(swapRC(b)));
    System.out.println(arrToString(swapRC(c)));

    System.out.println(arrToString(swapRC(swapper1)));
    System.out.println(arrToString(swapRC(swapper2)));
    System.out.println(arrToString(swapRC(swapper3)));
    System.out.println(arrToString(swapRC(swapper4)));

    //copy cases
    System.out.println(arrToString(copy(emptyCase)));
    System.out.println(arrToString(copy(emptyCase2)));
    System.out.println(arrToString(copy(case1)));
    System.out.println(arrToString(copy(case2)));
    System.out.println(arrToString(copy(case3)));

    //TEST ADDRESSES FIRST

    System.out.println(emptyCase);
    System.out.println(emptyCase2);
    System.out.println(case1);
    System.out.println(case2);
    System.out.println(case3);

    System.out.println(copy(emptyCase));
    System.out.println(copy(emptyCase2));
    System.out.println(copy(case1));
    System.out.println(copy(case2));
    System.out.println(copy(case3));


    //copy cases
    replaceNegative(emptyCase);
    replaceNegative(emptyCase2);
    replaceNegative(emptyCase3);
    replaceNegative(case1);
    replaceNegative(case2);
    replaceNegative(case3);
    replaceNegative(replace1);
    replaceNegative(replace2);
    replaceNegative(replace3);
    replaceNegative(replace4);
    System.out.println(arrToString(emptyCase));
    System.out.println(arrToString(emptyCase2));
    System.out.println(arrToString(emptyCase3));
    System.out.println(arrToString(case1));
    System.out.println(arrToString(case2));
    System.out.println(arrToString(case3));
    System.out.println(arrToString(replace1));
    System.out.println(arrToString(replace2));
    System.out.println(arrToString(replace3));
    System.out.println(arrToString(replace4));


  }

  //1. Write both your names + emails at the top of the document as a comment.

  //2. Copy your arrToString method from before.
  /**Return a String that represets the array in the format:
  * "[2, 3, 4, 9]"
  * Note the comma+space between values, and between values
  */
  public static String arrToString(int[] arr) {
    String result = "[";
    for(int i = 0; i < arr.length; i++) {
      result += arr[i];
      if(i != arr.length-1) {
        result += ", ";
      }
    }
    return result + "]";
  }
  // ********* COMMENTS *********
  // Essentially, this function takes the starting array, and starts with a bracket, then appends
  // the required integer to the string, along with a ", "
  // until it reaches the end. at this point, it would
  // end with the bracket at the last entry. note that the for loop and if conditions
  // are designed to handle edge cases (empty/1-element arrays)


  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String result = "[";
    for(int i = 0; i < ary.length; i++) {
      result += arrToString(ary[i]);


      if(i != ary.length-1) {
        result += ", ";
      }
    }
    return (result + ']');
  }


  // ********* COMMENTS *********
  // 


  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    int result = 0;
    for(int i = 0; i < nums.length; i++) {
      int rrr = nums[i].length;
      for(int j = 0; j < rrr; j++) {
        result += nums[i][j];
      }
    }
    return result;//use a nested loop to solve this
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    int r = nums[0].length;
    int s = nums.length;
    for(int i = 0; i < s; i++) {
      for(int j = 0; j < r; j++) {
        result[j][i] = nums[i][j];
      }
    }
    return result;
  }

//3. Modify a given 2D array of integer as follows:
//Replace all the negative values:
//-When the row number is the same as the column number replace
//that negative with the value 1
//-All other negatives replace with 0
public static void replaceNegative(int[][] vals){
  for(int i = 0; i < vals.length; i++) {
    for(int j = 0; j < vals[i].length; j++) {
      if(vals[i][j] < 0) {
        if(i == j) {
          vals[i][j] = 1;
        }
        else {
          vals[i][j] = 0;
        }
      }
    }
  }
}

//4. Make a copy of the given 2d array.
//When testing : make sure that changing the original does NOT change the copy.
//DO NOT use any built in methods that "copy" an array.
//You SHOULD write a helper method for this.
//If you don't see a good way to do that, you should stop and look at prior methods.
public static int[][] copy(int[][] nums){
  int[][] result = new int[nums.length][];

  for(int i = 0; i < nums.length; i++) {
    result[i] = doer(nums[i]);
  }
  return result;
}

public static int[] doer(int[] nums) {
  int[] result = new int[nums.length];
  for(int i = 0; i < nums.length; i++) {
    result[i] = nums[i];
  }
  return result;
}
}
