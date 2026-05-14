public class ListaDuplamenteEncadeada7 {
    private No7 inicio7;
    private No7 fim7;

    public ListaDuplamenteEncadeada7() {
        inicio7 = null;
        fim7 = null;
    }

    public boolean estaVazia7() {
        return inicio7 == null;
    }

    public void inserirNoFinal7(int valor7) {
        No7 novo = new No7(valor7);

        if (estaVazia7()) {
            inicio7 = fim7 = novo;
        } else {
            novo.anterior7 = fim7;
            fim7.proximo7 = novo;
            fim7 = novo;
        }
    }

    public void removerFinal7() {

        if (estaVazia7()) {
            System.out.println("Lista vazia.");
            return;
        }

        if (inicio7 == fim7) {
            inicio7 = null;
            fim7 = null;
        } else {
            fim7 = fim7.anterior7;
            fim7.proximo7 = null;
        }
    }

    public void imprimir7() {
        No7 atual = inicio7;

        while (atual != null) {
            System.out.print(atual.valor7 + " ");
            atual = atual.proximo7;
        }

        System.out.println();
    }
}
