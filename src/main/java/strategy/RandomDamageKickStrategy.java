package ua.ucu.apps.strategy;

import ua.ucu.apps.lab4.Character;
import java.util.Random;

public class RandomDamageKickStrategy implements KickStrategy {
    private final Random rnd = new Random();
    @Override public void kick(Character self, Character enemy) {
        int max = Math.max(1, self.getPower());
        int dmg = rnd.nextInt(max) + 1;
        enemy.setHp(enemy.getHp() - dmg);
    }
}
