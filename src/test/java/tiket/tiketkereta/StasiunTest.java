package tiket.tiketkereta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StasiunTest {

    @Test
    public void testStasiunConstructorAndGetters() {
        Stasiun stasiun = new Stasiun("Gambir", "Jakarta");
        assertEquals("Gambir", stasiun.getNama_stasiun());
        assertEquals("Jakarta", stasiun.getKota());
    }

    @Test
    public void testToString() {
        Stasiun stasiun = new Stasiun("Bandung", "Bandung");
        assertEquals("Stasiun Bandung, Bandung", stasiun.toString());
    }
}
