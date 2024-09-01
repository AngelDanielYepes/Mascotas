
package clase;


public class Productos {
    String nombres, id,tipo;
    long Precio;

    public Productos(String nombres, String id, String tipo, long Precio) {
        this.nombres = nombres;
        this.id = id;
        this.tipo = tipo;
        this.Precio = Precio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getPrecio() {
        return Precio;
    }

    public void setPrecio(long Precio) {
        this.Precio = Precio;
    }

   
    
}
