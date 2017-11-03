import java.util.Random;


class Jar {
  public int maxItemsAllowed;
  public String itemName;
  public int minItemsAllowed = 1;
  
  public Jar(String itemName, int maxItemsAllowed) {
    this.itemName = itemName;
    this.maxItemsAllowed = maxItemsAllowed;
  }
  
  public int fill() {
    Random random = new Random();
    int someNumber = (random.nextInt((maxItemsAllowed - minItemsAllowed) + 1) + minItemsAllowed);
    return someNumber;
  }
 
}