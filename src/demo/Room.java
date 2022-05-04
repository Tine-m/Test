package demo;

public class Room {

 private Inventory inventory;

  public Room(Inventory inventory) {
    this.inventory = inventory;
  }

  public boolean hasFood(String foodName) {
    return inventory.hasFood(foodName);
  }
}
