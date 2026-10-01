package printshop.pecas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PecaBustoTest {

    @Test
    void deveImprimirBusto() {
        IPeca peca = new PecaBusto();
        assertEquals("Imprimindo busto", peca.imprimir());
    }
}
