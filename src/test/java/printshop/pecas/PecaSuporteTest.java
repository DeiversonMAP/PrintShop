package printshop.pecas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PecaSuporteTest {

    @Test
    void deveImprimirSuporte() {
        IPeca peca = new PecaSuporte();
        assertEquals("Imprimindo suporte", peca.imprimir());
    }
}
