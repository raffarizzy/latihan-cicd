package tiket.tiketkereta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilityTest {

    @Test
    public void testGenerateKode() {
        String kode = Utility.generateKode();
        assertNotNull(kode);
        assertEquals(5, kode.length());
    }

    @Test
    public void testFindKereta() {
        // Based on Utility.listKereta:
        // (new Kereta("Malabar",300000,400000,500000,listStasiun[1],listStasiun[0],listJadwal[1]))
        // listStasiun[1] is Malang, listStasiun[0] is Kiaracondong (Bandung)
        
        Kereta k = Utility.findKereta("Malabar", "Malang", "Bandung");
        assertNotNull(k);
        assertEquals("Malabar", k.getNama());
        
        Kereta notFound = Utility.findKereta("Malabar", "Jakarta", "Bandung");
        assertNull(notFound);
    }

    @Test
    public void testCheckKeretaOnRoad() {
        assertTrue(Utility.checkKeretaOnRoad("Malang", "Bandung"));
        assertFalse(Utility.checkKeretaOnRoad("Jakarta", "Malang"));
    }
}
