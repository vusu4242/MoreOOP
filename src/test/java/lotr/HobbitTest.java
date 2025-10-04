package lotr;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class HobbitTest {
    private Hobbit character;

    @BeforeEach
    public void init() {
        character = new Hobbit();
    }

    @Test
    public void testToString() {
        assertEquals(3, character.getHp());
        assertEquals("Hobbit{hp=3, power=0}", character.toString());
    }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof lotr.Character);
    }

    @Test
    public void testSetHp() {
        character.setHp(-100);
        assertEquals(0, character.getHp());
    }
}