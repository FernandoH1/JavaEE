package Boutique.io;

import java.util.ArrayList;


public class ProductosCombo {
  private Combo combo;
  private ArrayList<CombosProductosProductos> combosProductosProductos; 
  
  public ProductosCombo(Combo combo, ArrayList<CombosProductosProductos> combosProductosProductos){
      this.combo = combo;
      this.combosProductosProductos = combosProductosProductos;
  }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public ArrayList<CombosProductosProductos> getcombosProductosProductos() {
        return combosProductosProductos;
    }

    public void setComboProductos(ArrayList<CombosProductosProductos> comboProductos) {
        this.combosProductosProductos = comboProductos;
    }

   
  
}


