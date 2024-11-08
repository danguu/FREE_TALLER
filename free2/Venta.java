package free2;

import java.util.Random;

public class Venta {
    // Atributos
    private int codigoProducto;
    private int cantidadVendida;
    private double precioVenta;

    // Constructor
    public Venta(int codigoProducto, int cantidadVendida, double precioVenta) {
        this.codigoProducto = codigoProducto;
        this.cantidadVendida = cantidadVendida;
        this.precioVenta = precioVenta;
    }

    // Getters
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    // Generar una venta aleatoria
    public static Venta generarVentaAleatoria() {
        Random random = new Random();
        int codigoProducto = 1000 + random.nextInt(9000); // Código aleatorio entre 1000 y 9999
        int cantidadVendida = 1 + random.nextInt(10); // Cantidad aleatoria entre 1 y 10
        double precioVenta = 10 + (random.nextDouble() * 90); // Precio aleatorio entre 10 y 100

        return new Venta(codigoProducto, cantidadVendida, precioVenta);
    }

    // Mostrar datos de la venta
    public void mostrarVenta() {
        System.out.printf("Código: %d, Cantidad: %d, Precio: %.2f%n", 
                          this.codigoProducto, this.cantidadVendida, this.precioVenta);
    }
}

