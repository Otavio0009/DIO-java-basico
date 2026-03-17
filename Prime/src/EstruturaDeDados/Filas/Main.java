package EstruturaDeDados.Filas;

public class Main {
    public static void main(String[] args) {
        
        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);
        System.out.println("------------------------------");
        System.out.println(minhaFila.dequeue()); // Remove o primeiro elemento da fila e o retorna
        System.out.println(minhaFila);

        minhaFila.enqueue("Quinto");

        System.out.println("------------------------------");
        System.out.println(minhaFila);

        System.out.println("------------------------------");
        System.out.println(minhaFila.first()); // Consulta o primeiro elemento da fila sem removê-lo
        System.out.println(minhaFila);

    }
}
