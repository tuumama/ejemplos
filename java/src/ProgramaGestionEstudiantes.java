import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Estudiante {
    String nombre;
    String apellido;
    double promedio;

    public Estudiante(String nombre, String apellido, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }
}

public class ProgramaGestionEstudiantes {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Consultar estudiantes");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Promedio: ");
                    double promedio = scanner.nextDouble();
                    estudiantes.add(new Estudiante(nombre, apellido, promedio));
                    System.out.println("Estudiante agregado.");
                    break;
                case 2:
                    System.out.print("Ingrese el índice del estudiante a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    if (indiceEliminar >= 0 && indiceEliminar < estudiantes.size()) {
                        estudiantes.remove(indiceEliminar);
                        System.out.println("Estudiante eliminado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de estudiantes:");
                    for (int i = 0; i < estudiantes.size(); i++) {
                        Estudiante estudiante = estudiantes.get(i);
                        System.out.println(i + ". " + estudiante.nombre + " " + estudiante.apellido + " - Promedio: " + estudiante.promedio);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
