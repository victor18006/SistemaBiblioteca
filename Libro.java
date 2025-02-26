public class Libro {
    private String titulo;
    private Autor autor;
    private int añoPublicacion;
    private String isbn;
    private boolean estaPrestado;

    public Libro(String titulo, Autor autor, int añoPublicacion, String isbn, boolean estaPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
        this.estaPrestado = estaPrestado;
    }

    public String getInformacion() {
        return "Título: " + titulo + "\nDatos Autor: " + autor + "\nAño de Publicación: " + añoPublicacion + "\nISBN: " + isbn + "\nLibro mayor de 20 años: " + esAntiguo();
    }
    
    public boolean esAntiguo(){
        if(añoPublicacion<2005){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getInformacion();
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean estaPrestado() {
        return estaPrestado;
    }
}