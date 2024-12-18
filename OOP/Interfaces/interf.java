
/* 
 * Interface is fully abstract class.
 * It includes a group of abstract methods.
 * cannot create objects of interfaces.
 * To use interface, other classes must implement it.
 * use 'implements' keywords to implement an interface.
 * 
 * bydefault all methods are 'public abstract' in interface
 * 
 * Interface used to achieve multiple inheritance in java.
 */

interface Animal {

  public static final int legs = 4;

  void eat();

  void drink();
  /* 
   * if not override this then it always print it befault value
   */
  default void walk(){
    System.out.println("Animal is walking");
  }

}

interface Pet {
  void sings();
  void drink();
}

class Monkey implements Animal, Pet { // this not possible in abstract

  @Override
  public void eat() {
    System.out.println("Eat banana");
  }

  @Override
  public void sings() {
    System.out.println("Sings");
  }

  @Override
  public void drink() {
    System.out.println("Monkey Drink");
  }
}

public class interf {
  public static void main(String[] args) {
    Monkey m = new Monkey();
    m.eat();
    m.sings();
    m.drink();
    System.out.println(Animal.legs);
    m.walk();
  }
}
