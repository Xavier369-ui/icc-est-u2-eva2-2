package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import models.Book;

public class LibroController {
    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Comparator<Book> bookComparator = (b1, b2) -> {
            int cmpTitulo = b2.getTitulo().compareTo(b1.getTitulo()); 
            if (cmpTitulo != 0) return cmpTitulo;
            return Integer.compare(b1.getAnio(), b2.getAnio()); 
        };

        Map<Book, Book> libroMap = new TreeMap<>(bookComparator);

        for (Book libro : libros) {
            libroMap.putIfAbsent(libro, libro); 
        }

        return libroMap;
    }



}
