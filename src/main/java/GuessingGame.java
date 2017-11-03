import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("What type of item?  ");
      String itemName = scanner.nextLine();
      System.out.printf("What is the maximum amount of %ss?  ", itemName);
      int maxItemsAllowed = scanner.nextInt();
      Jar jar = new Jar(itemName, maxItemsAllowed);
    
    int count = 0;
    int numberOfItems = jar.fill();
    int guessNumber = 0;
    
   
    while (guessNumber != numberOfItems) {
      count += 1;
      System.out.printf("How many %s(s) are in the jar? Pick a number between 1 and %d:  %n",
			itemName, maxItemsAllowed  );
      guessNumber = scanner.nextInt(); 
    } 
    
    System.out.printf("%d attempts! ",
                      count);
      
   
  }
}
