package free2;

import java.util.Random;

public class Empleado {
    private static final Random random = new Random();
    private int identificacion;
    private String nombre;
    private double sueldoBasico;
    private double deducciones;
    private double netoAPagar;

    public Empleado(int id) {
        this.identificacion = 1000 + random.nextInt(9000); // Generar ID aleatorio entre 1000 y 9999
        this.nombre = "Empleado" + id;
        this.sueldoBasico = 1000 + (random.nextDouble() * 4000); // Sueldo básico entre 1000 y 5000
        this.deducciones = 100 + (random.nextDouble() * 900); // Deducciones entre 100 y 1000
        this.netoAPagar = calcularNetoAPagar();
    }

    private double calcularNetoAPagar() {
        return Math.round((sueldoBasico - deducciones) * 100.0) / 100.0;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getDeducciones() {
        return deducciones;
    }

    public double getNetoAPagar() {
        return netoAPagar;
    }

    public void mostrar() {
        System.out.println("ID: " + identificacion + ", Nombre: " + nombre + 
                           ", Sueldo Básico: " + sueldoBasico + ", Deducciones: " + deducciones + 
                           ", Neto a Pagar: " + netoAPagar);
    }
}
