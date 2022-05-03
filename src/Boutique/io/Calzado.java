package Boutique.io;

import java.io.Serializable;
import javax.persistence.Entity;


@Entity
public class Calzado extends Producto implements Serializable {

    private String talle;
    private String tipo;
    private String color;
    private int stock;


    public String getTalle() {
        return talle;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Calzado{" + "talle=" + talle + ", tipo=" + tipo + ", color=" + color + ", stock=" + stock + '}';
    }
    
}
