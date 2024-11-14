import java.util.ArrayList;
public class Driver {
public static void main(String[] args) {
  int k = (int)(10000*Math.random());
  System.out.println(ArrayListPractice.createRandomArray(k).toString());
  int j = (int)(50*Math.random());

  ArrayList<String> newArr = (ArrayListPractice.createRandomArray(j));
  ArrayListPractice.replaceEmpty(newArr);
  System.out.println(newArr.toString());
  System.out.println(ArrayListPractice.makeReversedList(newArr).toString());

  int i = (int)(50*Math.random());

  ArrayList<String> newArr1 = (ArrayListPractice.createRandomArray(j));
  ArrayList<String> newArr2 = (ArrayListPractice.createRandomArray(i));
  ArrayListPractice.replaceEmpty(newArr1);
  ArrayListPractice.replaceEmpty(newArr2);

    System.out.println("BEFORE");
    System.out.println(newArr1.toString());
  ArrayList<String> newArr3 = ArrayListPractice.makeReversedList(newArr1);

    System.out.println("AFTER");
  System.out.println(newArr3.toString());
  System.out.println(ArrayListPractice.mixLists(newArr1, newArr2).toString());

}
}
