import java.util.Scanner;
import java.util.*;
class Game {
  public static void main(String[] args) {
    //do this once

    Scanner userInput = new Scanner(System.in);
    //You can do the rest many times:

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);

    Warrior a0 = new Warrior(userName);
    Warrior enemy = new Warrior("enemyWarrior");

while(a0.getHP()>0&&enemy.getHP()>0) {
    Scanner twoInp = new Scanner(System.in);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");

    String secondInput = twoInp.nextLine();

    if(secondInput.equals("a")||secondInput.equals("attack")) {
      a0.attack(enemy);
      System.out.println("enemy attacked");
    }
    else if(secondInput.equals("sp")||secondInput.equals("special")) {
      String l = a0.specialAttack(enemy);
      System.out.println(l);
    }
    else if(secondInput.equals("su")||secondInput.equals("support")) {
      String l = a0.support();
      System.out.println(l);
    }
    else if(secondInput.equals("quit")) {
      break;
    }
    else {
      System.out.println("invalid input");
    }

    if(enemy.getHP()<=0) {
      System.out.println("you won!");
    }
    else {
      int random = (int) (Math.random()*3);
      if(random == 0) {
        enemy.attack(a0);
        System.out.println("enemy attacked you");
      }
      else if(random == 1) {
        String l = enemy.specialAttack(a0);
        System.out.println("enemy tried to sp attack:" l);
      }
      else {
        enemy.support();
        System.out.println("enemy supported themselves");
      }
    }


  }

  System.out.println("Game Over!");
}
}