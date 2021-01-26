import java.util.Scanner;
public class App {
    public static void main(String[] args) {
         System.out.println("Welcome to the battle simulation! Can you get through three waves of enemies?");
         System.out.println("Type in a name for your fighter!");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
        //Creates a Character object, player1, with the provided name
         Character player1 = new Character(name);

      //Runs the battle code exactly 3 times (so the player encounters 3 enemies)
      for (int i = 0; i < 3; i++) {
        System.out.println("\nAn enemy approaches! \n");
        //Creates another Character object, this time for the enemy
        Character enemy1 = new Character();
         System.out.println(enemy1 + " is the current enemy health!");
      // As long as the enemy's health is above 0, the following code will run
      while(enemy1.health > 0){
      String directions = "\nYour options: Attack, Heal, Defend \nType in your move!";
      System.out.println(directions);
      String move = scanner.nextLine();
      //If something is inputted that is not Attack, Heal, or Defend, it will tell the player to try again
      while(!move.equals("Attack") && 
            !move.equals("Heal") && 
            !move.equals("Defend")) {
        System.out.println("That is not a valid move! Try again!");
        System.out.println(directions);
        move = scanner.nextLine();
      }

      //If the player attacks, it will do a randomized amount of damage to the enemy (between 3 and 7)
      if (move.equals("Attack")){
        int attack = (int)Math.random() * (7 - 4) + 3;
        enemy1.health = enemy1.health - attack;
        System.out.println("\nThe enemy took " + attack + " damage!");
        if (enemy1.health > 0){
          System.out.println(enemy1 + " is the current enemy health!");
          //Runs the methods for attacking the player and prints out the current player and enemy health in hearts
          System.out.println("\n" + name + " now has " + player1.enemyAttack() + " hearts after taking " + player1.damage + " damage!");
          //If the player dies, it terminates the code and tells you to restart to try it again
          if (player1.health <= 0){
            System.out.println("\n" + name + " has died! Please restart the code to try again!");
            System.exit(0);
          }
        }
        else{
          //Only prints if the enemy's health is equal to or less than 0
          System.out.println("The enemy is dead! GG");
        }
        
        
      }
      else if (move.equals("Heal")){
        //Heals a random amount of health for the player, between 5 and 12 hearts
        int heal = (int)Math.random() * (12 - 6) + 5;
        player1.health = player1.health + heal;
        System.out.println(name + " Healed 5 hearts!\n");
        System.out.println(player1 + " is your current health!");
        if (enemy1.health > 0){
          System.out.println(enemy1 + " is the current enemy health!");

          System.out.println("\n" + name + " now has " + player1.enemyAttack() + " hearts after taking " + player1.damage + " damage!");
          if (player1.health <= 0){
            System.out.println("\n" + name + " has died! Please restart the code to try again!");
            System.exit(0);
          }
        }
        else{
          System.out.println("The enemy is dead! GG");
        }
      }

      else if (move.equals("Defend")){
        //Assigns the isDefending Boolean value to true, which prompts the code in the enemyAttack method (in the Character class) to do less damage
        player1.isDefending = true;
        if (enemy1.health > 0){
          System.out.println(enemy1 + " is the current enemy health!");

          System.out.println("\n" + name + " now has " + player1.enemyAttack() + " hearts after taking " + player1.damage + " damage!");
          if (player1.health <= 0){
            System.out.println("\n" + name + " has died! Please restart the code to try again!");
            System.exit(0);
          }
        }
        else{
          System.out.println("The enemy is dead! GG");
        }
      }

    }
}      
//Only prints once the player defeats exactly 3 enemies
System.out.println("You just beat 3 enemies and won the game! Play again!");
System.exit(0);
}

      
}






/* CHECKLIST FOR REQUIREMENTS
if statements DONE
if-else statements DONE
else if statements DONE
compound boolean expressions DONE
comparing objects DONE
while loop DONE
for loop DONE
nested iteration DONE */