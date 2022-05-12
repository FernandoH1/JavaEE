package Boutique.io;

import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class Indumentaria extends Producto implements Serializable {

    private String talle;
    private String tipo;
    private String categoria;
    private String sexo;
    private int stock;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Indumentaria{" + "talle=" + talle + ", tipo=" + tipo + ", categoria=" + categoria + ", sexo=" + sexo + ", stock=" + stock + ", color=" + color + '}';
    }

}
