public class Warrior extends Adventurer {
  // constructor super
  // implement all the abstract Methods//
  public Warrior(String name){
      super(name, 10);
  }

  public Adventurer(String name, int hp){
      super.name = name;
      super.HP = hp;
      super.maxHP = hp;
  }


  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
    return "warrior a0!";
  }
  //accessor methods
  public abstract int getSpecial() {

  }
  public abstract void setSpecial(int n);
  public abstract int getSpecialMax();

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public abstract String attack(Adventurer other);

  //heall or buff the target adventurer
  public abstract String support(Adventurer other);

  //heall or buff self
  public abstract String support();

  //hurt or hinder the target adventurer, consume some special resource
  public abstract String specialAttack(Adventurer other);

}
