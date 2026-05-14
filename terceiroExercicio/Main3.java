public class Main3 {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada3 lista3 = new ListaDuplamenteEncadeada3();

        System.out.println("Teste de inserção no início da lista:");
        // Teste lista vazia
        lista3.inserirNoInicio3(10);
        lista3.mostrar3();

        // Teste lista com elementos
        lista3.inserirNoInicio3(20);
        lista3.inserirNoInicio3(30);
        lista3.mostrar3();
    }
}