package lotr;

public class ElfKickStrategy implements KickStrategy {
    @Override public void kick(Character self, Character enemy) {
        if (self.getPower() > enemy.getPower()) {
            enemy.setHp(0);                 
        } else {
            enemy.setPower(enemy.getPower() - 1);
        }
    }
}
