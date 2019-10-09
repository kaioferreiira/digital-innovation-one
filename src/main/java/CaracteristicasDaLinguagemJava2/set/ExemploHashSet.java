package CaracteristicasDaLinguagemJava2.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set<Double> notaAlunos =  new HashSet<>();

        notaAlunos.add(5.1);
        notaAlunos.add(2.8);
        notaAlunos.add(5.3);
        notaAlunos.add(9.8);
        notaAlunos.add(3.6);
        notaAlunos.add(5.8);
        notaAlunos.add(1.9);
        notaAlunos.add(5.5);
        notaAlunos.add(7.4);

        System.out.println(notaAlunos);

        //remove
        notaAlunos.remove(5.1);
        System.out.println(notaAlunos);


        //retorna a quantidade de itens no set
        System.out.println(notaAlunos.size());

        //navega em todos os itens com o iterator
        Iterator<Double>  iterator = notaAlunos.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Double nota:  notaAlunos){
            System.out.println(nota);
        }

        //limpar set
        notaAlunos.clear();

        //retorna se está vazia
        System.out.println(notaAlunos.isEmpty());

    }
}
