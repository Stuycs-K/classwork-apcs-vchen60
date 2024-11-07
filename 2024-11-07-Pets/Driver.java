/*


    Design a main class called Driver.java
    Complete the animal constructor and speak() method.
    *switch* In your main instantiate (create an instance of) an Animal object and test the speak method.
    Complete the Bird class constructor.
    *switch* In your main instantiate a Bird object and test the speak method.
    Override the speak() method, then test it in your main.
    *switch* Override the getName() method, then test speak() in your main.
    As a comment on the lines 1-3 of your Driver file, explain what happened when you made the change in the last step. Note: Line 1 is the very first line, do not place any new lines or import statements above this answer.
    *switch* In your main: Test which type can be assigned to which variable. The examples below are the four possibilities:
        Animal a1 = new Animal(...);
        Bird b1 = new Bird(...);
        Bird b2 = new Animal(...);
        Animal a2 = new Bird(...);
        Try EACH of the four ways above and then comment out the ones that produce errors.
    Place a comment on the lines 4-6 of your Driver file explaining which ones didn't work and why. (How does this align with the is-A relationship expectations?)
    *switch* Verify that the first 6 lines of your Driver file are the answers to the questions asked here.
    Have each of your your animal+bird variables from above (that were valid) speak, to see their behaviors.
    Email these files to your partner
    Both members of the group must have the files in your classwork repos


*/

public class Driver {
  public static void main(String[] args) {
    Animal a1 = new Animal("chirp", 12, "Bob");
    a1.speak();
  }
}
