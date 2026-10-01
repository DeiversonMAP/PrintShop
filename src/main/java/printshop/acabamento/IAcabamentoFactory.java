package printshop.acabamento;

public interface IAcabamentoFactory {
    ITinta criarTinta();
    IVerniz criarVerniz();
}
