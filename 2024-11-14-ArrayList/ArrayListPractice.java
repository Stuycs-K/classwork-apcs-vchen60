import java.util.ArrayList;

public class ArrayListPractice {
  public static ArrayList<String> createRandomArray(int size) {
    ArrayList<String> newArr = new ArrayList<String>();
    for(int i = 0; i < size; i++) {
      int k = (int)(11*Math.random());
      if(k != 0) {
      newArr.add(""+k);
    }
    else {
      newArr.add("");
    }
    }
    return newArr;
  }

  public static void replaceEmpty( ArrayList<String> original){
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  for(int i = 0; i < original.size(); i++)
  {
    if (original.get(i).equals(""))
    {
      original.set(i, "Empty");
    }
  }
}

public static ArrayList<String> makeReversedList( ArrayList<String> original){
  //return a new ArrayList that is in the reversed order of the original.
  
}

public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
}

}
