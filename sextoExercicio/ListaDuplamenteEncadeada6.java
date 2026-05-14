public class ListaDuplamenteEncadeada6 {
    private No6 inicio6;
    private No6 fim6;

    public ListaDuplamenteEncadeada6() {
        inicio6 = null;
        fim6 = null;
    }

    public boolean estaVazia6() {
        return inicio6 == null;
    }

    public void inserirNoFinal6(int valor6) {
        No6 novo = new No6(valor6);

        if (estaVazia6()) {
            inicio6 = fim6 = novo;
        } else {
            novo.anterior6 = fim6;
            fim6.proximo6 = novo;
            fim6 = novo;
        }
    }

    public void removerInicio6() {

        if (estaVazia6()) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio6 == fim6) {
            inicio6 = null;
            fim6 = null;
        } else {
            inicio6 = inicio6.proximo6;
            inicio6.anterior6 = null;
        }
    }

    public void imprimir6() {
        No6 atual = inicio6;

        while (atual != null) {
            System.out.print(atual.valor6 + " ");
            atual = atual.proximo6;
        }

        System.out.println();
    }
}