public class Main7 {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada7 lista = new ListaDuplamenteEncadeada7();

        System.out.println("Lista vazia? " + lista.estaVazia7());
        lista.inserirNoFinal7(10);
        lista.inserirNoFinal7(20);
        lista.inserirNoFinal7(30);

        lista.imprimir7();

        lista.removerFinal7();
        lista.imprimir7();

        lista.removerFinal7();
        lista.imprimir7();

        lista.removerFinal7();
        lista.imprimir7();

        lista.removerFinal7();
        lista.imprimir7();
    }
}
