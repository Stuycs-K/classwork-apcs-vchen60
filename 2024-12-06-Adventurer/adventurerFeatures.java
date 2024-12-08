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