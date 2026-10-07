public class Dispositivos {

    //  Declarar atributos
    private String nombre;
    private String tipo;
    private boolean activo;

    //  Métodos SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //  Métodos GET
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean getActivo() {
        return activo;
    }
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Estado del dispositivo: " + activo);
    }

    // Método activar
    public void activar() {
        activo = true;
        System.out.println("El dispositivo ha sido activado.");
    }

}