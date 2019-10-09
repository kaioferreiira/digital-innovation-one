package CaracteristicasDaLinguagemJava2.set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {


        TreeSet<String> treeCapitais = new TreeSet<>();


        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Floripa");
        treeCapitais.add("BH");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Campo Grande");


        System.out.println(treeCapitais);


        //retorna primeira capital topo da arvore
        System.out.println(treeCapitais.first());


        //retorna primeira capital final da arvore
        System.out.println(treeCapitais.last());

        //retorna primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.lower("Floripa"));

        //retorna primeira capital abaixo na arvore da capital parametrizada
        System.out.println(treeCapitais.higher("Floripa"));


        //retorna primeira capital no topo da arvore  removendo
        System.out.println(treeCapitais.pollFirst());

        //retorna primeira capital no final da arvore removendo
        System.out.println(treeCapitais.pollLast());


        System.out.println(treeCapitais);


        //Navegar no treeSet

        Iterator<String> cidades =  treeCapitais.iterator();

        while (cidades.hasNext()){
            System.out.println(cidades.next());
        }

        for (String cidade:  treeCapitais){
            System.out.println(cidade);
        }

        //limpa lista
        treeCapitais.clear();


        //retorna se está vazia
        System.out.println(treeCapitais.isEmpty());


    }
}
