package free2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int EstNum = 10;
        Estudiante[] estudiantes = new Estudiante[EstNum];

        for (int i = 0; i < EstNum; i++) {
            estudiantes[i] = new Estudiante(i + 1);
        }

        System.out.println("Lista de Estudiantes:");
        mostrarEstudiantes(estudiantes);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el código del estudiante que desea ver: ");
        int codigoBuscado = scanner.nextInt();
        buscarEstudiante(estudiantes, codigoBuscado);

        ordenarPorDefinitiva(estudiantes);
        System.out.println("\nLista de Estudiantes ordenada por nota definitiva:");
        mostrarEstudiantes(estudiantes);
    }

    static void mostrarEstudiantes(Estudiante[] estudiantes) {
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar();
        }
    }

    static void buscarEstudiante(Estudiante[] estudiantes, int codigoBuscado) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCodigo() == codigoBuscado) {
                System.out.println("Estudiante encontrado:");
                estudiante.mostrar();
                return;
            }
        }
        System.out.println("Estudiante no encontrado.");
    }

    static void ordenarPorDefinitiva(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length - 1; i++) {
            for (int j = 0; j < estudiantes.length - i - 1; j++) {
                if (estudiantes[j].getDefinitiva() < estudiantes[j + 1].getDefinitiva()) {
                    Estudiante temp = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = temp;
                }
            }
        }
    }
}
