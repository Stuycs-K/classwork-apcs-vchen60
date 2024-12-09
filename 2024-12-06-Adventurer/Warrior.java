public class Warrior extends Adventurer {
  private int charisma, maxSR;
  // constructor super
  // implement all the abstract Methods//
  public Warrior(String name){
      super(name, 10);
      charisma = 0;
      this.maxSR = 10;
  }

  public Warrior(String name, int hp){
      super(name,hp);
      this.maxSR = 10;
      this.charisma = 0;
  }


  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName() {
    return "charisma";
  }
  //accessor methods
  public int getSpecial() {
    return charisma;
  }
  public void setSpecial(int n) {
    charisma = n;

  }
  public int getSpecialMax() {
    return maxSR; //10 here.
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
      other.setHP(other.getHP()+1);
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
    if(charisma > 0) {
    if(other.getHP() > 0) {
      other.setHP(other.getHP()-1);
      return "attacked! -1HP";
    }
    else {
      other.setHP(0);
      return "HP reduced to 0, enemy died";
      //is dying a feature?
    }
  }
  else {
    return "not enough charisma";
  }
}


}
