package DataBaseManagement;


public class Contacto {
    
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String telefono1;
    private String telefono2;
    private String empresa;
    private String correo;
    
    //CONSTRUCTOR
    public Contacto(String nombre, String apellido, String telefono1, String telefono2, String empresa, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.empresa = empresa;
        this.correo = correo;
    }
    //GQTTERS AND SETTERS
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    //Agregar contactos
    
    
}
