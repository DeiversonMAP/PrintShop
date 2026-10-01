package printshop.pecas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PecaChaveiroTest {

    @Test
    void deveImprimirChaveiro() {
        IPeca peca = new PecaChaveiro();
        assertEquals("Imprimindo chaveiro", peca.imprimir());
    }
}
