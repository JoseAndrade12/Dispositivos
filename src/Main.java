import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {

        // Crear los dos objetos
        Dispositivos dispositivo1 = new Dispositivos();
        Dispositivos dispositivo2 = new Dispositivos();

        // Asignar datos usando SET
        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(false);

        dispositivo2.setNombre("Celular");
        dispositivo2.setTipo("Smartphone");
        dispositivo2.setActivo(true);

        // Mostrar información
        System.out.println(" DISPOSITIVO 1 MODIFICADO");
        dispositivo1.mostrarInformacion();

        // Modificar dispositivo 1
        dispositivo1.setNombre("PC Gamer");
        System.out.println("\n DISPOSITIVO 1 MODIFICADO ");
        dispositivo1.mostrarInformacion();

        // Activar dispositivo 2
        dispositivo2.activar();
        System.out.println("DISPOSITIVO 2 ACTUALIZADO");
        dispositivo2.mostrarInformacion();
    }
}