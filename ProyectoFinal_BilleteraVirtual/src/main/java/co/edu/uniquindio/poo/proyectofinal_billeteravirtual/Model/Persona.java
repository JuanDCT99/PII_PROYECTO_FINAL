package co.edu.uniquindio.poo.proyectofinal_billeteravirtual.Model;

public class Persona {

    private String nombre;
    private String idGeneral;
    private String email;
    private String telefono;
    private String direccion;

    public Persona(String nombre, String idGeneral, String email, String telefono, String direccion) {
        this.nombre = nombre;
        this.idGeneral = idGeneral;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdGeneral() {
        return idGeneral;
    }

    public void setIdGeneral(String idGeneral) {
        this.idGeneral = idGeneral;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", idGeneral='" + idGeneral + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", director='" + direccion + '\'' +
                '}';
    }
}
