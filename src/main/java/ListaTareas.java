import java.util.*;

public class ListaTareas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> tareas = new LinkedHashSet<>();

        // 1. Pedir al usuario que ingrese una lista de tareas
        System.out.print("Ingrese la cantidad de tareas: ");
        int cantidadTareas = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        for (int i = 0; i < cantidadTareas; i++) {
            System.out.print("Ingrese una tarea: ");
            String tarea = scanner.nextLine();
            tareas.add(tarea);
        }

        // 3. Mostrar la lista de tareas en el orden ingresado
        System.out.println("\nLista de tareas:");
        for (String tarea : tareas) {
            System.out.println(tarea);
        }

        // 4. Permitir eliminar una tarea
        System.out.print("\nIngrese la tarea que desea eliminar: ");
        String tareaEliminar = scanner.nextLine();
        if (tareas.remove(tareaEliminar)) {
            System.out.println("Tarea eliminada exitosamente.");
        } else {
            System.out.println("Tarea no encontrada.");
        }

        // Mostrar la lista actualizada
        System.out.println("\nLista actualizada de tareas:");
        for (String tarea : tareas) {
            System.out.println(tarea);
        }

        scanner.close();
    }
}
