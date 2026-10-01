package printshop.acabamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VernizFoscoTest {

    @Test
    void deveAplicarVernizFosco() {
        IVerniz verniz = new VernizFosco();
        assertEquals("Aplicando verniz fosco", verniz.aplicar());
    }
}
