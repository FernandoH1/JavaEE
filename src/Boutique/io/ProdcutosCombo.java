package Boutique.io;

import java.util.ArrayList;


public class ProdcutosCombo {
  private Combo combo;
  private ArrayList<Producto> productos; 
  
  public ProdcutosCombo(Combo combo, ArrayList<Producto> productos){
      this.combo = combo;
      this.productos = productos;
  }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
  
}


