import java.lang.Math;

// Class to create the health and damage for an enemy

public class Enemy{
        private int health = 0;
        private int damage = 0;
        //Static variable to store the amount of enemies defeated
        private static int totalEnemies = 0;
        private static int enemiesKilled = 0;

        //Randomizes the health for enemies, making sure that it is a different experience each time
        public Enemy(){
          health = (int)(Math.random() * (15 - 9) + 8);
          totalEnemies++;
        }

        public Enemy(int health){
          this.health = health;
          totalEnemies++;
        }

        //Appropriate getter and setter methods for the class 
        public int getHealth(){
          return health;
        }
        
        public void setHealth(int newHealth){
          health = newHealth;
        }

        public static int getKilled(){
          return enemiesKilled;
        }
        
        public static void enemyKilled(){
          enemiesKilled++;
        }

        public int getDamage(){
          return damage;
        }

        //Static method to print the amount of enemies defeated
        public static int getTotalEnemies(){
          return totalEnemies;
        }

        public String toString()
    {
        return health + "";
    }
    }
  