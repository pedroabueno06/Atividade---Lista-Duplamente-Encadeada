public class ListaDuplamenteEncadeada9 {
    private No9 inicio9;
    private No9 fim9;

    public boolean estaVazia9() {
        return inicio9 == null;
    }

    public void inserirOrdenado9(int valor9) {

        No9 novo = new No9(valor9);

        if (estaVazia9()) {
            inicio9 = fim9 = novo;
            return;
        }

        No9 atual9 = inicio9;

        while (atual9 != null && atual9.valor9 < valor9) {
            atual9 = atual9.proximo9;
        }

        if (atual9 == null) {
            novo.anterior9 = fim9;
            fim9.proximo9 = novo;
            fim9 = novo;
        }

        else if (atual9 == inicio9) {
            novo.proximo9 = inicio9;
            inicio9.anterior9 = novo;
            inicio9 = novo;
        }

        else {
            No9 anterior9 = atual9.anterior9;

            novo.proximo9 = atual9;
            novo.anterior9 = anterior9;

            anterior9.proximo9 = novo;
            atual9.anterior9 = novo;
        }
    }

    public void imprimir9() {
        No9 atual9 = inicio9;

        while (atual9 != null) {
            System.out.print(atual9.valor9 + " ");
            atual9 = atual9.proximo9;
        }

        System.out.println();
    }
}
