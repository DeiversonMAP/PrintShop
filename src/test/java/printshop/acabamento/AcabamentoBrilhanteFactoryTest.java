package printshop.acabamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcabamentoBrilhanteFactoryTest {

    private final IAcabamentoFactory factory = new AcabamentoBrilhanteFactory();

    @Test
    void deveCriarTintaBrilhante() {
        assertTrue(factory.criarTinta() instanceof TintaBrilhante);
    }

    @Test
    void deveCriarVernizBrilhante() {
        assertTrue(factory.criarVerniz() instanceof VernizBrilhante);
    }
}
