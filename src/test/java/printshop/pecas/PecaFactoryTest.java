package printshop.pecas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PecaFactoryTest {

    @Test
    void deveCriarChaveiro() {
        assertTrue(PecaFactory.obterPeca("Chaveiro") instanceof PecaChaveiro);
    }

    @Test
    void deveCriarBusto() {
        assertTrue(PecaFactory.obterPeca("Busto") instanceof PecaBusto);
    }

    @Test
    void deveCriarSuporte() {
        assertTrue(PecaFactory.obterPeca("Suporte") instanceof PecaSuporte);
    }

    @Test
    void deveLancarExcecaoParaPecaInexistente() {
        assertThrows(IllegalArgumentException.class, () -> PecaFactory.obterPeca("Boneco"));
    }
}
