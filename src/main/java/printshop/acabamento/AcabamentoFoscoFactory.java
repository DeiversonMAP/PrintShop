package printshop.acabamento;

public class AcabamentoFoscoFactory implements IAcabamentoFactory {
    @Override
    public ITinta criarTinta() {
        return new TintaFosca();
    }

    @Override
    public IVerniz criarVerniz() {
        return new VernizFosco();
    }
}
