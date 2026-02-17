package EstruturaDeDados.Introducao.ConceitoNo;

public class Main {

    public static void main(String[] args) {
        
        No no1 = new No("Conteudo no 1");
        No no2 = new No("Conteudo no 2");
        No no3 = new No("Conteudo no 3");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);

        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);

        System.out.println("------------------------------");

        System.out.println(no1);
        System.out.println(no1.getProximoNo()); // Imprime o conteúdo do nó 2
        System.out.println(no1.getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 3
    }


}