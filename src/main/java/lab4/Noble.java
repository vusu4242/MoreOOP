package ua.ucu.apps.lab4;

import java.util.Random;
import ua.ucu.apps.strategy.RandomDamageKickStrategy;


public abstract class Noble extends Character{
     private static final Random RANDOM = new Random();
     public Noble(int minPower, int maxPower, int minHp, int maxHp){
        super(RANDOM.nextInt(maxPower-minPower)+minPower, RANDOM.nextInt(-minHp)+minHp);
        setKickStrategy(new RandomDamageKickStrategy());
     }

}
