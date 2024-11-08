package free2;

import java.util.Scanner;

public class Mimi {
    public static void main(String[] args) {
        final int NumEmpleados = 10;
        Empleado[] empleados = new Empleado[NumEmpleados];

        // Crear empleados
        for (int i = 0; i < NumEmpleados; i++) {
            empleados[i] = new Empleado(i + 1);
        }

        // Mostrar lista de empleados
        System.out.println("Lista de Empleados:");
        mostrarEmpleados(empleados);

        // Buscar un empleado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de identificación del empleado que desea ver: ");
        int idBuscado = scanner.nextInt();
        buscarEmpleado(empleados, idBuscado);

        // Ordenar y mostrar empleados por nombre
        ordenarPorNombre(empleados);
        System.out.println("\nLista de Empleados ordenada por nombre:");
        mostrarEmpleados(empleados);
    }

    static void mostrarEmpleados(Empleado[] empleados) {
        for (Empleado empleado : empleados) {
            empleado.mostrar();
        }
    }

    static void buscarEmpleado(Empleado[] empleados, int idBuscado) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion() == idBuscado) {
                System.out.println("Empleado encontrado:");
                empleado.mostrar();
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    static void ordenarPorNombre(Empleado[] empleados) {
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - i - 1; j++) {
                if (empleados[j].getNombre().compareTo(empleados[j + 1].getNombre()) > 0) {
                	Empleado temp = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = temp;
                }
            }
        }
    }
}
