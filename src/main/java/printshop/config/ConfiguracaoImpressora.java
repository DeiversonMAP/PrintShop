package printshop.config;

public class ConfiguracaoImpressora {

    private static ConfiguracaoImpressora instancia;

    private String fabricantePadrao;
    private int proximoNumeroPedido;

    private ConfiguracaoImpressora() {
        this.fabricantePadrao = "Bambu Lab";
        this.proximoNumeroPedido = 1;
    }

    public static ConfiguracaoImpressora getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracaoImpressora();
        }
        return instancia;
    }

    public String getFabricantePadrao() {
        return fabricantePadrao;
    }

    public void setFabricantePadrao(String fabricantePadrao) {
        this.fabricantePadrao = fabricantePadrao;
    }

    public int gerarNumeroPedido() {
        return proximoNumeroPedido++;
    }
}
