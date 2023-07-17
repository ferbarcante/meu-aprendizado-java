package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("Maria");
        list.add("Pedro");
        list.add(1, "Marcos");
        list.add("Anna");
        list.add("Amanda");

        System.out.println(list.size());


        for(String x : list){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("===============================");
        System.out.println();
        list.removeIf(x -> x.charAt(0) == 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println();
        System.out.println("===============================");
        System.out.println();
        System.out.println("Index of Anna: " + list.indexOf("Anna"));

        System.out.println();
        System.out.println("===============================");
        System.out.println();

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String x : result){
            System.out.println(x);
        }


    }

}
