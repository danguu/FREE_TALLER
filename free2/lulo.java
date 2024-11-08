package free2;

public class lulo {
	    static final int NUM_VENTAS = 10;
	    static final int NUM_PRODUCTOS = 5;

	    public static void main(String[] args) {
	        // Datos de las ventas
	        Venta[] ventas = new Venta[NUM_VENTAS];
	        
	        // Generar ventas aleatorias
	        for (int i = 0; i < NUM_VENTAS; i++) {
	            ventas[i] = Venta.generarVentaAleatoria();
	        }

	        // Mostrar ventas iniciales
	        System.out.println("Ventas Iniciales:");
	        mostrarVentas(ventas);

	        // Totalizar ventas por producto
	        int[] totalCantidad = new int[NUM_PRODUCTOS];
	        double[] totalPrecio = new double[NUM_PRODUCTOS];
	        int[] totalVentas = new int[NUM_PRODUCTOS];

	        for (int i = 0; i < NUM_VENTAS; i++) {
	            int producto = ventas[i].getCodigoProducto() % NUM_PRODUCTOS; // Agrupar por código de producto
	            totalCantidad[producto] += ventas[i].getCantidadVendida();
	            totalPrecio[producto] += ventas[i].getPrecioVenta() * ventas[i].getCantidadVendida(); // Acumular venta total por producto
	            totalVentas[producto]++;
	        }

	        // Mostrar lista totalizada por producto
	        System.out.println("\nVentas Totalizadas por Producto:");
	        mostrarVentasTotalizadas(totalCantidad, totalPrecio, totalVentas);

	        // Calcular total general
	        int totalProductosVendidos = 0;
	        double totalVentasGenerales = 0;
	        for (int i = 0; i < NUM_PRODUCTOS; i++) {
	            totalProductosVendidos += totalCantidad[i];
	            totalVentasGenerales += totalPrecio[i];
	        }

	        System.out.printf("\nTotal General de Productos Vendidos: %d\n", totalProductosVendidos);
	        System.out.printf("Total General de Ventas: %.2f\n", totalVentasGenerales);
	    }

	    // Función para mostrar los datos de ventas iniciales
	    static void mostrarVentas(Venta[] ventas) {
	        for (int i = 0; i < ventas.length; i++) {
	            ventas[i].mostrarVenta();
	        }
	    }

	    // Función para mostrar los datos totalizados por producto
	    static void mostrarVentasTotalizadas(int[] totalCantidad, double[] totalPrecio, int[] totalVentas) {
	        for (int i = 0; i < NUM_PRODUCTOS; i++) {
	            if (totalVentas[i] > 0) {
	                double promedioPrecio = totalPrecio[i] / totalCantidad[i];
	                System.out.printf("Producto %d - Total Cantidad: %d, Total Ventas: %.2f, Promedio Precio: %.2f%n", 
	                                  i, totalCantidad[i], totalPrecio[i], promedioPrecio);
	            }
	        }
	    }
	}
