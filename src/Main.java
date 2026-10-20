import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();

        dispositivo1.setNombre("Laptop");
        dispositivo1.setTipo("Computadora");
        dispositivo1.setActivo(true);

        dispositivo2.setNombre("Mouse");
        dispositivo2.setTipo("Periferico");
        dispositivo2.setActivo(false);

        System.out.println("Dispositivo 1");
        System.out.println("Nombre: " + dispositivo1.getNombre());
        System.out.println("Tipo: " + dispositivo1.getTipo());
        System.out.println("Activo: " + dispositivo1.isActivo());

        System.out.println();

        System.out.println("Dispositivo 2");
        System.out.println("Nombre: " + dispositivo2.getNombre());
        System.out.println("Tipo: " + dispositivo2.getTipo());
        System.out.println("Activo: " + dispositivo2.isActivo());

        dispositivo2.activar();
        System.out.println("Estado del mouse despues de activar: "
                + dispositivo2.isActivo());

        dispositivo1.desactivar();
        System.out.println("Estado de la laptop despues de desactivar: "
                + dispositivo1.isActivo());
    }
}
