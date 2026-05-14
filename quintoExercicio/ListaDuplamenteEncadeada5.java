public class ListaDuplamenteEncadeada5 {
    private No5 inicio5;
    private No5 fim5;

    public ListaDuplamenteEncadeada5() {
        inicio5 = null;
        fim5 = null;
    }

    public boolean estaVazia() {
        return inicio5 == null;
    }

    public void inserirNoFinal(int valor5) {
        No5 novo = new No5(valor5);

        if (estaVazia()) {
            inicio5 = novo;
            fim5 = novo;
        } else {
            novo.anterior5 = fim5;
            fim5.proximo5 = novo;
            fim5 = novo;
        }
    }

    public void imprimirInicioFim() {
        No5 atual = inicio5;

        while (atual != null) {
            System.out.print(atual.valor5 + " ");
            atual = atual.proximo5;
        }

        System.out.println();
    }

    public void imprimirFimInicio() {
        No5 atual = fim5;

        while (atual != null) {
            System.out.print(atual.valor5 + " ");
            atual = atual.anterior5;
        }

        System.out.println();
    }
}
