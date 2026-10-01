package printshop.pecas;

public class PecaFactory {

    public static IPeca obterPeca(String tipo) {
        Class<?> classe;
        Object objeto;
        try {
            classe = Class.forName("printshop.pecas.Peca" + tipo);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("Peça inexistente");
        }
        if (!(objeto instanceof IPeca)) {
            throw new IllegalArgumentException("Peça inválida");
        }
        return (IPeca) objeto;
    }
}
