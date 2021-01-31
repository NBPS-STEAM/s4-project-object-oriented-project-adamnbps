import java.lang.Math;

// Class to create the health and damage for an enemy

public class Enemy{
        private int health = 0;
        private int damage = 0;
        private static int totalEnemies = 0;

        //Randomizes the health for enemies, making sure that it is a different experience each time
        public Enemy(){
          health = (int)(Math.random() * (15 - 9) + 8);
          totalEnemies++;
        }

        //Appropriate getter and setter methods for the class 
        public int getHealth(){
          return health;
        }

        public static int getTotalEnemies(){
          return totalEnemies;
        }

        public void setHealth(int newHealth){
          health = newHealth;
        }

        public int getDamage(){
          return damage;
        }

        public String toString()
    {
        return health + "";
    }
    }
  