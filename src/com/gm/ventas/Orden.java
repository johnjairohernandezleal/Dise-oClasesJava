package com.gm.ventas;

public class Orden {
    private  int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        productos = new Producto[MAX_PRODUCTOS];
    }

    public  void  agregarProducto(Producto producto){
        // si los productos agregados no superan el maximo de productos
        // el nuevo producto al arreglo

        if (contadorProductos < MAX_PRODUCTOS){
            //// agregamos el nuevo producto al arreglo

            productos[contadorProductos++]= producto;
        }
        else {
            System.out.println("se ha superado el maximo de productos :" + MAX_PRODUCTOS);
        }
    }


    public  double calcularTotal(){
        double total = 0;
        for (int i = 0; i <contadorProductos ; i++) {
            total += productos[i].getPrecio(); // total = toal + productos[i].getPrecio()

        }
        return total;
    }

    public void mostrarorden(){

        System.out.println("Orden #:" + idOrden);
        System.out.println("Total de la Orden: $" + calcularTotal());
        System.out.println(" los Prodcutos en la Orden");
        for (int i = 0; i <contadorProductos ; i++) {

            System.out.println(productos[i]);

        }
    }
}
