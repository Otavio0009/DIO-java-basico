package EstruturaDeDados.Introducao.Generics;

public class Main2 {
    public static void main(String[] args) {
        No2<String> no1 = new No2<>("Conteudo no 1");
        No2<String> no2 = new No2<>("Conteudo no 2");
        No2<String> no3 = new No2<>("Conteudo no 3");

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
