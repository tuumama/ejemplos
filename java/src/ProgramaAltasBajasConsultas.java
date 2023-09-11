import java.util.ArrayList;
import java.util.Scanner;

class Registro {
    String matricula;
    String nombre;
    String apellido;
    double promedioCalificacion;

    public Registro(String matricula, String nombre, String apellido, double promedioCalificacion) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedioCalificacion = promedioCalificacion;
    }
}

public class ProgramaAltasBajasConsultas {
    public static void main(String[] args) {
        ArrayList<Registro> registros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Alta | 2. Baja | 3. Consulta | 4. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Matrícula: ");
                    String matricula = scanner.next();
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Apellido: ");
                    String apellido = scanner.next();
                    System.out.print("Promedio de Calificación: ");
                    double promedioCalificacion = scanner.nextDouble();
                    registros.add(new Registro(matricula, nombre, apellido, promedioCalificacion));
                    System.out.println("Registro agregado.");
                    break;

                case 2:
                    System.out.print("Índice a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < registros.size()) {
                        registros.remove(indice);
                        System.out.println("Registro eliminado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    System.out.println("Registros:");
                    for (int i = 0; i < registros.size(); i++) {
                        Registro reg = registros.get(i);
                        System.out.println("Índice: " + i + " | Matrícula: " + reg.matricula + " | Nombre: " + reg.nombre
                                + " | Apellido: " + reg.apellido + " | Promedio de Calificación: "
                                + reg.promedioCalificacion);
                    }
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
