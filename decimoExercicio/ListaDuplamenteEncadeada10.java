public class ListaDuplamenteEncadeada10 {
    private No10 inicio10;
    private No10 fim10;

    public boolean estaVazia10() {
        return inicio10 == null;
    }

    public void inserirNoFinal10(int valor10) {
        No10 novo = new No10(valor10);

        if (estaVazia10()) {
            inicio10 = fim10 = novo;
        } else {
            novo.anterior10 = fim10;
            fim10.proximo10 = novo;
            fim10 = novo;
        }
    }

    public void removerValor10(int valor10) {

        if (estaVazia10()) {
            System.out.println("Lista vazia.");
            return;
        }

        No10 atual10 = inicio10;

        while (atual10 != null && atual10.valor10 != valor10) {
            atual10 = atual10.proximo10;
        }

        if (atual10 == null) {
            System.out.println("Valor não encontrado.");
            return;
        }

        if (atual10 == inicio10) {
            inicio10 = inicio10.proximo10;

            if (inicio10 != null) {
                inicio10.anterior10 = null;
            } else {
                fim10 = null;
            }
        }

        else if (atual10 == fim10) {
            fim10 = fim10.anterior10;

            if (fim10 != null) {
                fim10.proximo10 = null;
            } else {
                inicio10 = null;
            }
        }

        else {
            atual10.anterior10.proximo10 = atual10.proximo10;
            atual10.proximo10.anterior10 = atual10.anterior10;
        }
    }

    public void imprimir10() {
        No10 atual10 = inicio10;

        while (atual10 != null) {
            System.out.print(atual10.valor10 + " ");
            atual10 = atual10.proximo10;
        }

        System.out.println();
    }
}
