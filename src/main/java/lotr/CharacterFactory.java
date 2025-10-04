package lotr;
import java.util.Random;

public class CharacterFactory {
    private final Random rnd = new Random();

    public Character createCharacter() {
        int i = rnd.nextInt(4);
        switch (i) {
            case 0: return new Hobbit();
            case 1: return new Elf();
            case 2: return new King();
            default: return new Knight();
        }
    }
}
