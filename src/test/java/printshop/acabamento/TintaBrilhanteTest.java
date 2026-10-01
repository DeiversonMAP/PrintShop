package printshop.acabamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TintaBrilhanteTest {

    @Test
    void deveAplicarTintaBrilhante() {
        ITinta tinta = new TintaBrilhante();
        assertEquals("Aplicando tinta brilhante", tinta.aplicar());
    }
}
