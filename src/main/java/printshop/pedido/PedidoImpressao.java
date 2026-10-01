package printshop.pedido;

import printshop.acabamento.IAcabamentoFactory;
import printshop.acabamento.ITinta;
import printshop.acabamento.IVerniz;
import printshop.config.ConfiguracaoImpressora;
import printshop.pecas.IPeca;
import printshop.pecas.PecaFactory;

public class PedidoImpressao {

    private final int numero;
    private final IPeca peca;
    private final ITinta tinta;
    private final IVerniz verniz;

    public PedidoImpressao(String tipoPeca, IAcabamentoFactory acabamentoFactory) {
        this.numero = ConfiguracaoImpressora.getInstance().gerarNumeroPedido();
        this.peca = PecaFactory.obterPeca(tipoPeca);
        this.tinta = acabamentoFactory.criarTinta();
        this.verniz = acabamentoFactory.criarVerniz();
    }

    public int getNumero() {
        return numero;
    }

    public String resumo() {
        String fabricante = ConfiguracaoImpressora.getInstance().getFabricantePadrao();
        return "Pedido #" + numero + " (" + fabricante + "): "
                + peca.imprimir() + " -> " + tinta.aplicar() + " -> " + verniz.aplicar();
    }
}
