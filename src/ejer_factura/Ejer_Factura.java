
package ejer_factura;



public class Ejer_Factura {

//Programa con Array que se chame comercio.
//Ventas(3 atributos:Numero da venta, Referencia producto, Cantidade)
//Valores(Varios rexistros): NV: 1,2,3. RP:ref1,ref2,ref3. C:7,9,4.
//Clase aparte que se chama Producto(3 atributos: ReferenciaProd, NomeProd,Ref.Precio.)
//ReferenciaProd:rpro3,rpro1,rpro2. Nome:Uvas,Peras,Patatas. Ref.Precio:rpre1,rpre3,rpre2.
//Otra clase Precio(2 atributos:reprecio,precio).
//reprecio:rpre2,rpre1,rpre3. precio:2,5,7.
//(FACTURA)Clase master: NV:1,2,3.... Nome(Relacionar segundo a referencia). PrezoTotal(Relacionar segundo a referencia).
    public static void main(String[] args) {
        Metodos obx = new Metodos();
        
        obx.VisualizarTablas();
        obx.BuscarVentas();
        
        
    }
    
}
