public class Driver {
  public static void main(String[] args) {
    Adventurer alice = new Warrior("alice");
    Adventurer bob = new Warrior("bob", 100);
    //a hunter and a rabbit play a game on the complex plane :!?:

    System.out.println(alice.getHP());
    System.out.println(alice.getName());
    System.out.println(alice.getSpecial());
    System.out.println(alice.getSpecialMax());
    System.out.println(alice.getSpecialName());
    System.out.println(alice.getmaxHP());

    System.out.println(bob.getHP());
    System.out.println(bob.getName());
    System.out.println(bob.getSpecial());
    System.out.println(bob.getSpecialMax());
    System.out.println(bob.getSpecialName());
    System.out.println(bob.getmaxHP());

  }
}
