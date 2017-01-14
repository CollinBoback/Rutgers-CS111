package com.company;

public class Main {


    public class Dragon {
        public Damage breathFire() {
            return new Damage(100);
        }
    }

    public class Hero {
        private int health = 500;

        public void fight(Dragon dragon) {
            health -= dragon.breathFire().getAmount();
        }
    }

    public class Damage {
        private int amount;

        public Damage(int amount) {

            amount*5

        }

        public int getAmount() {
            return amount;
        }
    }


}

