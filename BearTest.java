import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BearTest {
  
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;
  IceCream iceCream;
  ArrayList<String> list; 

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon();
    human = new Human();
    chicken = new Chicken();
    iceCream = new IceCream();
    list = new ArrayList<>();
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(bear.foodCount(), 1);
  }

  // @Test
  // public void canNotEatSalmonWhenBellyFull(){
  //   for(int i = 0; i<10; i++){
  //     bear.eat(salmon);
  //   }
  //   assertEquals(bear.foodCount(), 5);
  // }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatHuman() {
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatChicken() {
    bear.eat(chicken);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatIceCream() {
    bear.eat(iceCream);
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatAllergic() {
    bear.eat(iceCream);
    assertEquals( 0, bear.foodCount());
  }

  @Test
  public void returnNamesOfAllFood() {
    bear.eat(salmon);
    bear.eat(human);
    bear.eat(chicken);
    bear.eat(iceCream);
   
    list.add("Salmon");
    list.add("Human");
    list.add("Chicken");
    assertEquals(list, bear.checkBelly());
  }
}



































