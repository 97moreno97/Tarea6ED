
package tarea6ed;

/** Clase donde creamos  métodos que llamaremos en el main*/

public class Tarea6Clase {
    /** Método para calcular descuento del producto.
     * @param precioProducto. Parametro de entrada de tipo double
     * @param numProducts. Parametro de entrada de tipo int.
     */

    public void aplicarDescuento(double precioProducto, int numProducts){     
        double Total;
    if(numProducts>3)
        precioProducto-=5;
            if (numProducts!=0){
        final double multiplicadorPrecioProducto1 = 0.8;
            Total = TotalProductoDistinto0(precioProducto, multiplicadorPrecioProducto1);
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
        }else {
            Total = TotalProductoDistinto0(precioProducto, 0.95);
            System.out.println("El total a pagar es:"+Total);
            System.out.println("Enviado");
           
        }   
             System.out.println("Vamos a ver si salta la regla 103 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }
/** Método para calcular el total si el numerop de productos es dintinto de 0
     * @param precioProducto. Parametro de entrada de tipo double
     * @param multiplicadorPrecioProducto1. Parametro de entrada de tipo final double.
     * @return el valor del producto multiplicado por su constante 0.8
     */
    private double TotalProductoDistinto0(double precioProducto, final double multiplicadorPrecioProducto1) {
        double Total;
        Total = precioProducto*multiplicadorPrecioProducto1;
        return Total;
    }
}
