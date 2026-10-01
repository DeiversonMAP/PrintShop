package printshop.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoImpressoraTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {
        ConfiguracaoImpressora instancia1 = ConfiguracaoImpressora.getInstance();
        ConfiguracaoImpressora instancia2 = ConfiguracaoImpressora.getInstance();
        assertSame(instancia1, instancia2);
    }

    @Test
    void deveTerFabricantePadraoBambuLab() {
        assertEquals("Bambu Lab", ConfiguracaoImpressora.getInstance().getFabricantePadrao());
    }

    @Test
    void deveGerarNumerosDePedidoSequenciais() {
        ConfiguracaoImpressora config = ConfiguracaoImpressora.getInstance();
        int primeiro = config.gerarNumeroPedido();
        int segundo = config.gerarNumeroPedido();
        assertEquals(primeiro + 1, segundo);
    }
}
