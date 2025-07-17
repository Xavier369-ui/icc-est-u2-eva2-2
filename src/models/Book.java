package models;

public class Book {
    private static int contador = 0;

    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        contador++;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anio=" + anio +
                '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return this.anio == other.anio && this.titulo.equals(other.titulo);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + titulo.hashCode();
        result = 31 * result + anio;
        return result;
    }
    
    
    
}
