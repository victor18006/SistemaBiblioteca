public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String isbn;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.isbn = isbn;
    }

    public String getInformacion() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nAño de Publicación: " + añoPublicacion + "\nISBN: " + isbn + "\nLibro mayor de 20 años: " + esAntiguo();
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
}