package CaracteristicasDaLinguagemJava2.List.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("kaio");
        nomes.add("maria");
        nomes.add("ana");
        nomes.add("joão");
        nomes.add("lucas");

        System.out.println(nomes);
        //ordenando
        Collections.sort(nomes);
        System.out.println(nomes);

        //troca o valor da posição
        nomes.set(1, "maiara");
        System.out.println(nomes);

        //remove
        nomes.remove(1);
        nomes.remove("joão");
        System.out.println(nomes);

        //pega o valor do indice
        String pegaNome = nomes.get(1);
        System.out.println(pegaNome);

        //pegar tamanho
        int tamanho =  nomes.size();
        System.out.println(tamanho);

        //veridica se contém
        boolean nomeKaio =  nomes.contains("kaio");
        System.out.println(nomeKaio);

        //veridica se lista vazia
        boolean listaVazia =  nomes.isEmpty();
        System.out.println(listaVazia);

        //veridica a posição
        int posicao =  nomes.indexOf("kaio");
        System.out.println(posicao);

        //limpa a lista
//        nomes.clear();
//        System.out.println(nomes);

        for ( String nome :nomes){
            System.out.println(nome);
        }

        //usando itarator



    }
}
