package pets;

public class Pet {

  private String name;

  public Pet(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void makeSomeNoise() {
    System.out.println(getName() + ": Звуки животного мира");
  }
}