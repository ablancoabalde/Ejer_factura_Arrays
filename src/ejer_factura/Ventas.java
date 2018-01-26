
package ejer_factura;

public class Ventas {
    private String nv;
    private String refProductos;
    private float cantidade;

    public Ventas(String nv, String refProductos, float cantidade) {
        this.nv=nv;
        this.refProductos=refProductos;
        this.cantidade=cantidade;
    }

    public String getNv() {
        return nv;
    }

    public void setNv(String nv) {
        this.nv=nv;
    }

    public String getRefProductos() {
        return refProductos;
    }

    public void setRefProductos(String refProductos) {
        this.refProductos=refProductos;
    }

    public float getCantidade() {
        return cantidade;
    }

    public void setCantidade(float cantidade) {
        this.cantidade=cantidade;
    }

    @Override
    public String toString() {
        return "nv="+nv+", refProductos="+refProductos+", cantidade="+cantidade;
    }
    
    
    
    
}
