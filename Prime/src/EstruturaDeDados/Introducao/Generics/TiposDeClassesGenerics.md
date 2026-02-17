# Unknown Wildcard

imprime listas de qualquer coisa, des que tenha o tipo String emplementado

<code>
public void imprimeLista(List<?>lista) {
    for(Object obj : lista) {
        System.out.println(obj);
    }
}
List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
</code>

# UpperBounded Wildcard

 So consegui passa lista da class Pessoas e seus desendentes

<code>
public void imprimeLista(List<? extends Pessoa> listaPessoas) {
    for(Pessoa p : listaPessoas) {
        System.out.println(p);
    }
}

List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
</code>

# LowerBouded Wildcard

So aceita passa lista da class Pessoas assima, não pega seus desendents

<code>
public void imprimeLista (List<? super Pessoa> listaPessoas) {
    for(Pessoa : listaPessoas) {
        System.out.println(p);
    }
}

List<Aluno> minhaLista = new List<Aluno>();
imprimeLista(minhaLista);
</code>

# Convenção

K para "KEY", exemplo : Map<K,V>
V para "Value", exemplo : Map<K,V>
E para "Element", exemplo : List<E>
T para "Type", exemplo : Collections#addAll
? quando for genérico