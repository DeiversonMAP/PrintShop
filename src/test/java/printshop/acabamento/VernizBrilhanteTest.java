package printshop.acabamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VernizBrilhanteTest {

    @Test
    void deveAplicarVernizBrilhante() {
        IVerniz verniz = new VernizBrilhante();
        assertEquals("Aplicando verniz brilhante", verniz.aplicar());
    }
}
