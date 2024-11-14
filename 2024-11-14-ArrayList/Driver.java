import java.util.ArrayList;
public class Driver {
public static void main(String[] args) {
  int k = (int)(10000*Math.random());
  System.out.println(ArrayListPractice.createRandomArray(k).toString());
  int j = (int)(50*Math.random());

  ArrayList<String> newArr = (ArrayListPractice.createRandomArray(j));
  ArrayListPractice.replaceEmpty(newArr);
  System.out.println(newArr.toString());
}
}
