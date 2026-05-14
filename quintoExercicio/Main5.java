public class Main5 {
 public static void main(String[] args) {

        ListaDuplamenteEncadeada5 lista5 = new ListaDuplamenteEncadeada5();

        lista5.inserirNoFinal(10);
        lista5.inserirNoFinal(20);
        lista5.inserirNoFinal(30);

        System.out.println("Início para fim:");
        lista5.imprimirInicioFim();

        System.out.println("\nFim para início:");
        lista5.imprimirFimInicio();
    }
}