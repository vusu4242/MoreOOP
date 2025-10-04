package lotr;

import java.util.Random;


public abstract class Noble extends Character{
     private static final Random RANDOM = new Random();
     public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(RANDOM.nextInt(maxPower-minPower)+minPower, RANDOM.nextInt(maxHp-minHp)+minHp);
        setKickStrategy(new RandomDamageKickStrategy());
     }

}
