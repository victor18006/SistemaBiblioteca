public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor(180, "Gary Jennings", "gabriel@libros.edu.mx");
        Autor autor2 = new Autor(362, "Gary Márquez", "marquez@libros.edu.mx");
        Autor autor3 = new Autor(957, "Antoine de Saint-Exupéry", "antoine@libros.edu.mx");


        Libro libro1 = new Libro("Azteca", autor1, 1980, "978-9-706-90326-6",false);
        Libro libro2 = new Libro("Sangre Azteca", autor2, 2001, "978-6070782220", true);
        Libro libro3 = new Libro("El principito", autor3, 2007, "978-0-452-28423-4", true);
        
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        System.out.println("Lista de libros en la biblioteca:");
        System.out.println(biblioteca.getLibros());

        System.out.println("Libro a buscar: Harry Potter");
        System.out.println(biblioteca.buscarLibroPorTitulo("Harry Potter"));

        System.out.println("\n\nLibros prestados:");
        for (Libro libro : biblioteca.obtenerLibrosPrestados(true)) {
            System.out.println("\n" + libro);
        }

        // Libros no prestados
        System.out.println("\n\nLibros no prestados:");
        for (Libro libro : biblioteca.obtenerLibrosPrestados(false)) {
            System.out.println("\n" + libro);
        }
    }
}