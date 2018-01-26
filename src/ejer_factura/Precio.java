
package ejer_factura;

public class Precio {
    private String refPrecio;
    private float precio;

    public Precio(String refPrecio, float precio) {
        this.refPrecio=refPrecio;
        this.precio=precio;
    }

    public String getRefPrecio() {
        return refPrecio;
    }

    public void setRefPrecio(String refPrecio) {
        this.refPrecio=refPrecio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "refPrecio="+refPrecio+", precio="+precio;
    }
    
    
    
}
