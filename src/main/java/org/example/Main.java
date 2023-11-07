package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("uno");
        lista.add("dos");
        lista.add("trES");
        stringToUpperCase(lista);
        System.out.println(stringToUpperCase(lista));

        List<String> listita = new ArrayList<>();
        listita.add("lalalalalalalalalala");
        listita.add("nombres");
        listita.add("nononononono");
        listita.add("palabras");
        System.out.println(palabrasDeTalLargo(listita, 6));

    }

    /*static void stringToUpperCase(ArrayList<String> lista) {
        lista.forEach(s -> lista.set(lista.indexOf(s), s.toUpperCase()));
        System.out.println(lista);
    }*/
    static List<String> stringToUpperCase(ArrayList<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        //System.out.println(upperCaseList);
    }
    public static String palabrasDeTalLargo (List<String> listita, int n) {
       return listita.stream()
                .filter(a -> a.length() > n)
                .collect(Collectors.joining(", "));
    }
}