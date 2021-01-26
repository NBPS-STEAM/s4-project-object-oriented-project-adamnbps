import java.lang.Math;

// Class to create the health and damage for an enemy

public class Enemy{
        private int health = 0;
        private int damage = 0;

        //Randomizes the health for enemies, making sure that it is a different experience each time
        public Enemy(){
          health = (int)(Math.random() * (15 - 9) + 8);
        }
        //Method used to determine the amount of damage done by an enemy

        public int getHealth(){
          return health;
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
  