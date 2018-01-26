package ejer_factura;

import com.alberto.mostrar.Mostrar;

public class Metodos {

    Ventas[] lVentas={new Ventas("3", "rprof3", 2f), new Ventas("2", "rprof2", 5f), new Ventas("1", "rprof1", 7f)};
    Producto[] lProducto={new Producto("rprof2", "patacas", "rprec2"), new Producto("rprof1", "peras", "rprec1"), new Producto("rprof3", "uvas", "rprec3")};
    Precio[] lPrecio={new Precio("rprec1", 2f), new Precio("rprec2", 5f), new Precio("rprec3", 5f)};

    public void VisualizarTablas() {
        Mostrar.mostrarlObject(lVentas);
        System.out.println("\n");
        Mostrar.mostrarlObject(lProducto);
        System.out.println("\n");
        Mostrar.mostrarlObject(lPrecio);
        System.out.println("\n");
    }

    public void BuscarVentas() {
        System.out.print("NV"+" Nombre producto "+"Precio total\n");
        for (int i=0; i<lVentas.length; i++) {
            for (int j=0; j<lProducto.length; j++) {
                for (int k=0; k<lPrecio.length; k++) {
                    if (lVentas[i].getRefProductos().equalsIgnoreCase(lProducto[j].getRefProductos())) {
                        if (lProducto[j].getRefPrecio().equalsIgnoreCase(lPrecio[k].getRefPrecio())) {
                            System.out.println(lVentas[i].getNv()+"       "+lProducto[j].getNome()+"       "+(lPrecio[k].getPrecio()+lVentas[i].getCantidade()));
                        }

                    }
                }

            }
        }

    }

}
