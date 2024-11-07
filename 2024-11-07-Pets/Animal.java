public class Animal {
  private String noise;
  private int age;
  private String name;

  public Animal(String noise, int age, String name){
    this.noise = noise;
    this.age = age;
    this.name = name;
    //initialize the values (hint use this.varname to clarify)
  }

public void speak() {
  System.out.println("My name is "+ name + "\nI am " + age + " years old.\nI say "+ noise);
}
  //2.
  /*speak() should print the following message replacing
  the ?'s with name/age/noise:
  My name is ?.
  I am ? years old.
  I say ?.

  Note: you MUST use getName() getNoise() here! You will see why later.
  */

  public String getName(){
    return name;
  }
  public String getNoise(){
    return noise;
  }
}
