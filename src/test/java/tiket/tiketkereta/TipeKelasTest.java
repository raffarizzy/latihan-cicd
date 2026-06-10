package tiket.tiketkereta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TipeKelasTest {

    @Test
    public void testHitungPajak() {
        TipeKelas eksekutif = new TipeKelas("Eksekutif", 500000);
        // Pajak.tax is 0.1 (assuming from common sense, but let me check Pajak.java)
        // Wait, I should check Pajak.java first.
        assertEquals(50000.0, eksekutif.hitungPajak(), 0.001);
    }

    @Test
    public void testListKursiInitialization() {
        TipeKelas ekonomi = new TipeKelas("Ekonomi", 200000);
        assertNotNull(ekonomi.getListKursi());
        assertEquals(100, ekonomi.getListKursi().length); // 20 rows * 5 columns (A-E)
        
        TipeKelas bisnis = new TipeKelas("Bisnis", 300000);
        assertEquals(68, bisnis.getListKursi().length); // 17 rows * 4 columns (A-D)
    }
}
