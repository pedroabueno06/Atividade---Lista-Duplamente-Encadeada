//1. Estrutura do nó 
//Crie a estrutura de um nó de uma lista duplamente encadeada contendo: 
//um valor inteiro 
//um ponteiro para o nó anterior 
//um ponteiro para o próximo nó 

public class No1 {
    int valor1;
    No1 anterior1;
    No1 proximo1;

    public No1(int valor) {
        this.valor1 = valor;
        this.anterior1 = null;
        this.proximo1 = null;
    }
}
