package CaracteristicasDaLinguagemJava2.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {


        LinkedHashSet<Integer> sequenciaNumerica =  new LinkedHashSet<>();

        sequenciaNumerica.add(1);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(6);
        sequenciaNumerica.add(7);
        sequenciaNumerica.add(9);
        sequenciaNumerica.add(33);

        System.out.println(sequenciaNumerica);

        //remove
        sequenciaNumerica.remove(6);
        System.out.println(sequenciaNumerica);


        //retorna a quantidade de itens no set
        System.out.println(sequenciaNumerica.size());

        //navega em todos os itens com o iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer numero:  sequenciaNumerica){
            System.out.println(numero);
        }

        //limpar set
        sequenciaNumerica.clear();

        //retorna se está vazia
        System.out.println(sequenciaNumerica.isEmpty());





    }
}
