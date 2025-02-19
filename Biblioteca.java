import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String getLibros() {
        if (libros.isEmpty()) {
            return "La biblioteca no tiene libros.";
        }
        StringBuilder sb = new StringBuilder();
        for (Libro libro : libros) {
            sb.append(libro.toString()).append("\n\n");
        }
        return sb.toString();
    }
    
    public String buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.toString().contains(titulo)) {
                return libro.getInformacion();
            }
        }
        return "Libro no encontrado.";
    }
    
    @Override
    public String toString() {
        return getLibros();
    }
}