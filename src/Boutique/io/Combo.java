package Boutique.io;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Combo implements Serializable {

    @OneToMany(mappedBy = "combo")
    private List<CombosProducto> combosProductos;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidad;
    
    @OneToMany(mappedBy = "combo")
    private List<DetalleDeVenta> detalleDeVenta; 
    
    public Long getId() {
        return id;
    }

    public List<CombosProducto> getCombosProductos() {
        return combosProductos;
    }

    public void setCombosProductos(List<CombosProducto> combosProductos) {
        this.combosProductos = combosProductos;
    }
    

    public List<DetalleDeVenta> getDetalleDeVenta() {
        return detalleDeVenta;
    }

    public void setDetalleDeVenta(List<DetalleDeVenta> detalleDeVenta) {
        this.detalleDeVenta = detalleDeVenta;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Combo)) {
            return false;
        }
        Combo other = (Combo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }


}
