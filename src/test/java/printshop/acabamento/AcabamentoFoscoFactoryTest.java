package printshop.acabamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcabamentoFoscoFactoryTest {

    private final IAcabamentoFactory factory = new AcabamentoFoscoFactory();

    @Test
    void deveCriarTintaFosca() {
        assertTrue(factory.criarTinta() instanceof TintaFosca);
    }

    @Test
    void deveCriarVernizFosco() {
        assertTrue(factory.criarVerniz() instanceof VernizFosco);
    }
}
