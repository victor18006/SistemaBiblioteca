public class Autor {
    private int idAutor;
    private String nombre;
    private String correo;

    public Autor(int idAutor, String nombre, String correo){
        this.idAutor = idAutor;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "\nId Autor= " + idAutor + "\nNombre Autor= " + nombre + "\nCorreo= " + correo ;
    }

    
}