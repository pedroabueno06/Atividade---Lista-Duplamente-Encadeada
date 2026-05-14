public class ListaDuplamenteEncadeada4 {
    private No4 inicio4;
    private No4 fim4;

    public ListaDuplamenteEncadeada4() {
        inicio4 = null;
        fim4 = null;
    }

    public boolean estaVazia() {
        return inicio4 == null;
    }

    public void inserirNoFinal4(int valor4) {
        No4 novo = new No4(valor4);

        if (estaVazia()) {
            inicio4 = novo;
            fim4 = novo;
        } else {
            novo.anterior4 = fim4;
            fim4.proximo4 = novo;
            fim4 = novo;
        }
    }

    public void mostrar4() {
        No4 atual = inicio4;

        while (atual != null) {
            System.out.print(atual.valor4 + " ");
            atual = atual.proximo4;
        }

        System.out.println();
    }
}