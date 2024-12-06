public interface adventurerFeatures{

    public abstract String getSpecialName();
    //accessor methods
    public abstract int getSpecial();
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

public class Warrior extends Adventurer implements adventurerFeatures{
  private int specialresource, maxSR;
  // constructor super
  // implement all the abstract Methods//
  public Warrior(String name){
      super(name, 10);
      specialresource = 0;
  }

  public Warrior(String name, int hp){
      super.setName(name);
      super.setHP(hp);
      super.setmaxHP(hp);
      specialresource = 0;
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
  public int getSpecial() {
    return specialresource;
  }
  public void setSpecial(int n) {
    specialresource = n;

  }
  public int getSpecialMax() {
    return maxSR;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public String attack(Adventurer other) {
    if(other.getHP() > 0) {
      other.setHP(other.getHP()-1);
      return "attacked! -1HP";
    }
    else {
      other.setHP(0);
      return "HP reduced to 0, you died";
      //is dying a feature?
    }
  }

  //heall or buff the target adventurer
  public String support(Adventurer other) {
    if(other.getHP() != other.getmaxHP()) {
      other.setHP(HP+1);
      return "added 1 hp!";
    }
    return "already at max HP";
  }


  //heall or buff self
  public String support() {
    if(getHP() != getmaxHP()) {
      setHP(getHP()+1);
      return "added 1 hp!";
    }
    return "already at max HP";
  }

  //hurt or hinder the target adventurer, consume some special resource
  public String specialAttack(Adventurer other) {

    if(other.getHP() > 0) {
      other.setHP(other.getHP()-1);
      return "attacked! -1HP";
    }
    else {
      other.setHP(0);
      return "HP reduced to 0, you died";
      //is dying a feature?
    }
  }

}
