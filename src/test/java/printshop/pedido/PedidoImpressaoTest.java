package printshop.pedido;

import printshop.acabamento.AcabamentoBrilhanteFactory;
import printshop.acabamento.AcabamentoFoscoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoImpressaoTest {

    @Test
    void deveMontarResumoComAcabamentoFosco() {
        PedidoImpressao pedido = new PedidoImpressao("Chaveiro", new AcabamentoFoscoFactory());
        String resumo = pedido.resumo();

        assertTrue(resumo.contains("Imprimindo chaveiro"));
        assertTrue(resumo.contains("Aplicando tinta fosca"));
        assertTrue(resumo.contains("Aplicando verniz fosco"));
    }

    @Test
    void deveMontarResumoComAcabamentoBrilhante() {
        PedidoImpressao pedido = new PedidoImpressao("Busto", new AcabamentoBrilhanteFactory());
        String resumo = pedido.resumo();

        assertTrue(resumo.contains("Imprimindo busto"));
        assertTrue(resumo.contains("Aplicando tinta brilhante"));
        assertTrue(resumo.contains("Aplicando verniz brilhante"));
    }

    @Test
    void deveGerarNumerosSequenciaisEntrePedidos() {
        PedidoImpressao pedido1 = new PedidoImpressao("Suporte", new AcabamentoFoscoFactory());
        PedidoImpressao pedido2 = new PedidoImpressao("Suporte", new AcabamentoBrilhanteFactory());

        assertEquals(pedido1.getNumero() + 1, pedido2.getNumero());
    }
}
