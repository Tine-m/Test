package demo;

import java.util.ArrayList;

public class Inventory {

  //should be in a database /text file, but we hard code in memory
  private ArrayList<String> foodList;

  public Inventory(ArrayList<String> foodList) {
    this.foodList = foodList;
    foodList.add("apple");
    foodList.add("water");
  }

  public boolean hasFood(String foodName) {
    return foodList.contains(foodName);
  }
}


