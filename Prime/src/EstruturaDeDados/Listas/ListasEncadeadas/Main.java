package EstruturaDeDados.Listas.ListasEncadeadas;

public class Main {
    public static void main(String[] args) {
        Lista<String> minhListaEncadeada = new Lista<>();

        minhListaEncadeada.add("Teste 1");
        minhListaEncadeada.add("Teste 2");
        minhListaEncadeada.add("Teste 3");
        minhListaEncadeada.add("Teste 4");

        System.out.println(minhListaEncadeada.get(0));
        System.out.println(minhListaEncadeada.get(1));
        System.out.println(minhListaEncadeada.get(2));
        System.out.println(minhListaEncadeada.get(3));

        System.out.println(minhListaEncadeada.toString());

        minhListaEncadeada.remove(3);

        System.out.println(minhListaEncadeada);
    }
}
