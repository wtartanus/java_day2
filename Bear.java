import java.util.*;


public class Bear {
  private String name, alergic;
  private ArrayList<Edible> belly;
  private ArrayList<String> foods;
  

  public Bear(String name){
  
    this.belly = new ArrayList<Edible>();
    this.name = name;
    this.alergic = "IceCream";
  }

  public String getName(){
    return name;
  }

  public int foodCount(){
  
    return belly.size();
  }

  public void eat(Edible food){
   if(checkIfAlergic(food)) {
     return;
   }
    belly.add(food);
  }

  public void sleep(){
   
    belly.clear();
  }

  public boolean checkIfAlergic(Edible food) {
    if(food.getClass().getName() == this.alergic ) {
      return true;
    }
    return false;
  }

  public ArrayList<String> checkBelly() {
    this.foods = new ArrayList<String>();
    for(Edible food : this.belly) {
       foods.add(food.getClass().getName());
    }
    return foods;
  }


}