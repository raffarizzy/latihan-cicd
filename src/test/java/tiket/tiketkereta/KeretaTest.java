package tiket.tiketkereta;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KeretaTest {
    private Stasiun malang;
    private Stasiun bandung;
    private Jadwal jadwal;
    private Kereta malabar;

    @BeforeEach
    public void setUp() {
        malang = new Stasiun("Malang", "Malang");
        bandung = new Stasiun("Kiaracondong", "Bandung");
        jadwal = new Jadwal("16:00", "04:00");
        malabar = new Kereta("Malabar", 300000, 400000, 500000, malang, bandung, jadwal);
    }

    @Test
    public void testIsOnRouteSuccess() {
        assertTrue(malabar.isOnRoute("Malang", "Bandung"));
    }

    @Test
    public void testIsOnRouteFailure() {
        assertFalse(malabar.isOnRoute("Jakarta", "Bandung"));
        assertFalse(malabar.isOnRoute("Malang", "Jakarta"));
    }

    @Test
    public void testGetNama() {
        assertEquals("Malabar", malabar.getNama());
    }

    @Test
    public void testGetTipeKelas() {
        assertNotNull(malabar.getTipeKelas("Ekonomi"));
        assertEquals(300000, malabar.getTipeKelas("Ekonomi").getHarga());
        assertEquals("Ekonomi", malabar.getTipeKelas("Ekonomi").getNamaTipe());
    }
}
