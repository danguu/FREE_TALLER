package free2;

import java.util.Random;

public class Estudiante {
    private static final Random random = new Random();
    private int codigo;
    private String nombre;
    private double[] notas;
    private double definitiva;

    public Estudiante(int id) {
        this.codigo = 1 + random.nextInt(100); 
        this.nombre = "Estudiante" + id;
        this.notas = new double[4];
        for (int i = 0; i < 3; i++) {
            this.notas[i] = 1.0 + (random.nextDouble() * 4.0);
        }
        this.definitiva = calcularDefinitiva(this.notas[0], this.notas[1], this.notas[2]);
        this.notas[3] = this.definitiva;
    }

    private double calcularDefinitiva(double nota1, double nota2, double nota3) {
        return Math.round((nota1 * 0.3 + nota2 * 0.3 + nota3 * 0.4) * 100.0) / 100.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void mostrar() {
        System.out.println("Código: " + codigo + ", Nombre: " + nombre + ", Definitiva: " + definitiva);
    }
}


