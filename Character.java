import java.lang.Math;
import java.util.Scanner;

// Class to create the health and damage for both the playable character and enemy

public class Character{
        private int health = 0;
        private String name = "";
        private int damage = 0;
        Boolean isDefending = false;

        Scanner scanner = new Scanner(System.in);
        //If a name is given, it assigns a default health of 20 to you and assigns the name
        public Character(String theName){
        health = 20;
        name = theName;
        } 
        
        //Randomizes the health for your character and adds a default name, making sure that it is a different experience each time
        public Character(){
          health = (int)(Math.random() * (20 - 15) + 8);
          name = "Joe";
        }
        
        //Appropriate getter and setter methods for the class
        
        public int getHealth(){
          return health;
        }

         public void setHealth(int newHealth){
          health = newHealth;
        }

        public int getDamage(){
          return damage;
        }

        //Method used to determine the amount of damage done by an enemy
        public int enemyAttack(){
          if (isDefending == true){
            damage = (int)(Math.random() * (5 - 2) + 1);
          health = health - damage;
          isDefending = false;
          System.out.println("Defended and took less damage!");
          return health;
          }
          else{
          damage = (int)(Math.random() * (7 - 4) + 3);
          health = health - damage;
          return health;
          }
          
        }

        public String toString()
    {
        return health + "";
    }
    }
