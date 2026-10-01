package printshop.acabamento;

public class AcabamentoBrilhanteFactory implements IAcabamentoFactory {
    @Override
    public ITinta criarTinta() {
        return new TintaBrilhante();
    }

    @Override
    public IVerniz criarVerniz() {
        return new VernizBrilhante();
    }
}
