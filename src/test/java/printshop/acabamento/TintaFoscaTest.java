package printshop.acabamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TintaFoscaTest {

    @Test
    void deveAplicarTintaFosca() {
        ITinta tinta = new TintaFosca();
        assertEquals("Aplicando tinta fosca", tinta.aplicar());
    }
}
