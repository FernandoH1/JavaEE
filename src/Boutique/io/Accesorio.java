package Boutique.io;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
public class Accesorio extends Producto implements Serializable {

    private String color;
    private String textura;
    private int stock;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return textura;
    }  
}
