package EstruturaDeDados.Pilhas;

public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No3(1));
        minhaPilha.push(new No3(2));
        minhaPilha.push(new No3(3));
        minhaPilha.push(new No3(4));

        System.out.println(minhaPilha);

        System.out.println("Top: " + minhaPilha.top());
        System.out.println(minhaPilha);

        System.out.println("Pop: " + minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(new No3(5));
        System.out.println(minhaPilha);


    }
}
