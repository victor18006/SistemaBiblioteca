public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Azteca", "Gary Jennings", 1980, "978-9-706-90326-6");
        Libro libro2 = new Libro("Sangre Azteca", "Gary Márquez", 2001, "978-6070782220");
        Libro libro3 = new Libro("El principito", "George Orwell", 2007, "978-0-452-28423-4");
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Lista de libros en la biblioteca:");
        System.out.println(biblioteca.getLibros());

        System.out.println("Libro a buscar: Harry Potter");
        System.out.println(biblioteca.buscarLibroPorTitulo("Harry Potter"));
    }
}