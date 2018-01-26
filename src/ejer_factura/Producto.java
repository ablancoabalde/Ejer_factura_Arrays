package ejer_factura;

public class Producto {
    private String refProductos;
    private String nome;
    private String refPrecio;

    public Producto(String refProductos, String nome, String refPrecio) {
        this.refProductos=refProductos;
        this.nome=nome;
        this.refPrecio=refPrecio;
    }

    public String getRefProductos() {
        return refProductos;
    }

    public void setRefProductos(String refProductos) {
        this.refProductos=refProductos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getRefPrecio() {
        return refPrecio;
    }

    public void setRefPrecio(String refPrecio) {
        this.refPrecio=refPrecio;
    }

    @Override
    public String toString() {
        return "refProductos="+refProductos+", nome="+nome+", refPrecio="+refPrecio;
    }
    
    
    
}
