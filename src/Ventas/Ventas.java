package Ventas;
import com.gm.ventas.*;
public class Ventas {
    public static void main(String[] args) {
        // creamos un Objeto de tipo Producto

        Producto producto1 = new Producto("camisa", 50);
        Producto producto2 = new Producto("pantalon",100);
        Producto producto3 = new Producto("jeans",70);

        // creamos un Objeto de Tipo Orden
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        // imprimir la orden
        orden1.mostrarorden();
    }
}
