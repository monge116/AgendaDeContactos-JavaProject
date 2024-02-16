package modelo.javabean;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;

    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    /**
     * Constructor vacio para el Objeto Contacto
     */
    public Contacto() {
    }

    /**
     * Método para obtener el valor de la clave única
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Método para establecer el valor de la clave única
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", empresa='" + empresa + '\'' +
                '}';
    }

    /**
     * Dos contactos no pueden tener le mismo nombre
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
